# Selenium Automation Framework

## Overview
This repository contains a Selenium automation framework for web application testing. The framework is designed to provide a structured approach to writing and executing automated tests using Selenium WebDriver.

## Key Features
- **Step Definitions:** Implemented step definitions for defining test scenarios using Gherkin syntax.
- **Page Objects:** Setup Page Objects to represent web pages and their elements, providing a clear separation of concerns between test code and page structure.
- **Runner File:** Provided a runner file for executing automated tests, allowing for easy integration with testing frameworks like Cucumber or TestNG.

## Getting Started
To get started with the framework, follow these steps:

1. **Clone the Repository:**
2. **Install Dependencies:**
3. **Update WebDriver:**
   Ensure that you have the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) installed and configured. You may use the provided automated Bot to update dependencies to the latest version.

## Usage
Once the framework is set up and dependencies are installed, you can start writing and executing automated tests using the provided features. Here's a basic example:

```JAVA
# Example Test Scenario
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTestScenario {
    public static void main(String[] args) {
        // Setup
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);

        // Test Scenario
        test_successful_login(loginPage);

        // Teardown
        driver.quit();
    }

    public static void test_successful_login(LoginPage loginPage) {
        loginPage.navigate_to_login_page();
        loginPage.enter_username("username");
        loginPage.enter_password("password");
        loginPage.click_login_button();
        assert loginPage.is_dashboard_displayed();
    }
}

# Teardown
driver.quit()
