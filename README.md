# 🍽️ Cheko Backend

Cheko is a full-stack restaurant system backend built with Spring Boot and PostgreSQL. It powers features like categorized menus, restaurant mapping, and real-time filtering—designed for a modern dining experience.

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.10-brightgreen?style=for-the-badge&logo=spring-boot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Latest-blue?style=for-the-badge&logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-Ready-blue?style=for-the-badge&logo=docker)
![Maven](https://img.shields.io/badge/Maven-4.0-red?style=for-the-badge&logo=apachemaven)

</div>

---

## 📋 Table of Contents

- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
- [Docker Setup](#-docker-setup)
- [Project Structure](#-project-structure)
- [API Endpoints](#-api-endpoints)

---

## 🚀 Features

- 🧾 Menu Filtering by Category
- 📍 Restaurant Location with Map Data
- 📦 PostgreSQL + Flyway for DB management
- 🐳 Dockerized deployment

---

## 📝 Prerequisites

- Java 17
- Maven 4.0+
- PostgreSQL 15+
- Docker

---

## 🚦 Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-org/cheko-backend.git
   cd cheko-backend
   ```

2. **Configure Database**
   ```bash
   # Create PostgreSQL database
   createdb cheko
   
   # Configure application.properties (if needed)
   vim src/main/resources/application.properties
   ```
3. **Build and Run**
   ```bash
   # Build with Maven
   mvn clean install
   
   # Run the application
   mvn spring-boot:run
   ```

### 🔌 Docker Setup
 
1. **Build Docker Image and Run Container**
   ```bash
   docker compose up --build
   ```

## 📁 Project Structure

```
cheko-backend/
├── src/
│   ├── main/
│   │   ├── java/sa/cheko/restaurant/
│   │   │   ├── category/       # Categories manamanagement
│   │   │   ├── menu/           # Menu Items management
│   │   │   └── restaurant/     # Restaurant Map management
│   │   └── resources/
│   │       ├── db/migration/   # Flyway SQL migrations
│   │       └── application.properties
├── Dockerfile
├── docker-compose.yml
└── README.md
```

### 📊 Database Design

#### Key Tables

1. `restaurants`: Stores restaurant details
2. `categories`: Represents menu categories
3. `menu`: Items for each category

## 🔌 API Endpoints

1. **📍 Restaurants**

```
GET /api/restaurants
```
Returns all restaurant markers with location and logo.

```
[
  {
    "id": 1,
    "name": "Kitchen Cafe",
    "latitude": 24.7136,
    "longitude": 46.6753,
    "logoUrl": "https://example.com/logo1.png"
  },
  {
    "id": 2,
    "name": "Sushi Spot",
    "latitude": 24.7215,
    "longitude": 46.6890,
    "logoUrl": "https://example.com/logo2.png"
  }
]

```

```
GET /api/restaurants/{id}
```
Returns a specific restaurant by ID.

```
[
  {
  "id": 1,
  "name": "Kitchen Cafe",
  "latitude": 24.7136,
  "longitude": 46.6753,
  "logoUrl": "https://example.com/logo.png"
  }
]
```

2. **🍽️ Menu**

```
POST /api/menu
```
Returns menu items by optional filters like category or restaurant.
🥞 Default Behavior: If no filters are applied, returns Breakfast category and its menu items.

```
[
  {
    "id": 6,
    "name": "Fresh Orange Juice",
    "imageUrl": "https://www.mortons.ie/wp-content/uploads/2024/03/20230627-4E6A0689.jpg",
    "description": "Freshly squeezed oranges for a vibrant and refreshing taste.",
    "calories": 110,
    "price": 18.5,
    "categoryId": 2,
    "categoryName": "Drinks"
  }
]
```

```
GET /api/menu/{id}
```
Returns a specific menu item by ID

```
[
    {
  "id": 6,
  "name": "Fresh Orange Juice",
  "imageUrl": "https://www.mortons.ie/wp-content/uploads/2024/03/20230627-4E6A0689.jpg",
  "description": "Freshly squeezed oranges for a vibrant and refreshing taste.",
  "calories": 110,
  "price": 18.5,
  "categoryId": 2,
  "categoryName": "Drinks"
   }
]
```

3. **📂 Categories**

```
GET /api/categories
```
Returns all available menu categories.

```
[
  {
    "id": 1,
    "name": "Breakfast"
  },
  {
    "id": 2,
    "name": "Drinks"
  }
]
```

