# API DESIGN
### Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范
## PayPal:

Payment experiences
+ Create web experience profile
```
  POST
  /v1/payment-experience/web-profiles
```
+ list web experience profiles
```agsl
GET
/v1/payment-experience/web-profiles
```
+ Update web experience profile
```agsl
PUT
/v1/payment-experience/web-profiles/{id}
```

+ Partially update web experience profile
```
PATCH
/v1/payment-experience/web-profiles/{id}
```
+ Show web experience profile details by ID
```agsl
GET
/v1/payment-experience/web-profiles/{id}
```

+ Delete web experience profile
```agsl
DELETE
/v1/payment-experience/web-profiles/{id}
```

## Twitter:
Likes

Allows a user or authenticated user ID to unlike a Tweet.
```agsl
DELETE /2/users/:id/likes/:tweet_id
```

Tweets liked by a user
```agsl
 GET /2/users/:id/liked_tweets
```
Users who have liked a Tweet
```agsl
GET /2/tweets/:id/liking_users
```


### Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE


POST

post a new blog

```/v1/blog-list/blog/{title}```

register a new blogger

```/v1/blogger-list/{name}```

post a new comment

```/v1/blogger-list/blog/comment/{contents}```

GET

get blog by title

```/v1/blog-list/blog/{title}```

get specific blogger

```/v1/blogger-list/{name}```

PUT

update blogger's profile

```/v1/blogger-list/{profile}```

update a comment of a blog

```/v1/blogs/comments/{contents}```

DELETE

delete a blog

```/v1/blog-list/blog/{title}```


### Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
+  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay

```/v1/customers/{customersID}/payments```

+ Find the customer's history orders from 10/10/2022 to 10/24/2022

```/v1/customers/{customersID}/orders/date?start=1010/2022&&end=10/24/2022```

+ find the customer's delivery addresses

```/v1/customers/{customersID}/delivery-addresses```

+ If I also want to get customer's default payment and default delivery address, what kind of the API (URL) should be?

```/v1/customers/{customersID}/payments/default```
```/v1/customers/{customersID}/delivery-address/default```

