# Rest API

### 5 GET APIs with different response type

```
https://api.sampleapis.com/avatar/characters
```

200

```
[
    {
        "id": 1,
        "name": "Aang",
        "image": "https://static.wikia.nocookie.net/avatar/images/a/ae/Aang_at_Jasmine_Dragon.png/revision/latest/scale-to-width-down/333?cb=20130612174003",
        "bio": {
            "alternativeNames": [
                "Aangy (by Koko)",
                "Kuzon (while at the Fire Nation school)",
                "Twinkle Toes (by Toph)",
                "Sweetie (by Katara)"
            ],
            "nationality": "Southern Air Temple",
            "ethnicity": "Air Nomad",
            "ages": [
                "112 (biologically 12) in Avatar: The Last Airbender[3]",
                "113-114 (biologically 13-14) in The Promise trilogy[4]",
                "114-115 (biologically 14-15) in The Search and The Rift trilogies[5]",
                "165 (biologically 66) at death[6]"
            ],
            "born": "12 BG",
            "died": [
                "Spring 100 AG (revived by Katara using spirit water)",
                "153 AG"
            ]
        },
        "physicalDescription": {
            "gender": "Male",
            "eyeColor": "Gray",
            "hairColor": "Dark brown (typically shaved)",
            "skinColor": "Light"
        },
        "personalInformation": {
            "loveInterst": "Katara (wife)",
            "allies": [
                "Appa",
                "Katara",
                "Kya",
                "Suki",
                "Kuzon",
                "lion turtle",
                "all Avatars"
            ],
            "enemies": [
                "Azula",
                "Ozai",
                "the Dai Li"
            ],
            "weaponsOfChoice": [
                "The elements",
                "glider staff"
            ],
            "fightingStyles": [
                "Airbending",
                "waterbending (Northern and Southern style)",
                "earthbending (Chu Gar Praying Mantis Kung Fu)",
                "firebending (Dancing Dragon)",
                "energybending"
            ]
        },
        "politicalInformation": {
            "profession": [
                "Air Nomad culture teacher",
                "Airbending instructor",
                "Avatar",
                "Monk"
            ],
            "position": [
                "Co-founder of the United Republic of Nations",
                "Fully realized Avatar"
            ],
            "predecessor": "Roku (as the Avatar)",
            "successor": "Korra (as the Avatar)",
            "affiliations": [
                "Air Acolytes",
                "Air Nomads",
                "Air Scouts (formerly)",
                "Team Avatar"
            ]
        },
        "chronologicalInformation": {
            "firstAppearance": "\"The Boy in the Iceberg\"",
            "lastAppearance": [
                "Imbalance Part Three (chronological)",
                "\"Darkness Falls\"(as spirit)",
                "\"Remembrances\"(flashback only)"
            ],
            "voicedBy": [
                "Zach Tyler Eisen (in Avatar: The Last Airbender)",
                "Mitchel Musso (unaired pilot episode)",
                "D. B. Sweeney (in The Legend of Korra)"
            ]
        }
    }
]
```


```
https://api.sampleapis.com/avatar/charac
```

500

```
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<title>Error</title>
</head>

<body>
	<pre>TypeError: Cannot read properties of undefined (reading &#39;0&#39;)<br> &nbsp; &nbsp;at verifyData (/home/damian/code/SampleAPIs/server/utils/verifyData.js:8:47)<br> &nbsp; &nbsp;at Layer.handle [as handle_request] (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/layer.js:95:5)<br> &nbsp; &nbsp;at trim_prefix (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:328:13)<br> &nbsp; &nbsp;at /home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:286:9<br> &nbsp; &nbsp;at Function.process_params (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:346:12)<br> &nbsp; &nbsp;at next (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:280:10)<br> &nbsp; &nbsp;at Function.handle (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:175:3)<br> &nbsp; &nbsp;at router (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:47:12)<br> &nbsp; &nbsp;at Layer.handle [as handle_request] (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/layer.js:95:5)<br> &nbsp; &nbsp;at trim_prefix (/home/damian/code/SampleAPIs/server/node_modules/express/lib/router/index.js:328:13)</pre>
</body>

</html>
```

```
https://api.sampleapis.com/aaa/charac
```

404

