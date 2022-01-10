var para = /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

var email =/[\w._%+-]+@[\w.-]+\.[a-zA-Z]{2,4}/;

var url = /(https?:\/\/)?([\da-z\.-]+)\.([a-z\.]{2,6})([\/\w \.-]*)*\/?/;

var phone = /[0-9 -()+]+$/;

var nlines = /.*^(?!.*www.*).*(\n)/gm;
console.log(para.test("\S"));

let notBinary = /[^01]/;
console.log(notBinary.test("1100100010100110"));