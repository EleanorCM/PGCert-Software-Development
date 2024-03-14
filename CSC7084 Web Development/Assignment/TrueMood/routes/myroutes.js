const express = require("express");
const controller = require("../controllers/controller");
const {isAuth} = require('./../middleware/auth');
const {check} = require('express-validator');

const router = express.Router();

router.get("/", controller.getLanding);
router.get("/editsnapshot/:id", isAuth, controller.getEditSnapshot);
router.get('/deletesnapshot/:id', isAuth, controller.getDeleteSnapshot);
router.get('/insights', isAuth, controller.getInsights);
router.get('/insights/filter', isAuth, controller.getFilterSnapshots);
router.get('/login', controller.postLogin);
router.get('/logout', controller.getLogout)
router.get('/createsnapshot', isAuth, controller.getCreateSnapshot);
router.get('/signup', controller.getSignUp);
router.get("*", controller.get404);

router.post("/createsnapshot", isAuth, controller.postCreateSnapshot);
router.post("/editsnapshot/:id", isAuth, controller.postEditSnapshot);
router.post('/login',
    check('email')
    .isEmail()
    .withMessage('Invalid email address'),
     controller.postLogin);
router.post('/signup', 
    check('email')
    .isEmail()
    .withMessage('Invalid email address')
    ,controller.postSignUp);
router.post("*", controller.get404);

module.exports = router;
