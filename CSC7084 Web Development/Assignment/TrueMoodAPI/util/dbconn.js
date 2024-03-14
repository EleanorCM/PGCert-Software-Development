const mysql = require("mysql2/promise");
const dotenv = require('dotenv').config({path: './config.env'});

// Connection Object
const mydb = mysql.createPool({
  host: process.env.DB_HOST,
  user: process.env.DB_USER,
  password: process.env.DB_PASS,
  database: process.env.DB_NAME,
  port: process.env.DB_PORT
});

module.exports = mydb;