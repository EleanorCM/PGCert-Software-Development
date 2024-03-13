const express = require("express");
const router = express.Router();
const controller = require("../controllers/controller");

// Paths must be in order:

router.get("/", controller.getCreateSnapshot);
router.get("/editsnapshot/:id", controller.getEditSnapshot);
router.get('/deletesnapshot/:id', controller.getDeleteSnapshot);
router.get('/insights', controller.getInsights);
router.get('/insights/filter', controller.getFilterSnapshots);
router.get('/login', controller.getLogin);
router.get('/landingpage', controller.getLanding);
router.get('/makeapicall', controller.getMakeAPICall);
router.get("*", controller.get404);

router.post("/createsnapshot", controller.postCreateSnapshot);
router.post("/editsnapshot/:id", controller.postEditSnapshot);
router.post('/login', controller.postLogin);
router.post('/makeapicall', controller.postMakeAPICall);
router.post("*", controller.get404);

module.exports = router;