```
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<title>Error</title>
</head>

<body>
	<pre>Cannot GET /aaa/charac</pre>
</body>

</html>
```


```
https://user1234:somereallylongpassword@api.bonsai.io/clusters/
```

401

```
{
    "errors": [
        "The API token is missing, inactive or does not exist.",
        "Authentication failed.",
        "Could not authenticate your request.",
        "This request has failed authentication. Please read the docs or email us at support@bonsai.io."
    ],
    "status": 401
}
```

```
https://ir-example.mir.prod.reco.microsoft.com/Reco/V1.0/New?modeling=adw&Count=5&SkipItems=3
```
401

No response body

### 5 Post API with json request body, please also paste the response here

```
https://dummy.restapiexample.com/api/v1/create

{
    "username":"abc",
    "password":"abc"
}
```

200

```
{
    "status": "success",
    "data": {
        "id": 4886
    },
    "message": "Successfully! Record has been added."
}
```

```
https://dummy.restapiexample.com/api/v10/create

{
    "username":"abc",
    "password":"abc"
}
```

405

```
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8" />
	<meta name="robots" content="noindex,nofollow,noarchive" />
	<title>An Error Occurred: Method Not Allowed</title>
	<style>
		body {
			background-color: #fff;
			color: #222;
			font: 16px/1.5 -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
			margin: 0;
		}

		.container {
			margin: 30px;
			max-width: 600px;
		}

		h1 {
			color: #dc3545;
			font-size: 24px;
		}

		h2 {
			font-size: 18px;
		}
	</style>
</head>

<body>
	<div class="container">
		<h1>Oops! An Error Occurred</h1>
		<h2>The server returned a "405 Method Not Allowed".</h2>

		<p>
			Something is broken. Please let us know what you were doing when this error occurred.
			We will fix it as soon as possible. Sorry for any inconvenience caused.
		</p>
	</div>
</body>

</html>
```

```
https://dummy.restapiexample.com/api/v1/

{
    "username":"abc",
    "password":"abc"
}
```

404

```
{
    "message": "Error Occured! Page Not found, contact rstapi2example@gmail.com"
}
```

```
https://api.github.com/app/installations/1/access_tokens

{
    "repository":"Hello-World",
    "permissions":{
        "issues":"write",
        "contents":"read"
    }
}
```
401
```
{
    "message": "A JSON web token could not be decoded",
    "documentation_url": "https://docs.github.com/rest"
}
```

```
httpstat.us/500

{
  "key": "vvvvv"
}
```
500

```
500 Internal Server Error
```

### 3 PUT API with json request body, please also paste the response here

```
PUT https://www.googleapis.com/upload/youtube/v3/captions

PUT https://www.googleapis.com/youtube/v3/channels

PUT https://www.googleapis.com/youtube/v3/channelSections
```


### 2 DELETE API with json request body, please also paste the response here

```
DELETE https://www.googleapis.com/youtube/v3/captions

DELETE https://www.googleapis.com/youtube/v3/channelSections
```

## API design

### 1 Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.

YouTube channel sections

```
GET https://www.googleapis.com/youtube/v3/channelSections
POST https://www.googleapis.com/youtube/v3/channelSections
PUT https://www.googleapis.com/youtube/v3/channelSections
DELETE https://www.googleapis.com/youtube/v3/channelSections
```

YouTube videos

```
GET https://www.googleapis.com/youtube/v3/videos
POST https://www.googleapis.com/upload/youtube/v3/videos
PUT https://www.googleapis.com/youtube/v3/videos
POST https://www.googleapis.com/youtube/v3/videos/rate
GET https://www.googleapis.com/youtube/v3/videos/getRating
POST https://www.googleapis.com/youtube/v3/videos/reportAbuse
DELETE https://www.googleapis.com/youtube/v3/videos
```

## 2. Design a collection of APIs for a Blog Website,please specify GET POST PUT DELETE

get blog list ``` GET /api/v1/{userId}```
get specific blog ``` GET /api/v1/{userId}/{blogId}/```
publish blog ```POST /api/v1/{userId}```
update blog ```POST /api/v1/{userId}/{blogId}```
delete blog ```DELETE /api/v1/{userId}/{blogId}```

