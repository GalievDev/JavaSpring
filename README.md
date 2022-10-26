# JavaSpring

## Tools
  * [Spring Boot](https://spring.io/quickstart)
	* [Jackson JSON Srialization](https://springeframework.guru/processing-json-jackson/)
  * [JSOUP](https://jsoup.org)
  * Database [PostgresSQL](https://postgresql.org) or [SQLite](https://sqlite.org/)
	* [Postgres JDBC](https://jdbc.postgresql.org) or [SQLite JDBC](https://github.com/xerial/sqlite-jdbc)

## Tasks

### Base
  1. Parse [CurseForge](https://www.curseforge.com/members/duckyhatsu/projects) profile page every 6 hours using [JSOAP](https://jsoup.org)

  2. Extracting data from parsing
		* Project name as `name`
		* Project id as `slug`
		* Downloads as `downloads`

     and save to the database in the form
     	| Time        | Project Name | Slug   | Downloads   |
     	| ----------- | ------------ | ------ | ----------- |
     	| `timestamp` | `name`       | `slug` | `downloads` |
  
  3. Using [Spring Boot](https://spring.io/quickstart) create a **GET** request `/{slug}`. We use the incoming path as parameter for SQL query

  4. Return data in response using JSON
  ```json
  {
	"name": "Project Name",
	"slug": "project-slug",
	"downloads": [1, 2, 3, N...]
  }
  ```

### Additional
  1. Add query request filters `/{slug}?limit=N` that limit how much data u recive from database. N is Integer
