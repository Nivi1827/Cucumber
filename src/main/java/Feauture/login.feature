Feature: Validating demo automation
@Reg
Scenario: Register 
Given launch the url
When click on signin
When Enter Email as "nivi1827@gmail.com"
When Enter Password as "91598498"
Then click Enter button
#Then close the browser