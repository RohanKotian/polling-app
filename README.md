# Polling App

A real-time polling application built using:

- Spring Boot
- Angular
- MySQL
- WebSockets
- JPA/Hibernate

## 📡 API Endpoints

| API | Method | Endpoint | Description | Request Body | Response |
|-----|--------|----------|-------------|--------------|----------|
| Create Poll | POST | `/api/polls` | Creates a new poll with options for voting | Post JSON | `201` Created with the created poll |
| Get All Polls | GET | `/api/polls` | Retrieves a list of all polls | — | `200` OK with a list of all poll objects |
| Get Poll by ID | GET | `/api/polls/{id}` | Retrieves details of a specific poll | — | `200` OK with poll object or 404 Nort Found |
| Vote on Poll | POST | `/api/polls/vote` | Submits a vote for a specific option in a poll | Poll ID and Option | `204` No Content |
