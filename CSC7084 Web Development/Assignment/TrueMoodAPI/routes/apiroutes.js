const express = require('express');
const controller = require('./../controllers/APIcontroller');
const router = express.Router();

router.get('/', controller.getCreateSnapshot);
router.get('/editsnapshot/:id', controller.getEditSnapshot);
router.get('/deletesnapshot/:id', controller.getDeleteSnapshot);
router.get('/insights/', controller.getSnapshots);
router.get('/insights/filter', controller.getFilterSnapshots);
router.get('/login',controller.checkUser);

router.post('/', controller.postCreateSnapshot);
router.post('/editsnapshot/:id', controller.postEditSnapshot);
router.post('/login', controller.checkUser);
router.post('/signup', controller.postSignUp);
module.exports = router;