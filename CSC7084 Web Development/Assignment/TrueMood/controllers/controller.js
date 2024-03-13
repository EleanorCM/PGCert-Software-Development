const axios = require('axios');
const path = require("path");

// TODO reconfigure controller to use axios API call methods
// TODO: Error responses in Axios
// TODO: Pagination?
// TODO: Navbar
// TODO: Flexbox
// TODO Chart.js
// TODO landing page conditional rendering
// FIXME Login

exports.getLanding = async (req, res) => {
  const endpoint = 'https://zenquotes.io/api/random/[your_key]';
  const response = await axios.get(endpoint);
  
  try {
    if (response.status === 200) {
      console.log(response.data);
      res.status(200).render('landingpage', {data:response.data});
    } else {
      console.log(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.log(error);
  }
}

exports.getCreateSnapshot = async (req, res) => {
  const selectSQL = "SELECT * FROM snapshots ORDER BY id DESC LIMIT 15";
  try {
    const [rows, fielddata] = await conn.query(selectSQL);
    //console.log(rows);
    res.status(200).render("createsnapshot", { data: rows });
  } catch (err) {
    console.log(err);
  }
};

exports.postCreateSnapshot = async (req, res) => {
  const {
    datetime, comments, happiness_rating, surprise_rating, contempt_rating, sadness_rating, fear_rating, disgust_rating, anger_rating} = req.body;

  const vals = [comments, happiness_rating, surprise_rating, contempt_rating, sadness_rating, fear_rating, disgust_rating, anger_rating];

  res.cookie('comments', comments);

//   let MySQLDate = datetime;
// // split the date with ‘-’ and ‘:’
// let date = MySQLDate.split( /[- :]/ );
// //subtract 1 from the month as it takes the value between 0 to 11.
// date[1]--;
// // pass all parts of the date as a parameter. 
// let jsDate = new Date( ...date );

  const insertSQL =
    "INSERT INTO snapshots (comments, happiness_rating, surprise_rating, contempt_rating, sadness_rating, fear_rating, disgust_rating, anger_rating) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

  try {
    const [rows, fielddata] = await conn.query(insertSQL, vals);
    res.redirect("/");
  } catch (err) {
    console.log(err)  
  }
}

exports.getEditSnapshot = async (req,res) => {
  const { id } = req.params;
  const selectSQL = `SELECT * FROM snapshots WHERE id = ${id}`;

  try {
    const [ rows, fielddata ] = await conn.query(selectSQL);
    res.status(200).render('editsnapshot', {result: rows});
  } catch (error) {
    console.log(error);
  }
}

exports.postEditSnapshot = async (req, res) => {
  const {datetime, comments, happiness_rating, surprise_rating, contempt_rating, sadness_rating, fear_rating, disgust_rating, anger_rating} = req.body;

  const vals = [comments, happiness_rating, surprise_rating, contempt_rating, sadness_rating, fear_rating, disgust_rating, anger_rating];

  try {
    const { id } = req.params;
  const updateSQL = `UPDATE snapshots SET comments = ?, happiness_rating = ?, surprise_rating = ?, contempt_rating = ?, sadness_rating = ?, fear_rating = ?, disgust_rating = ?, anger_rating = ? WHERE id = ${id}`;
  const [rows, fielddata ] = await conn.query(updateSQL, vals);
  res.redirect('/');
  } catch (error) {
    console.log(error);
  }
}

exports.getDeleteSnapshot = async (req,res) => {
  const { id } = req.params;
  const deleteSQL = `DELETE FROM snapshots WHERE id = ${id}`;

  try {
    const [rows, fielddata] = await conn.query(deleteSQL, id);
    res.redirect('/');
  } catch (error) {
    console.log(error);
  }
}
exports.getInsights = async (req, res) => {
  let filter;
  if (req.cookie) {
    filter = req.cookie.emotion;
  }

  let userinfo = {};
  const { isloggedin, plan } = req.session;
  console.log('user data from session: '+ isloggedin, plan); 

  userinfo = { loggedin: isloggedin, userplan: plan};
  const selectSQL = "SELECT * FROM snapshots ORDER BY id DESC";
  const endpoint = 'http://localhost:3002/insights';
  
try {
  res.status(200).render("insights", { data: data, filter: filter, user: userinfo });
} catch (error) {
  
}
}

exports.getMakeAPICall = async (req,res) => {
  const endpoint = 'http://localhost:3002/insights';
  const response = await axios.get(endpoint);
  try {
    if (response.status === 200) {
      console.log(response.data);
      return response.data;
    } else {
      console.log(`Response status code: ${response.status}`);
    }
  } catch (error) {
    console.log(error);
  }
}

exports.postMakeAPICall = async (req,res) => {
  const endpoint = 'http://localhost:3002/'
  const mydata = {
    "comments": "First tomato harvest this evening",
    "happiness_rating": 10,
    "surprise_rating": 4,
    "contempt_rating": 1,
    "sadness_rating": 2,
    "anger_rating": 1,
    "fear_rating": 1,
    "disgust_rating": 1
  }

  try {
    const response = await axios.post(endpoint, mydata);
    console.log(`Response status code: ${response.status}`);
    console.log(response.data);
  } catch (error) {
    console.log(error);
  }
  
}

exports.getFilterSnapshots = async (req, res) => {
  const filter = req.query.emotion;
  res.cookie('filter', filter, { maxAge: 36000 });
  //req.session.emotion = filter;
  const selectSQL = `SELECT datetime, comments, ${filter} FROM snapshots ORDER BY id DESC`;
  try {
    const [rows, fielddata] = await conn.query(selectSQL);
    console.log(rows);
    res.status(200).render("insights", { data: rows });
  } catch (err) {
    console.log(err);
  }
}

exports.getLogin = async (req, res) => {
  res.status(200).render('login');
};

exports.postLogin = async (req, res) => {
  const {email, userpass } = req.body;
  const vals = [ email, userpass ];
  console.log(vals);
    // const userPlanIdSQL = `SELECT us.plan_id FROM users us WHERE us.email = '${email}'`
    // const userPlanTypeSQL = `SELECT up.plan_type FROM user_plan up WHERE up.id = (${userPlanIdSQL})`
    // const [rows, fielddata] = await conn.query(userPlanTypeSQL);

    const checkUserSQL = `SELECT * FROM users us
                          INNER JOIN user_plan up
                          ON us.plan_id = up.id
                          WHERE us.email = ? AND us.password = ?`

  try {
    const [rows, fielddata] = await conn.query(checkUserSQL, vals);

    const numrows = rows.length;

    console.log("numrows: " + numrows);

    if (numrows > 0) {
      console.log(rows);
      const session = req.session;
      session.isloggedin = true;
      session.plan = rows[0].plan_type;
      console.log(session);
      res.redirect('/');
    } else {
      res.redirect('/login')

    }
  } catch (error) {
   console.log(error);   
  }
}

exports.get404 = (req, res) => {
  res.status(404).sendFile(path.join(__dirname, "../html/404.html"));
};

// Zenquotes API
exports.getRandomQuote = (req,res) => {

}