# Explain @Transactional

Our application only support DEBIT card payment.

## url
`/api/v1/orders`

## Json

### Correct Request Body
```json
{
    "order": {
        "totalQuantity": 3,
        "totalPrice": "2000",
        "shoppingCartId": 2
    },
    "payment": {
        "type": "DEBIT",
        "cardName": "Chuwa America",
        "cardNumber": "666 6666 6666 6666",
        "expiryYear": 2027,
        "expiryMonth": 7,
        "cvc": 123
    }
}
```

### Wrong Request body (Credit card)
```json
{
    "order": {
        "totalQuantity": 3,
        "totalPrice": "2000",
        "shoppingCartId": 2
    },
    "payment": {
        "type": "CREDIT",
        "cardName": "Chuwa America",
        "cardNumber": "666 6666 6666 6666",
        "expiryYear": 2027,
        "expiryMonth": 7,
        "cvc": 123
    }
}
```

## Test
In service layer, 
* you can comment off @Transactional then try to send request with wrong request body.
* or add @Transactional back then try to send request with wrong request body.
check the difference in the database, figure out @Transactional help us rollback when failing.

## Questions
* What is @Transactional? what is its role?
* When do we use it?
