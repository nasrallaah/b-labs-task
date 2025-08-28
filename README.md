# b-labs-task


📋 Project Overview
This is a Selenium Java automation framework for testing the BTech e-commerce website. The task involves searching for products, adding them to cart, and handling various UI scenarios including popup modals.

🎯 Task Description
Automate the following workflow on BTech website (https://btech.com/ar):

Navigate to BTech website

Search for "iphone16" using the search box

Select the first search result and verify it has an image

Open the product details page

Add the product to cart

Handle the popup modal 

Navigate to the cart page using appropriate fallback strategies

🏗️ Project Structure



btech-automation/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── btech/
│       │           ├── pages/          # Page Object Model classes
│       │           │   ├── BasePage.java
│       │           │   ├── HomePage.java
│       │           │   ├── SearchResultsPage.java
│       │           │   └── ProductPage.java
│       │           ├── tests/          # Test classes
│       │           │   └── BTechSearchTest.java
│       │           └── utils/          # Utility classes
│       │               └── Config.java
│       └── resources/
│           └── config.properties       # Configuration file
├── pom.xml                            # Maven dependencies
├── testng.xml                         # TestNG configuration
└── README.md                          # This file



🚀 Key Features
Page Object Model (POM) Design Pattern

Robust Popup Handling with multiple fallback strategies

Smart Element Detection with configurable timeouts

Cross-browser Support (configurable via properties)

Detailed Logging for debugging and monitoring

Exception Handling with comprehensive fallbacks

🛠️ Installation & Setup
Prerequisites
Java JDK 11 or higher

Maven 3.6 or higher

Chrome browser (default) or other supported browsers

1. Clone the Repository
bash
git clone <https://github.com/nasrallaah/b-labs-task.git>
cd btech-automation
2. Install Dependencies
bash
mvn clean install
3. Configuration
Edit src/test/resources/config.properties:

properties
browser=chrome
base.url=https://btech.com/ar
timeout=30
search.term=iphone16
🧪 Running Tests
Run all tests
bash
mvn test
Run with specific browser
bash
mvn test -Dbrowser=firefox
Run with TestNG XML
bash
mvn test -DsuiteXmlFile=testng.xml


📝 Logging
The framework includes detailed console logging:

Element detection status

Popup handling decisions

Fallback strategy triggers

Success/failure notifications
