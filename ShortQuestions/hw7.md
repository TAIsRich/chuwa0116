MYSQL
1.  Create  oms_company_address  table 

    ```
        create table oms_company_address
    (
        id bigint,
        address_name varchar(200),
        send_status int,
        receive_status int,
        name varchar(64),
        phone varchar(64),
        province varchar(64),
        city varchar(64),
        region varchar(64),
        detail_address varchar(200),
        primary key (id)
    );
    ```

2.  Insert some random data to  oms_company_address  table

    ```
    insert into oms_company_address values(1,'ss',0,0,'Tom','111','CA','San Jose','CA','se');
    insert into oms_company_address values(2,'aa',0,0,'Jack','222','CA','NYC','NY','sa');
    insert into oms_company_address values(3,'bb',0,0,'Wen','33','CA','San Jose','CA','csa');
    insert into oms_company_address values(4,'cc',0,0,'Dong','44','CA','San Jose','CA','acs Ave');
    insert into oms_company_address values(5,'dd',0,0,'Lieo','55','CA','San Jose','CA','cas Street');
    ```
3.  Write a SQL query to fetch all data from  oms_company_address  `table 

    ```
    select * from oms_company_address
    ```

4.  Write a SQL query to fetch top 3 records from  oms_company_address  table 

    ```
    select * from oms_company_address order by id limit 3
    ```
5.  Update  oms_company_address  table to set all  phone to 666-6666-8888

    ```
    update oms_company_address set phone = '666-6666-8888';
    ```
6.  Delete one entry from  oms_company_address  table

    ```
    delete from oms_company_address where id = 1;
    ```


MongoDB
ref: https://www.mongodb.com/docs/mongodb-shell/run-commands/

1. Create test DB
    
    open mongosh
    use test;

2. Create oms_company_address collection (method: createCollection() )

    db.createCollection('oms_company_address')

3. Insert few random entries to oms_company_address collection (method: insert() )
    
    ```
        db.oms_company_address.insertOne(
    {
        title: "The Favourite",
        genres: [ "Drama", "History" ],
        runtime: 121,
        rated: "R",
        year: 2018,
        directors: [ "Yorgos Lanthimos" ],
        cast: [ "Olivia Colman", "Emma Stone", "Rachel Weisz" ],
        type: "movie"
    }
    )


    db.oms_company_address.insertMany([
    {
        title: "Jurassic World: Fallen Kingdom",
        genres: [ "Action", "Sci-Fi" ],
        runtime: 130,
        rated: "PG-13",
        year: 2018,
        directors: [ "J. A. Bayona" ],
        cast: [ "Chris Pratt", "Bryce Dallas Howard", "Rafe Spall" ],
        type: "movie"
        },
        {
        title: "Tag",
        genres: [ "Comedy", "Action" ],
        runtime: 105,
        rated: "R",
        year: 2018,
        directors: [ "Jeff Tomsic" ],
        cast: [ "Annabelle Wallis", "Jeremy Renner", "Jon Hamm" ],
        type: "movie"
        }
    ])
    ```

4. Read one entry from oms_company_address collection (method: find() )

    ```
    db.oms_company_address.find( { rated: { $in: [ "PG", "PG-13" ] } } )
    ```

5. Read all entries from oms_company_address collection (method: find() )

    ```
    db.oms_company_address.find()
    ```

6. Update one entry from oms_company_address collection (method: update() or save() )

    ```
    db.oms_company_address.updateOne({title: "Tag"},{$set:{title: "update Tag"}})
    ```

7. Remove one entry from oms_company_address collection (method: remove() )
    
    Collection.remove() is deprecated.
    ```
    db.oms_company_address.remove({titile:'The Favourite'})
    ```

