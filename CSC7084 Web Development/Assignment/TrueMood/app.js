const express = require("express");
const dotenv = require('dotenv').config({path: './config.env'});
const morgan = require("morgan");
const router = require("./routes/myroutes");
const cookieParser = require('cookie-parser');
const session = require('express-session');
const path = require("path");

const app = express();

app.use(morgan("tiny"));
app.use(express.static(path.join(__dirname, "public/css/")));
app.use(express.urlencoded({ extended: true }));
app.use(cookieParser());
app.use(session({
  secret: 'thesecretstring12345',
  resave: false,
  saveUninitialized: false
}))
//app.use(cookieParser);

app.use("/", router);
//app.use("*", myrouter);

app.set("view engine", "ejs");

app.listen(process.env.PORT, (err) => {
  if (err) return console.log(err);
  console.log(`Express webserver listening on port ${process.env.PORT}`);
});

/*

To create a cookie from a url parameter:

const filter = req.query.paramname;
res.cookie('paramname', filter);

*/