# 💊 MediStock — Pharmacy Inventory Management System

### 🏥 A Full-Stack Pharmacy & Medicine Inventory Management Application

MediStock is a full-stack web application designed to simplify pharmacy inventory operations, medicine stock management, and day-to-day workflows through a centralized, user-friendly interface.

Built using **React, Spring Boot, and TiDB Cloud**, MediStock provides a responsive interface, secure authentication, and role-based access to different application features.

### 🌐 Live Demo

🚀 **[Visit MediStock](https://medistock-frontend-app.netlify.app)**

> **Note:** The backend is hosted on Render's free tier. The first request may take some time while the server wakes up after inactivity.

---

## ✨ Features

- 🔐 **Authentication** — User registration and login with JWT-based authentication.
- 👥 **Role-Based Access** — Supports Admin, Pharmacist, Staff, and Supplier roles.
- 📊 **Dashboard** — Centralized interface for accessing pharmacy operations.
- 💊 **Medicine Management** — Manage medicine and inventory information.
- 📦 **Stock Management** — Track and manage available medicine stock.
- 🏥 **Pharmacy Operations** — Organize inventory-related workflows in one application.
- 🔒 **Protected Routes** — Restrict access to authenticated users.
- 📱 **Responsive Design** — User-friendly interface across desktop, tablet, and mobile devices.
- ☁️ **Cloud Deployment** — Frontend, backend, and database hosted using cloud services.

---

## 🛠️ Technology Stack

| Layer | Technologies |
|---|---|
| 🎨 Frontend | React.js, Vite, Tailwind CSS |
| ⚙️ Backend | Java, Spring Boot |
| 🔐 Security | Spring Security, JWT, BCrypt |
| 🗄️ Database | TiDB Cloud (MySQL-compatible) |
| 🔗 API Communication | REST APIs, Axios |
| 🌐 Frontend Hosting | Netlify |
| 🚀 Backend Hosting | Render |
| ☁️ Database Hosting | TiDB Cloud |
| 🧑‍💻 Version Control | Git, GitHub |

---

## 🏗️ System Architecture

```text
                  👤 User
                     |
                     ▼
           🌐 React Frontend
               (Netlify)
                     |
                REST APIs
                     |
                     ▼
          ⚙️ Spring Boot Backend
                (Render)
                     |
                Spring Data JPA
                     |
                     ▼
             🗄️ TiDB Cloud
                Database
```

---

## 📁 Project Structure

```text
MediStock/
│
├── frontend/              # React + Vite application
│   ├── public/
│   ├── src/
│   ├── package.json
│   └── vite.config.js
│
├── backend/               # Spring Boot REST API
│   ├── src/
│   └── pom.xml
│
└── README.md
```

---

## 🚀 Running Locally

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Shunmugasubramanian/Medistock.git
cd Medistock
```

### 2️⃣ Start the Backend

Navigate to the `backend
