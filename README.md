# City and States API

<hr/>

Endpoints:

GET `http://localhost:8080/cidades`

GET `http://localhost:8080/cidades/{id}`

POST `http://localhost:8080/cidades`

PUT `http://localhost:8080/cidades/{id}`

DELETE `http://localhost:8080/cidades/{id}`

<hr/>

Usage:
    
Get all cities, default size is 5, but you can modify this value like this 
```
curl http://localhost:8080/cidades?size=10
```
Register a new city
```
curl -X POST -H 'Content-Type:application/json' -d '{"city":"Volta Redonda","state":18}' http://localhost:8080/cidades
```
Fully update a existing city
```
curl -X PUT -H 'Content-Type:application/json' -d '{"city":"Recife","state":16}' http://localhost:8080/cidades/10
```
Delete a registered city
```
curl -X DELETE http://localhost:8080/cidades/10
```
