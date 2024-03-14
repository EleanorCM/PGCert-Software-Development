const conn = require("../util/dbconn");

exports.getCreateSnapshot = async (req, res) => {
  const selectSQL = "SELECT * FROM snapshots ORDER BY id DESC LIMIT 15";
  try {
    const [rows, fielddata] = await conn.query(selectSQL);
    res.status(200);
    res.json({
      status: "success",
      message: rows.length + " records returned",
      result: rows,
    });
  } catch (error) {
    console.log(error);
    res.status(500);
    res.json({
      status: "failure",
      message: error,
    });
  }
};

exports.postCreateSnapshot = async (req, res) => {
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

  const insertSQL =
    "INSERT INTO snapshots (comments, happiness_rating, surprise_rating, contempt_rating, sadness_rating, fear_rating, disgust_rating, anger_rating) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

  try {
    const [rows, fielddata] = await conn.query(insertSQL, vals);
    res.status(201);
    res.json({
      status: 'success',
      message: 'Added record with ID: '+rows.insertId
    })
  } catch (err) {
    res.status(500);
    res.json({
      status: 'failure',
      message: err
    })
  }
};

// GET /editsnapshot/:id
exports.getEditSnapshot = async (req, res) => {
  const { id } = req.params;
  console.log(id);
  const selectSQL = `SELECT * FROM snapshots WHERE id = ${id}`;

  try {
    const [rows, fielddata] = await conn.query(selectSQL);
    res.status(200);
    res.json({
      status: "success",
      message: rows.length + " records returned",
      result: rows,
    });
  } catch (error) {
    console.log(error);
    res.status(500);
    res.json({
      status: "failure",
      message: error,
    });
  }
};

// POST /editsnapshot/:id
exports.postEditSnapshot = async (req, res) => {
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

  try {
    const { id } = req.params;
    const updateSQL = `UPDATE snapshots SET comments = ?, happiness_rating = ?, surprise_rating = ?, contempt_rating = ?, sadness_rating = ?, fear_rating = ?, disgust_rating = ?, anger_rating = ? WHERE id = ${id}`;
    const [rows, fielddata] = await conn.query(updateSQL, vals);
    res.status(201);
    res.json({
      status: "success",
      message: rows.length + "ID of altered record: "+id,
    });
  } catch (error) {
    console.log(error);
    res.status(500);
    res.json({
      status: "failure",
      message: error,
    });
  }
};

// GET /deletesnapshot/:id
exports.getDeleteSnapshot = async (req, res) => {
  const { id } = req.params;
  const deleteSQL = `DELETE FROM snapshots WHERE id = ${id}`;

  try {
    const [rows, fielddata] = await conn.query(deleteSQL, id);
    res.status(200);
    res.json({
      status: "success",
      message: "ID of deleted record: " + id,
      deleted: rows,
    });
  } catch (error) {
    console.log(error);
    res.status(500);
    res.json({
      status: "failure",
      message: error,
    });
  }
};

// GET /
exports.getSnapshots = async (req, res) => {
  const selectSQL = "SELECT * FROM snapshots ORDER BY id DESC";

  try {
    const [rows, fielddata] = await conn.query(selectSQL);
    res.status(200).json({
      status: "success",
      message: `Selected all records`,
      result: rows
    });
  } catch (error) {
    res.status(500).json({
      status: "failure",
      message: err,
    });
  }
};

//GET /insights/filter
exports.getFilterSnapshots = async (req, res) => {
  const filter = req.query.emotion;
  res.cookie("filter", filter, { maxAge: 36000 });
  //req.session.emotion = filter;
  const selectSQL = `SELECT datetime, comments, ${filter} FROM snapshots ORDER BY id DESC`;
  try {
    const [rows, fielddata] = await conn.query(selectSQL);
    console.log(rows);
    res.status(200).render("insights", { data: rows });
  } catch (err) {
    console.log(err);
  }
};

exports.checkUser = async (req, res) => {
  const { email, userpass } = req.body;

  const vals = [ email, userpass ];

  const checkUserSQL = `SELECT * FROM users us
                        WHERE us.email = ? AND us.password = ?`;

  try {
    const [rows, fielddata] = await conn.query(checkUserSQL, vals);
    res.status(201);
    res.json({
      status: "success",
      result: rows
    });
  } catch (error) {
    console.log(error);
    res.status(501);
    res.json({
      status: "failure",
      message: error
    });
  }
};

exports.postSignUp = async (req,res) => {
  const {newuserfirstname, newuserlastname, newuseremail, newuserpassword} = req.body;
  const vals = [newuserfirstname, newuserlastname, newuseremail, newuserpassword];
  const insertSQL = `INSERT INTO users (first_name, last_name, email, password) VALUES (?,?,?,?);`
    try {
      const [rows, fielddata] = await conn.query(insertSQL,vals);
      console.log(rows);
      res.status(201);
      res.json({
        status: "success",
        result: rows
      });
    } catch (error) {
      console.error(error);
      res.status(501);
      res.json({
        status: "failure",
        message: error
    })
  }
}