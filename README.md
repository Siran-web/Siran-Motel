# 🏨 SiranMotel Backend API

![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=springboot&logoColor=white)
![Build](https://img.shields.io/badge/Build-Maven-orange?logo=apachemaven&logoColor=white)
![Database](https://img.shields.io/badge/Database-PostgreSQL-blue?logo=postgresql)
![License](https://img.shields.io/badge/License-MIT-yellow)
![Status](https://img.shields.io/badge/Status-Active-success)

---

## 🌟 Project Overview

**SiranMotel** is a powerful **Spring Boot backend API** for managing motel operations —  
including **room bookings, food orders, bike rentals, and customer profiles**.  

It follows a **clean layered architecture** ensuring **scalability**, **maintainability**, and **testability**.

---

## ✨ Core Features

| 🧩 Module | 💡 Description | 🧱 Entity |
|:----------|:----------------|:----------|
| 🏠 **Room Management** | Manage room inventory, status, and availability. | `RoomEntity` |
| 📅 **Booking Management** | Handle bookings, check-ins, and check-outs. | `BookingEntity` |
| 👤 **Customer Profiles** | Maintain detailed customer records. | `CustomerEntity` |
| 🍽 **Menu & Orders** | Define menu items and process guest orders. | `MenuEntity`, `FoodOrderEntity`, `OrderItemEntity` |
| 🚲 **Bike Rentals** | Manage and track rental bikes. | `BikeEntity`, `BikeRentalEntity` |
| ⚙️ **Global Handling** | Centralized API responses and error handling. | `advices` package |

---

## 🛠️ Technology Stack

| Component | Technology |
|------------|-------------|
| **Language** | Java 17+ |
| **Framework** | Spring Boot 3 |
| **Build Tool** | Maven (or Gradle) |
| **Database** | PostgreSQL / MySQL / H2 |
| **Mapping Library** | MapStruct / Orika |
| **Documentation** | Springdoc OpenAPI / Swagger UI |

---

## ⚙️ Getting Started

### 🧩 Prerequisites

Ensure you have the following installed:
- ☕ JDK 17 or later  
- 🧱 Maven or Gradle  
- 🗄 Database server (PostgreSQL/MySQL)  

---

### 🚀 Installation & Setup

#### 1️⃣ Clone the Repository
```bash
git clone [Your Repository URL]
cd Motel
