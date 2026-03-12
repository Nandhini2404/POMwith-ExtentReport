Feature: CreateLead Functionality of Leaftaps application

@Regression @Sanity
Scenario Outline: CreateLead with Different set of Data

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be navigate to home page
When Click on the crmsfa link
And Click on the Leads link
And Click Click on the Create Lead
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the Lastname as <lastname>
When Click on the CreateLead button
Then Lead should be craeted

Examples:
|companyname|firstname|lastname|
|TestLeaf|Vineeth|Rajendran|
|Qeagle|Saranya|S|
