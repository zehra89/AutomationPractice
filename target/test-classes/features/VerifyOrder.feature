Feature: Verify t-shirt Order

Scenario: A user verifies the tshirt order before paying

Given The user is at Homepage
When he clicks on the t-shirt menu
And he adds a t-shirt to his cart
Then he should see it in the Shopping Summary