## 1. find the customer's payments,like credit card 1,credit card 2,paypal,ApplePay.

```
api/v1/{customerId}/payments
```

## 2. Find the customer's history orders from 10/10/2022 to 10/24/2022

```
api/v1/{customerId}/orders?startDate="10-10-2022"&endDate="10-24-2022"
```
## 3.find the customer's delievery  addresses

```
api/v1/{customerId}/address
```
## 4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?

```
api/v1/{customerId}/payments/default
api/v1/{customerId}/address/default
```

# database

## SQL

### 1. Create oms_company_address table

```sql
create table oms_company_address(
	id bigint primary key,
    address_name varchar(200),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200)
  )
  
```

### 2. Insert some random data to oms_company_address table

```sql
insert into oms_company_address values(1,'AAACompany', 0, 0, 'AAA', '0123456789', 'California', 'SF', 'Bay', 'W 1st street');
insert into oms_company_address values(2,'BBBCompany', 1, 1, 'BBB', '1123456789', 'California', 'SF', 'Bay', 'W 2st street');
insert into oms_company_address values(3,'CCCCompany', 1, 0, 'CCC', '2123456789', 'California', 'SLO', 'Bay', 'W 3st street');
insert into oms_company_address values(4,'DDDCompany', 1, 1, 'DDD', '3123456789', 'California', 'LA', 'Bay', 'W 4st street');
insert into oms_company_address values(5,'EEECompany', 1, 0, 'EEE', '4123456789', 'California', 'SD', 'Bay', 'W 5st street');
insert into oms_company_address values(6,'FFFCompany', 0, 1, 'FFF', '5123456789', 'California', 'Reding', 'Bay', 'W 6st street');
insert into oms_company_address values(7,'GGGCompany', 0, 1, 'GGG', '6123456789', 'California', 'SF', 'Bay', 'W 7st street');
```

### 3. Write a SQL query to fetch all data from oms_company_address `table

```sql
SELECT * from oms_company_address
```

### 4. Write a SQL query to fetch top 3 records from oms_company_address table

```sql
SELECT * from oms_company_address limit 3
```

### 5. Update oms_company_address table to set all phone to 666-6666-8888

```sql
update oms_company_address
set phone="666-6666-8888"
```

### 6. Delete one entry from oms_company_address table

```sql
delete from oms_company_address
where id=0
```

## MongoDB

### 1. Create test DB

```
use test
```

### 2. Create oms_company_address collection (method: createCollection() )

```
db.createCollection("oms_company_address")
```

### 3. Insert few random entries to oms_company_address collection (method: insert() )

```
db.oms_company_address.insert([
    {
        id: 1,
        address_name: 'AAACompany',
        send_status: 0,
        receive_status: 0,
        name: 'AAA',
        phone: '0123456789',
        province: 'California',
        city: 'SF',
        region: 'Bay',
        detail_address: 'W 1st street'
    },
    {
        id: 2,
        address_name: 'BBBCompany',
        send_status: 1,
        receive_status: 1,
        name: 'BBB',
        phone: '1123456789',
        province: 'California',
        city: 'SF',
        region: 'Bay',
        detail_address: 'W 2st street'
    },
    {
        id: 3,
        address_name: 'CCCCompany',
        send_status: 1,
        receive_status: 0,
        name: 'CCC',
        phone: '2123456789',
        province: 'California',
        city: 'SLO',
        region: 'Bay',
        detail_address: 'W 3st street'
    },
    {
        id: 4,
        address_name: 'DDDCompany',
        send_status: 1,
        receive_status: 0,
        name: 'DDD',
        phone: '3123456789',
        province: 'California',
        city: 'LA',
        region: 'Bay',
        detail_address: 'W 4st street'
    }
    ])
```

### 4. Read one entry from oms_company_address collection (method: find() )

```
db.oms_company_address.find({"id": 1})
```

### 5. Read all entries from oms_company_address collection (method: find() )

```
db.oms_company_address.find()
```

### 6. Update one entry from oms_company_address collection (method:update() or save()) 

```
db.oms_company_address.update({"id": 1}, {address_name: "abcabc"})
```

### 7. Remove one entry from oms_company_address collection (method:remove())

```
db.oms_company_address.remove({"id": 2})
```
