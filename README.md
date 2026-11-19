# MediStock

Role-based pharmacy stock management system.
Roles: **Admin, Pharmacist, Staff, Supplier**.

**Features:** inventory and batches, expiry tracking, purchase orders with approval,
returns, wastage, stock counts, reports, alerts, audit log, backup, and an AI stock advisor.

**Tech:** Spring Boot 4 (Java 21), MySQL 8, React 19, Vite, Tailwind CSS, JWT authentication.

## Run on your own computer
Needs: Java 21, MySQL 8, Node 20+. Nothing is shared with anyone else's database.

### Backend
1. Start MySQL.
2. In `medistock-backend/src/main/resources/`, copy
   `application-local.properties.example` to `application-local.properties`.
3. Replace every `CHANGE_ME` (MySQL password, JWT secret, admin password).
4. Run:
   ```
   cd medistock-backend
   mvn spring-boot:run
   ```
   The database, tables and your admin account are created automatically on first start.

### Frontend
```
cd frontend
npm install
npm run dev
```
Open http://localhost:5173 and sign in with the admin account from your local file.
If your backend is not on port 8080, copy `frontend/.env.example` to `frontend/.env`
and change `VITE_API_URL`.

## Do not upload
`application-local.properties`, `.env` and the `backups/` folder hold passwords and real data.
They are git-ignored on purpose.
