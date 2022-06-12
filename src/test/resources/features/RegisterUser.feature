@RegisterUser
Feature: Register new User

@SmokeTest @ValidRegistration
Scenario Outline: Validate that a user can register with the mandatory fields

Given User is on Landing Page
And we validate the page title as "<LandingPageTitle>"
Then we click on my account 
And we click on Register
And we validate the page title as "<RegisterPageTitle>"
When we fill the mandatory fields "<FirstName>" "<LastName>" "<EMail>" "<Password>"  
And we check the privacy policy checkbox
And we click the continue button



Examples:

|LandingPageTitle|RegisterPageTitle|FirstName|LastName|EMail|Password|AccountPageTitle|
|Your Store|Register Account|Rohit|Raj|rohittaj456@gmail.com|pqw21231|My Account|