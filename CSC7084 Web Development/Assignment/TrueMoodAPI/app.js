const express = require('express');
const morgan = require('morgan');
const router = require('./routes/apiroutes');

const app = express();

app.use(morgan('tiny'));
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use('/', router);



module.exports = app;