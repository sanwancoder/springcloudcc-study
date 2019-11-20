curl -H "Content-Type:application/json" -X POST --data '{"bookName":"经济学原理","isbn":"23697183","author":"曼昆","price":128.00}' http://localhost:15005/book


```
db.getCollection('book').find({})

db.getCollection('book').find({_id:ObjectId('5cebada31d86d9671328dd36')})

db.getCollection('book').save({
     "createdDate" : ISODate("2019-05-27T08:33:19.777Z"),
    "createdBy" : "system",
    "updatedDate" : ISODate("2019-05-27T08:33:19.777Z"),
    "updatedBy" : "system",
    "bookName" : "economics",
    "isbn" : "23697183",
    "author" : "Mankiw11",
    "price" : 128.0,
    "_class" : "com.wyfdc.go.mongostudy.model.Book"
});

```

- Swagger: http://localhost:15005/swagger-ui.html
