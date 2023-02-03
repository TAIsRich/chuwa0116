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

/v1/blog-list/blog/{title}


