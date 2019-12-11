$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Validating demo automation",
  "description": "",
  "id": "validating-demo-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register",
  "description": "",
  "id": "validating-demo-automation;register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on signin",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter Email as \"nivi1827@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter Password as \"91598498\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click Enter button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnitions.launch()"
});
formatter.result({
  "duration": 7112859938,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnitions.Signin()"
});
formatter.result({
  "duration": 1705241784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nivi1827@gmail.com",
      "offset": 16
    }
  ],
  "location": "Stepdefnitions.Email(String)"
});
formatter.result({
  "duration": 224029602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "91598498",
      "offset": 19
    }
  ],
  "location": "Stepdefnitions.Passwd(String)"
});
formatter.result({
  "duration": 115201533,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefnitions.close()"
});
formatter.result({
  "duration": 70624008,
  "status": "passed"
});
});