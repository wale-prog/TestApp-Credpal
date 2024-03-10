# TestApp

> Project Description

> "TestApp" is a Mobile Flutter app designed to test the capacity of a Quality Assurance Engineer

## Built With
- Java
- Git
- Github
- Maven
- Appium
- UIAutomator2


## Getting Started
To get a local copy of the program running, follow these simple steps
## Demo
[Demo link](https://drive.google.com/file/d/1Ievlwn4vVAxnbtU4o8mMe_uUrG-BMgXi/view?usp=sharing)

### Prerequisites
- IDE, preferably Intellij but Eclipse should be fine too

### Install
- Java
- Android Studio
- Appium
- UIAutomator2


### Setup
- Open a command line terminal (Git bash preferrably) and navigate to a directory where you would like to save the work folder using cd.
- Clone the repository with git clone https://github.com/wale-prog/TestApp-Credpal.git
- To get the current working tree, git fetch --all, then checkout to "dev" branch.
- You will need appium to be able to run these scripts and since it is build in JS, you will need to first install Node. Checkout this [article](https://www.geeksforgeeks.org/installation-of-node-js-on-windows/) for guidance.
- Next is to install appium using the Command Line Interface ``npm install -g appium`` this [article](https://appium.io/docs/en/2.0/quickstart/install/) can be helpful
- Install UIAutomator2 driver using the Command Line Interface by running the following ``appium driver install uiautomator2`` this [article](https://appium.io/docs/en/2.4/quickstart/uiauto2-driver/) can be helpful
- Download and install Appium server GUI from [here](https://github.com/appium/appium-desktop/releases) select appropriate version for your OS. This will start appium server.
- Start Appium server by opening the Appium server GUI and click on startServer.
- Finally, open the project in your preferred IDE and wait for maven to download all project dependencies
    - navigate to the root directory and locate ``TestApp.xml`` file. Open, right-click anywhere within the file and select `Run`

### Output
- After the execution of the test, there will be two files generated.
  - Report: it will be located at Reports/ It is an HTML file that contains the status of each test case run with screenshots of failed test cases.
  - Logs: It will be located at src/test/java/utils/logs. It is a .log file that can be very useful to understand why there is an error and can proof invaluable in understanding how to fix errors.
  

## Author

👤 **Olawale Olapetan**

- GitHub: [@wale-prog](https://github.com/wale-prog)
- Twitter: [@Wale_Petan](https://twitter.com/wale_Petan)
- LinkedIn: [@walepetan](https://www.linkedin.com/in/walepetan/)


## 🤝 Contributing

Contributions, issues, and feature requests are welcome!


## Show your support

Give a ⭐️ if you like this project!

## Acknowledgments
- Shout out to [CredPal](https://www.credpal.com/) for the opportunity

## 📝 License

This project is [MIT](./LICENSE) licensed.
