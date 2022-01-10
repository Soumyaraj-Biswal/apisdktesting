const regex = new RegExp('https:\\/\\/\\w*\\.\\w*.*', 'g');

  const fs = require('fs');
  let template = 'const SchematicsV1 = require("@ibm-cloud/ibm-schematics/schematics/v1");\n' + 
  'const { IamAuthenticator } = require("ibm-cloud-sdk-core/auth");\n' +
  'const authenticator = new IamAuthenticator({\n'+
  '  apikey: "GHs-zwjtM97FAUxXe3IiC3fKQr5JLjGnMo7O_Fbr7TTm",\n' +
  '});\n' +
  'const schematicsService = new SchematicsV1({\n' +
    'authenticator,\n'+
    'serviceUrl: "https://schematics.cloud.ibm.com"\n'+
  '});\n'+
  'function apiname() {\n'+
    'fs = require("fs");\n'+
    'fs.readFile("./outputdir/node/examples/schematics.v1.test.js" , function (err,data) {\n'+
    ' if (err) {\n'+
    '     return console.log(err);\n'+
    '   }\n'+
    '   console.log(data);\n'+
    '});'
//  'var regex = /\s/g;\n'+
//  'var regex = new RegExp("\s", "g"); \n'+
  '}\n'+
  'apiname();\n';

  fs.writeFile('./outputdir/node/examples/apitesttemplate.js', template , function (err,data) {
     if (err) {
         return console.log(err);
       }
       console.log('File Created Successfully');
});