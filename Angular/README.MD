# project name: Mess Manager
# Project create: 03/09/2026 9:00 AM
# Author: Abu Hossain
# Last Edit: 03/09/2026 9:00 AM


ng new angular-mess-manager --routing --style=css
cd angular-mess-manager

# Bootstrap add (For better UI)
ng add @angular/localize  # (optional)
npm install bootstrap


# Run the file
ng serve


# Auth Module + Login/Register Components
ng generate module auth --routing=true
ng generate component auth/login
ng generate component auth/register

# Dashboard, Deposit, Meal, Bazar, Report Components

ng generate component dashboard
ng generate component deposit
ng generate component meal
ng generate component bazar
ng generate component report

# Services

ng generate service auth/auth
ng generate service services/deposit
ng generate service services/meal
ng generate service services/bazar
ng generate service services/report

#  Guard & Interceptor

ng generate guard auth/auth
ng generate interceptor auth/jwt

# Model

ng generate class models/user --type=model

# Configure with JwtModule

npm install @auth0/angular-jwt