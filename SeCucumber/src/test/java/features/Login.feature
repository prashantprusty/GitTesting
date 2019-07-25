Feature: Application Login

Scenario Outline: Home page default login
Given User is on the landing page
When User login with valid <UName> and <Pass>
Then Login sucessfull
And Home page displayed
Then Verify home info

Examples:
|UName 		| Pass  |
|user1		| password1 |
|user2		| password2 |
|user3		| password3 |
|user4		| password4 |

