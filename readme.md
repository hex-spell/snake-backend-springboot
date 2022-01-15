# Snake game high-scores
Learning Kotlin Spring Boot, simple CRUD api with validation and caching, migration of [snake-backend](https://github.com/Modulariz/snake-backend)


## Endpoints
### GET /
- Returns array of `
  {
  "id": Int,
  "username": String,
  "points": Int,
  }
  `

### POST /
- Receives `
  {
  "username": String,
  "points": Int
  }
  `
- Returns new entity as `
  {
  "id": Int,
  "username": String,
  "points": Int,
  }
  `
