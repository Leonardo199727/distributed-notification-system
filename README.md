# Distributed Notification & Alert System

A production-ready, loosely coupled microservices architecture built with **Java 17**, **Spring Boot 3.x**, and **Spring Cloud**. This project demonstrates dynamic service discovery, abstract synchronous inter-service communication, and multi-container orchestration using **Docker** and **Docker Compose**.

## Architecture Overview

The system isolates core business operations from heavy notification processing routines, ensuring high availability and fault isolation across the platform.

* **Discovery Server (Netflix Eureka Server):** Acts as the Service Registry, mapping container network locations dynamically.
* **Core Operation Service (Producer):** Manages business transactions and handles synchronous outbound communication via an abstract **OpenFeign** HTTP client.
* **Notification Service (Consumer):** An isolated, specialized service that listens for event payloads and processes system alerts independently.

## Tech Stack

* **Backend:** Java 17 / Spring Boot 3.x / Spring Cloud Netflix Eureka / Spring Cloud OpenFeign
* **Boilerplate Optimization:** Lombok
* **Containerization:** Docker & Docker Compose

---

## Getting Started

### Prerequisites

Ensure you have the following installed on your local environment:
* Java 17 JDK or higher
* Apache Maven 3.8+
* Docker Desktop & Docker Compose

### 1. Clone the Repository
```bash
git clone [https://github.com/YOUR_USERNAME/distributed-notification-system.git](https://github.com/YOUR_USERNAME/distributed-notification-system.git)
cd distributed-notification-system