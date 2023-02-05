## Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.
GET https://youtube.googleapis.com/youtube/v3/channels?part=snippet%2CcontentDetails%2Cstatistics&id=UC_x5XG1OV2P6uZZ5FSM9Ttw&key=[YOUR_API_KEY] HTTP/1.1
## Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
### find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
`GET https://{link}/v1/{userid}/credit-cards`
`GET https://{link}/v1/{userid}/credit-cards/CARD-7LT50814996943336KESEVWA`
### Find the customer's history orders from 10/10/2022 to 10/24/2022
`
GET https://{link}/v1/{userid}?start_date=10/10/2022&end_date=10/24/2022: `
### find the customer's delievery addresses
`GET /addresses/{userid}`
### If I also want to get customer's default payment and default delievery address, what kind of the API (URL)  should be?
`GET https://{link}/v1/{userid}/credit-cards/defaults`

### explain how the below annotaitons specify the table in database?
- name: type = varchar(255)  default value = 'John Snow'
- studentName: title = 'STUDENT_NAME' nullable, unique, size=50
### What is the default column names of the table in database for @Column?
- firstName 
- operatingSystem
### What are the layers in springboot application? what is the role of each layer?
+ presentation layer: controller
+ business layer: service
+ persistence layer: dao
+ database layer: database
### Describe the flow in all layers if an API is called by postman
client->controller->service->dao->database->service->controller->client
### What is the application.properties? do you know application.yml?
- application. properties file is used to write the application-related property into that file.
- application.yml is also a files to write application-related property, but in YAML
