# 🧠 OpenCartV_01 — Hybrid Automation Framework  

![Java](https://img.shields.io/badge/Java-11%2B-orange?logo=java)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen?logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-blue)
![Docker](https://img.shields.io/badge/Docker-Grid%20Execution-2496ED?logo=docker)
![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-orange?logo=jenkins)
![ExtentReports](https://img.shields.io/badge/Extent%20Reports-Integrated-lightgrey)
![Platform](https://img.shields.io/badge/Platform-Web%20Automation-yellow)
![License](https://img.shields.io/badge/License-MIT-lightblue)

---

## 🏗️ Project Overview  

**OpenCartV_01** is a **Hybrid Automation Framework** built to automate the **OpenCart E-Commerce Web Application**.  
It combines **Data-Driven**, **Keyword-Driven**, and **Page Object Model (POM)** approaches, making it **robust, modular, and CI/CD ready**.

The framework enables:
- 🔄 Cross-browser testing  
- 🧩 Parallel execution  
- ⚙️ Environment configuration  
- ☁️ Docker Grid integration for distributed execution  
- 📊 Rich HTML reporting with screenshots and logs  

---

## 🎯 Key Features  

- ✅ **Hybrid Architecture** (Data + Keyword + POM)  
- ⚙️ **TestNG + Maven Integration** for flexible test management  
- 🧱 **Reusable Page Objects** for clean test scripts  
- 📊 **Dynamic HTML Reporting** via Extent Reports  
- 🧰 **Centralized Logging** using Log4j2  
- 🧪 **Excel-Based Data-Driven Tests** with Apache POI  
- 🌐 **Cross-Browser & Parallel Execution** (Chrome, Firefox, Edge)  
- 🐳 **Docker-Enabled Selenium Grid** for parallel distributed runs  
- 🔄 **Jenkins CI/CD Integration** for continuous test execution  
- 📸 **Automatic Screenshot Capture** for failed test steps  

---

## 📁 Project Structure  

```

OpenCartV_01/
│
├── .settings/               # IDE and environment settings
├── logs/                    # Log files generated during execution
├── reports/                 # Extent and TestNG reports
├── screenshots/             # Captured screenshots for failures
├── src/test/                # Source code (page objects, test cases, utilities)
│   ├── base/                # Base setup and WebDriver initialization
│   ├── pages/               # Page Object classes for OpenCart modules
│   ├── testcases/           # TestNG test scripts
│   ├── utils/               # Helper utilities (Excel, Config, Log, Waits)
│   └── listeners/           # Extent and retry listeners
│
├── test-output/             # Default TestNG report output
├── testData/                # Test data (Excel, JSON, CSV)
│
├── docker-compose.yaml      # Docker configuration for Selenium Grid
├── docker-grid.xml          # TestNG XML for Docker Grid execution
├── grouping.xml             # TestNG grouping file
├── mastertest.xml           # Master TestNG suite file
├── pom.xml                  # Maven configuration and dependencies
└── README.md                # Project documentation

````

---

## ⚙️ Tech Stack  

| Category | Tool / Library |
|-----------|----------------|
| Language | Java |
| Test Framework | TestNG |
| Automation | Selenium WebDriver |
| Build Tool | Maven |
| Reporting | Extent Reports, TestNG Reports |
| Data Handling | Apache POI (Excel) |
| Logging | Log4j2 |
| CI/CD | Jenkins |
| Containerization | Docker + Selenium Grid |
| Version Control | GitHub |

---

## 🧰 Prerequisites  

Make sure you have the following installed:
- **Java 11+**  
- **Maven 3.6+**  
- **TestNG Plugin** (Eclipse/IntelliJ)  
- **Docker Desktop (Optional)**  
- **Git**  

---

## 🚀 How to Run the Tests  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/Pankaj379/OpenCartV_01.git
cd OpenCartV_01
````

### 2️⃣ Configure Environment

Update `config.properties` file:

```
browser=chrome
url=https://demo.opencart.com/
username=testuser
password=testpass
```

### 3️⃣ Run Tests via Maven

```bash
mvn clean test
```

### 4️⃣ Execute Specific Test Suites

```bash
mvn clean test -DsuiteXmlFile=mastertest.xml
mvn clean test -DsuiteXmlFile=docker-grid.xml
```

### 5️⃣ View Reports

* 📊 **Extent Report:** `reports/ExtentReport.html`
* 📈 **TestNG Report:** `test-output/index.html`

---

## 🐳 Docker Execution (Optional)

To execute tests on **Selenium Grid via Docker**:

```bash
docker-compose up -d
mvn clean test -DsuiteXmlFile=docker-grid.xml
docker-compose down
```

---

## 📸 Reporting & Logs

* **Extent Reports:** Rich HTML reports with test details and screenshots
* **Logs:** Stored in `/logs` folder with timestamp-based log files
* **Screenshots:** Captured automatically for failed tests

---

## 💡 Future Enhancements

* ➕ API Testing (RestAssured)
* ➕ BDD Layer (Cucumber + Gherkin)
* ➕ Slack/Email notifications post execution
* ➕ Jenkinsfile pipeline with parallel stages

---

## 👨‍💻 Author

**Pankaj Bhardwaj**
💼 QA Automation Engineer | SDET | Test Analyst
📧 [[qapankaj379@gmail.com](mailto:your.email@example.com)]
🔗 [LinkedIn](https://www.linkedin.com/in/pankaj-bhardwaj-90628010a)
💻 [GitHub](https://github.com/Pankaj379)

---

## 🏁 Purpose

This project showcases my ability to **design, build, and maintain a Hybrid Automation Framework** for a web-based application (**OpenCart**).
It highlights skills essential for **SDET / QA Automation roles**, including:

* Test architecture design
* Framework scalability
* CI/CD integration
* Cross-browser automation
* Reporting and debugging efficiency

---

## 🧩 SDET Skill Alignment

| Skill Area                        | Demonstrated In Project                                |
| --------------------------------- | ------------------------------------------------------ |
| **Automation Design**             | Hybrid Framework (Data + Keyword + POM)                |
| **Programming**                   | Java, OOP principles, Utilities                        |
| **CI/CD & DevOps**                | Jenkins integration, Docker Grid                       |
| **Reporting & Logging**           | Extent Reports, Log4j2                                 |
| **Scalability & Maintainability** | Modular architecture, reusable functions               |
| **Problem Solving**               | Error handling, Retry analyzers, Test data abstraction |

---

⭐ **If you like this project, don’t forget to star the repository!**
🧩 *Built with passion for automation testing and continuous improvement.*
