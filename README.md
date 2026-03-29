# 💳 Smart Digital Wallet & Expense Management Application

## 📌 Project Overview

The **Smart Digital Wallet & Expense Management Application** is a web-based system that helps users manage their finances efficiently. It allows users to track income, expenses, and wallet balance in real-time.

---

## 🚀 Features

* 🔐 User Registration & Login
* 💰 Wallet Creation & Balance Management
* ➕ Add Income
* ➖ Track Expenses
* 📊 View Transaction History
* 📅 Expense Tracking by Category
* 📉 Budget Monitoring (optional)

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* MySQL

### Frontend

* React JS
* Axios
* React Router

---

## 📂 Project Structure

```
wallet/
│
├── backend/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│
├── frontend/
│   ├── src/
│   ├── components/
│   ├── pages/
│
└── database/
    └── schema.sql
```

---

## ⚙️ Installation & Setup

### 🔹 Backend Setup

1. Clone the repository:

```
git clone https://github.com/your-username/smart-wallet.git
```

2. Navigate to backend:

```
cd wallet
```

3. Configure database in `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/wallet_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

4. Run the application:

```
mvn spring-boot:run
```

---

### 🔹 Frontend Setup

1. Navigate to frontend folder:

```
cd frontend
```

2. Install dependencies:

```
npm install
```

3. Start React app:

```
npm start
```

---

## 🔗 API Endpoints

### 👤 User

* POST `/user/register`
* POST `/user/login`

### 💼 Wallet

* POST `/wallet/create`
* POST `/wallet/add`

### 💸 Expense

* POST `/expense/add`
* GET `/expense/list`

### 💵 Income

* POST `/income/add`
* GET `/income/list`

---

## 🧪 Testing

* Use Postman to test backend APIs
* Ensure MySQL server is running

---

## 👨‍💻 Team Contribution

* Each team member developed a separate module
* Code managed using GitHub branches
* Integrated into a single project

---

## 🎯 Future Enhancements

* JWT Authentication
* Advanced Analytics (Charts)
* Notifications for budget limits
* Mobile App Integration

---

## 📸 Demo (Optional)

*Add screenshots or demo video here*

---

## 📄 License

This project is for educational and hackathon purposes.

---

## 🙌 Acknowledgement

Thanks to our team and mentors for supporting this project development.

---
