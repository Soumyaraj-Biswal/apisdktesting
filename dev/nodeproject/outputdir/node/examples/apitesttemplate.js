const SchematicsV1 = require("@ibm-cloud/ibm-schematics/schematics/v1");
const { IamAuthenticator } = require("ibm-cloud-sdk-core/auth");
const authenticator = new IamAuthenticator({
  apikey: "GHs-zwjtM97FAUxXe3IiC3fKQr5JLjGnMo7O_Fbr7TTm",
});
const schematicsService = new SchematicsV1({
authenticator,
serviceUrl: "https://schematics.cloud.ibm.com"
});
function apiname() {
fs = require("fs");
fs.readFile("./outputdir/node/examples/schematics.v1.test.js" , function (err,data) {
 if (err) {
     return console.log(err);
   }
   console.log(data);
});