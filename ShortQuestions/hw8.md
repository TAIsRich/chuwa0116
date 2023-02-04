#### 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.
GET https://api.twitter.com/1.1/statuses/user_timeline.json?screen_name={screen_name}    

POST https://api.twitter.com/1.1/statuses/update.json?status={tweet_text}     

GET https://maps.googleapis.com/maps/api/geocode/json?address={address}&key={api_key}     

#### 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE       
GET /posts - Retrieve a list of all posts.     
GET /posts/{id} - Retrieve a specific post through its id.    
POST /posts - Create a new post.     
PUT /posts/{id} - Update a specific post through its id.     
DELETE /posts/{id} - Delete a specific post through its id.     

#### 3. Find the customer's payments, like credit card 1, credit card 2, paypal, ApplePay.   
GET /payments/{customer_id}   

#### 4. Find the customer's history orders from 10/10/2022 to 10/24/2022    
GET /orders/{customer_id}?start_date=10/10/2022&end_date=10/24/2022     

#### 5. Find the customer's delievery addresses    
GET /addresses/{customer_id}   

#### 6. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?    
GET /customers/{customer_id}/defaults

