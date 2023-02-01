## 1. Create oms_company_address table
```mysql:
    CREATE TABLE comp_address(
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
    );
```
## 2. Insert some random data to oms_company_address table

 ```mysql:
    INSERT INTO comp_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
    VALUES
    (1, "Headquarters", 1, 1, "John Doe", "555-555-5555", "California", "San Francisco", "Downtown", "123 Main St"),
    (2, "Branch Office", 1, 0, "Jane Doe", "555-555-5556", "New York", "New York", "Midtown", "456 Broadway Ave"),
    (3, "Delivery Center", 0, 1, "Bob Smith", "555-555-5557", "Texas", "Houston", "Energy Corridor", "789 1st St");

 ```

## 3. Write a SQL query to fetch all data from oms_company_address `table
    SELECT FROM 

## 4. Write a SQL query to fetch top 3 records from oms_company_address table
    SELECT * FROM comp_address;

## 5. Update oms_company_address table to set all phone to 666-6666-8888
    UPDATE comp_address SET phone = '666-6666-8888'

## 6. Delete one entry from oms_company_address table
    DELETE FROM comp_address WHERE id = 3;

### Non-SQL

## 1. Create `test`DB 
    use testDB

## 2. Create `oms_company_address` collection  (method: createCollection() )
    db.createCollection("oms_company_address")

## 3. Insert few random entries to `oms_company_address` collection (method: insert() )
    db.oms_company_address.insert([
    {address_name: "Headquarters", name: "John Doe", phone: "555-555-5555", province: "California", city: "San Francisco", region: "Downtown", detail_address: "123 Main St"},
    {address_name: "Branch Office", name: "Jane Doe", phone: "555-555-5556", province: "New York", city: "New York", region: "Midtown", detail_address: "456 Broadway Ave"},
    {address_name: "Delivery Center", name: "Bob Smith", phone: "555-555-5557", province: "Texas", city: "Houston", region: "Energy Corridor", detail_address: "789 1st St"}
    ])

## 4. Read one entry from `oms_company_address` collection (method: find() )
    db.oms_company_address.findOne()

## 5. Read all entries from `oms_company_address` collection (method: find() )
    db.oms_company_address.find()

## 6. Update one entry from `oms_company_address`collection (method: update() or save() )
    db.oms_company_address.update(
        {address_name: "Headquarters"},
        {$set: {phone: "666-6666-8888"}}
    )

## 7. Remove one entry from `oms_company_address`collection (method: remove() )
## 8. (Optional) You can also try to create other tables that listed above
    db.oms_company_address.remove(
    {address_name: "Delivery Center"}
    )


(Optional) You can also try to create other tables that listed above