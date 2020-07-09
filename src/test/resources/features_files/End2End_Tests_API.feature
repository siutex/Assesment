Feature: End to End Tests Rates API
Scenario: User check Latest Foreign Exchange rates exists
  Given User use "Good" path for Rates API
  When API is available for user
  Then Automated test check response "success code"
Scenario: User check Latest Foreign Exchange rates gives right response
  Given User use "Good" path for Rates API
  When API is available for user
  Then Automated test check "latest" response content
Scenario: User check Latest Foreign Exchange with wrong path
  Given User use "Wrong" path for Rates API
  When API is available for user
  Then Automated test check response "wrong code"
Scenario: User check Rates API for Specific date exists
  Given User use "2010-01-12" as date for request
  When API is available for user
  Then Automated test check response "success code"
Scenario: User check Rates API for Specific date gives right response
  Given User use "2010-01-12" as date for request
  When API is available for user
  Then Automated test check "specific date" response content
Scenario: User check Rates API for future date gives right response
  Given User use "2030-01-12" as date for request
  When API is available for user
  Then Automated test check "future" response content

