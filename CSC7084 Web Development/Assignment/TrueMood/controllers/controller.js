const axios = require("axios");
const path = require("path");
const conn = require("../util/dbconn");
const {validationResult} = require('express-validator');
const session = require("express-session");
const { time } = require("console");

// TODO Data accessible to only that user 
// TODO SET of contextual triggers (separate triggers table)
//TODO Summary visualisation over time (insights)

// TODO Chart.js
// TODO: Pagination?
// TODO: Flexbox


exports.getLanding = async (req, res) => {
  if (req.session.isloggedin) {
    res.redirect('/createsnapshot');
  }
  const response = await axios.get(
    "https://zenquotes.io/api/random/[your_key]"
  );

  try {
    if (response.status === 200) {
      console.log(response.data);
      res.status(200).render("landingpage", { data: response.data, error:null });
    } else {
      console.log(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.log(error);
  }
};

exports.getCreateSnapshot = async (req, res) => {
  const u_id = req.session.userid;
  const response = await axios.get(`http://localhost:3002/latestsnapshots?userid=${u_id}`);
  const rows = response.data.result;

  try {
    if (response.status === 200) {
      console.log(`Response status code: ${response.status}`);
      res.status(200).render("createsnapshot", { data: rows });
    } else {
      console.log(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.error("Error fetching snapshots from the API:", error);
    res.status(500).render("error", {
      message: "An error occurred while fetching snapshots",
    });
  }
};

exports.postCreateSnapshot = async (req, res) => {
  const user_id = req.session.userid;
  const {
    datetime,
    comments,
    happiness_rating,
    surprise_rating,
    contempt_rating,
    sadness_rating,
    fear_rating,
    disgust_rating,
    anger_rating,
  } = req.body;

  const vals = [
    user_id,
    comments,
    happiness_rating,
    surprise_rating,
    contempt_rating,
    sadness_rating,
    fear_rating,
    disgust_rating,
    anger_rating,
  ];

  const response = await axios.post("http://localhost:3002/", {
    user_id,
    comments,
    happiness_rating,
    surprise_rating,
    contempt_rating,
    sadness_rating,
    fear_rating,
    disgust_rating,
    anger_rating,
  });

  try {
    if (response.status === 201) {
      console.log("RESPONSE BODY:");
      console.log(response);
      res.cookie("comments", comments);
      console.log(`Response status code: ${response.status}`);
      res.redirect("/createsnapshot");
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.error("Error creating snapshot:", error);
    res.status(501).render("error", {
      message: "An error occurred while creating the snapshot",
    });
  }
};

exports.getEditSnapshot = async (req, res) => {
  const { id } = req.params;
  const response = await axios.get(`http://localhost:3002/editsnapshot/${id}`);
  const rows = response.data.result;
  console.log(rows);

  try {
    if (response.status === 200) {
      console.log(`Response status code: ${response.status}`);
      res.status(200).render("editsnapshot", { result: rows });
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.error("Error fetching snapshot:", error);
    res.status(500).render("error", {
      message: "An error occurred while fetching snapshot with ID " + id,
    });
  }
};

exports.postEditSnapshot = async (req, res) => {
  console.log(req.session);

  const {
    datetime,
    comments,
    happiness_rating,
    surprise_rating,
    contempt_rating,
    sadness_rating,
    fear_rating,
    disgust_rating,
    anger_rating,
  } = req.body;

  const vals = [
    comments,
    happiness_rating,
    surprise_rating,
    contempt_rating,
    sadness_rating,
    fear_rating,
    disgust_rating,
    anger_rating,
  ];

  const { id } = req.params;
  const response = await axios.post(
    `http://localhost:3002/editsnapshot/${id}`,
    {
      comments,
      happiness_rating,
      surprise_rating,
      contempt_rating,
      sadness_rating,
      fear_rating,
      disgust_rating,
      anger_rating,
    }
  );

  try {
    if (response.status === 201) {
      console.log(`Response status code: ${response.status}`);
      res.redirect("/createsnapshot");
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.error("Error updating snapshot:", error);
    res.status(501).render("error", {
      message: "An error occurred while updating snapshot with ID " + id,
    });
  }
};

exports.getDeleteSnapshot = async (req, res) => {
  const { id } = req.params;
  const response = await axios.get(
    `http://localhost:3002/deletesnapshot/${id}`
  );

  try {
    if (response.status <= 300) {
      console.log(`Response status code: ${response.status}`);
      res.redirect("/createsnapshot");
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.log(error);
  }
};

exports.getInsights = async (req, res) => {
  const filter = req.query.emotion;
  const userid = req.session.userid;
  const response = await axios.get(`http://localhost:3002/insights?userid=${userid}`);
  const rows = response.data.result;


  try {
    if (response.status === 200) {
      console.log(`Response status code: ${response.status}`);
      let ratings = [];
      let timestamps = [];

      rows.forEach(row => {
        const rating = row[filter];
        ratings.push(rating);
        timestamps.push(row.datetime);
      });
      console.log("RATINGS");
      console.log(ratings);
      console.log("TIMESTAMPS");
      console.log(timestamps);
      res.render("insights", { rows: rows, userid: userid, ratings: ratings, timestamps: timestamps });
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.log(error);
  }

};

exports.getFilterSnapshots = async (req, res) => {
  const filter = req.query.emotion;
  const userid = req.session.userid;
  res.cookie("emotion", filter, { maxAge: 60000 });
  const response = await axios.get(`http://localhost:3002/insights/filter?userid=${userid}&filter=${filter}`);
  const rows = response.data.result;
  console.log("FILTER INSIGHTS ROWS: ");
  console.log(rows);
  res.cookie("emotion", filter, { maxAge: 60000 });

  try {
    if (response.status === 200) {
      console.log(`Response status code: ${response.status}`);
      
      let ratings = [];
      let timestamps = [];

      rows.forEach(row => {
        const rating = row[filter];
        ratings.push(rating);
        timestamps.push(row.datetime);
      });
      console.log("RATINGS");
      console.log(ratings);
      console.log("TIMESTAMPS");
      console.log(timestamps);

      res.render("insights", { rows: rows, userid:userid, filter:response.filter, ratings: ratings, timestamps:timestamps });
      console.log(req.session);
    } else {
      console.error(`Response status code: ${response.status}`);
    }
    console.log(rows);
  } catch (err) {
    console.log(err);
  }
};

exports.postLogin = async (req, res) => {
const errors = validationResult(req);
console.log(errors.array);
if (!errors.isEmpty()) {
  return res.status(422).render('landingpage', (errors.array()[0].msg))
}

  const { email, userpass } = req.body;
  const vals = [email, userpass];
  console.log(vals);

  const response = await axios.post("http://localhost:3002/login", {
    email: email,
    userpass: userpass
  });
  const rows = response.data.result;
  const userid = rows[0].id;

  try {
    if (response.status === 201) {
      console.log(`Response status code: ${response.status}`);
      console.log("RESPONSE " + response);
      console.log("ROWS" + rows);
      const numrows = rows.length;
      console.log("numrows: " + numrows);

      if (numrows > 0) {
        // Adding properties to session
        const session = req.session;
        session.isloggedin = true;
        session.email = email;
        session.userid = userid;
        let original_route = session.route;
        console.log(`postLogin: orig_route: ${original_route}`);
        console.log(session);
        if (!original_route) {
          original_route = "/createsnapshot";
        }
        res.redirect(`${original_route}`);
      } else {
        res.redirect("/");
      }
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.error("Error logging in:", error);
    res.status(501).render("error", {
      message:
        "An error occurred while trying to log in with the supplied credentials",
    });
  }
};

exports.getSignUp = async (req,res) => {
  try {
      res.status(200).render("signup");
  } catch (error) {
    console.log(error);
  }
}

exports.postSignUp = async (req,res) => {
  const {newuserfirstname, newuserlastname, newuseremail, newuserpassword} = req.body;

  const response = await axios.post('http://localhost:3002/signup' , {
    newuserfirstname:newuserfirstname, 
    newuserlastname:newuserlastname, 
    newuseremail:newuseremail, 
    newuserpassword:newuserpassword})

  rows = response.data.result;

  try {
    if(response.status === 201) {
      console.log(`Response status code: ${response.status}`);
      res.redirect('/createsnapshot');
    } else {
      console.error(`Response status code: ${response.status}`);
    }
  } catch (error) {
    
  }

}

exports.getLogout = (req, res) => {
  req.session.destroy(() => {
    res.redirect("/");
  });
};

exports.get404 = (req, res) => {
  res.status(404).sendFile(path.join(__dirname, "../html/404.html"));
};
