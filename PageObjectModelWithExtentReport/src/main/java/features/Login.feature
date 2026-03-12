Feature: Login function of Leaftaps Application

@Smoke
Scenario: Login with valid credentials
And Enter the username as 'Demosalesmanger'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be navigate to home page

@Sanity @Smoke
Scenario: Login with invalid credentials
And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on the Login button
But It throws error message