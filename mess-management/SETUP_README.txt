# Mess Manager - Backend Setup Guide

## Prerequisites
1. Java 17 installed
2. MySQL Server 9.7+ installed and running
3. Spring Tools for Eclipse (STS) installed

## Step 1: Create MySQL Database
Open MySQL Workbench or Command Line and run:
```sql
CREATE DATABASE mess_db;
```

## Step 2: Configure Database Password
Open: `src/main/resources/application.properties`

Change this line:
```properties
spring.datasource.password=your_password
```
Replace `your_password` with your actual MySQL root password.

## Step 3: Import into STS
1. Open STS
2. File → Import → Existing Maven Projects
3. Browse to the extracted folder
4. Click Finish
5. Wait for Maven dependencies to download (may take 5-10 minutes first time)

## Step 4: Run the Application
1. Right-click on `MessManagerApplication.java`
2. Run As → Spring Boot App
3. Server will start at: http://localhost:8080

## Default API Endpoints

### Auth (No login required)
- POST `/api/auth/login` - Login
- POST `/api/auth/register` - Register

### Deposits (Manager only for add, Member can view own)
- POST `/api/deposits` - Add deposit
- GET `/api/deposits/my` - View my deposits
- GET `/api/deposits` - View all deposits (Manager)

### Meals (Manager only for add, Member can view own)
- POST `/api/meals` - Add meal
- GET `/api/meals/my/{year}/{month}` - View my meals
- GET `/api/meals/month/{year}/{month}` - View all meals (Manager)

### Bazar Schedule (Manager only for add, Member can view own)
- POST `/api/bazar/schedule` - Schedule bazar
- POST `/api/bazar/complete/{id}` - Complete bazar with amount
- GET `/api/bazar/my/{year}/{month}` - View my bazar duties
- GET `/api/bazar/notifications` - Pending bazar notifications

### Reports
- GET `/api/reports/my/{year}/{month}` - My report
- GET `/api/reports/all/{year}/{month}` - All reports (Manager)
- GET `/api/reports/dashboard/{year}/{month}` - Dashboard (Manager)

## Test with Postman or Browser
After running, test login with:
```bash
curl -X POST http://localhost:8080/api/auth/register   -H "Content-Type: application/json"   -d '{"name":"Manager","email":"manager@test.com","password":"123456","phone":"01712345678","role":"MANAGER"}'
```

Then login:
```bash
curl -X POST http://localhost:8080/api/auth/login   -H "Content-Type: application/json"   -d '{"email":"manager@test.com","password":"123456"}'
```
