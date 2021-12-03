Feature: Add User Test
	Tester - chirag - chirag@knowledgetransfer.com
	
	@regression @chirag
	Scenario:  verify User Can Able To Add new user
			Given user open website
			When user enter valid credentials
			Then verify login successful
			When user click on users link from user management under admin tab
			And click on add button
			Then verify save user details page is displayed
			When user fill all user details 
			And click on save button
			Then verify user is on user listing page
			And verify user can see new user in the user list