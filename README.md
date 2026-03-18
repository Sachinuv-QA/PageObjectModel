 #Selenium Page Object Model (POM) Framework

This project demonstrates the implementation of the Page Object Model (POM) design pattern using Selenium WebDriver, Java, and TestNG.

It automates a complete user flow including login, add to cart, checkout, and logout on a sample e-commerce website.

---

## 🚀 Features

- Page Object Model (POM) design pattern  
- Implementation with:
  - PageFactory  
  - Without PageFactory  
- Automated test scenarios:
  - Login  
  - Add to Cart  
  - Remove Item  
  - Checkout Process  
  - Logout  
- Chrome browser configuration:
  - Incognito mode  
  - Disabled password popups  

---

## 🧱 Project Structure

src  
 ├── main  
 │    └── java  
 │         └── pageobjectmodel  
 │              ├── addtocartpage.java  
 │              ├── withpagefactorypage.java  
 │              └── withoutpagefactorypage.java  
 |
 └── test  
 |     └── java  
 |          └── pageobjectmodel  
 |               └── logintestpage.java  
 |
 |──test-output
            └──emailable-report.html
---

## 🛠️ Technologies Used

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- IntelliJ IDEA  

---

## ▶️ How to Run the Project

1. Clone the repository:
git clone https://github.com/your-username/Selenium-PageObjectModel.git  

2. Open the project in IntelliJ IDEA  

3. Install dependencies (Maven will handle automatically)  

4. Run tests:
- Run testng.xml  
OR  
- Run logintestpage.java  
---
## 🌐 Test Website
https://www.saucedemo.com  
---

## 📸 Test Flow
1. Open browser  
2. Login with valid credentials  
3. Add item to cart  
4. Remove item  
5. Proceed to checkout  
6. Enter user information  
7. Complete order  
8. Logout  
---

## 📊 Test Report (TestNG)

This project includes TestNG HTML report:

- File: `emailable-report.html`

### How to view:
1. Navigate to:
   test-output/emailable-report.html  

2. Download and open the file in any browser  

### Report includes:
- Test execution summary  
- Passed/Failed test cases  
- Execution time  
- Detailed logs  

📌 Sample report is included in the repository for reference.


## 👨‍💻 Author
SachinUV 
---

## 📌 Notes
- This project is created for learning purposes  
- Demonstrates basic POM framework used in automation testing  
