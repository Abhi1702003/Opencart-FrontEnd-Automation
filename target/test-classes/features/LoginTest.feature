@LoginUser
Feature: Login Test

Scenario Outline: Validate that a user can login with the valid credentials

Given User is on Landing Page
And we validate the page title as "<LandingPageTitle>"
Then we click on my account 
And we click on Login
And we validate the page title as "<LoginPageTitle>"
When we enter the valid email "<email>"  
When we enter the valid password "<password>"  
And we click the continue button to Login

Examples:

|LandingPageTitle|LoginPageTitle|email|password|
|Your Store|Account Login|amitkumar123@gmail.com|po121231|