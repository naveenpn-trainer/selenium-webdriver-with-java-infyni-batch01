# Selenium WebDriver

​	

## Self Study Topics in Java

- [ ] Functional Programming and Lambda Expression
- [ ] Java Stream API
- [ ] Java 11
- [ ] Java 17 
- [ ] JDBC

## Selenium

**Module 01** - Getting Started with Selenium

- [ ] Selenium Architecture (3.x and 4.x)

- [ ] Selenium Components

- [ ] WebDriver (Interface)

  ```java
  interface WebDriver {
  	void get(String url);
      void quit();
      void close();
      String getTitle();
      String getWindowHandle();
      List<String> getWindowsHandles();
      manage();
      WebElement findElement(By by);
      List<WebElement> findElements(By by);
      switchTo();
  }
  ```

- [ ] Different implementation of WebDriver

  ```java
  class ChormeDriver implements WebDriver {
  
  }
  class FirefoxDriver implements WebDriver {
  
  }
  class EdgeDriver implements WebDriver {
  
  }
  ```

**Module 02** - **Identifying Elements**

- [ ] Different strategies to locate an elements (***By***)

  ```java
  class By {
  	public static By id(String str){
          
      }
      public static By className(String){
          
      }
      public static By name(String){
          
      }
      
      public static By linkText(String str){
          
      }
      public static By partialLinkText(String str){
          
      }
      public static By tagName(string str){
          
      }
      public static By css(String str){
          
      }    
      public static By xpath(String str){
          
      }
  }
  ```

- [ ] WebElement

  ```java
  interface WebElement {
  	String getCssValue(String s)
      .click();
      .getSize();
      .getText();
      .isDisplayed();
      .isSelected();
      .isEnabled();
      .isSelected();
      .sendKeys()       
  }
  ```

**Module 03** - **Working with Web Controls**

- [ ] DropDown (org.openqa.selenium.support.ui.Select)

  - [ ] .selectByIndex
  - [ ] .selectByVisibleText
  - [ ] .selectByValue

- [ ] TabbedWindows

- [ ] IFrames - Not supported

- [ ] WOrking with Popups

- [ ] JavaScript Dialog Boxes (Alert)

  ```
  Alert alert = driver.switchTo().alert()
  alert.accept()
  alert.getText()
  alert.display()
  alert.sendKeys("")
  ```

**Module 04** - **CSS and XPath Locators**



**Module 06 and 07** - **Advance Interaction of WebDriver**

- [ ] Brower Navigation
- [ ] Double Click
- [ ] Handling Sub Menus
- [ ] Java Script Executor
- [ ] Keyboard Interactions
- [ ] Sliding
- [ ] Right Click
- [ ] Move Element



**WebDriver Synchronization**

**Logging Framework**

**Framework Development - Page Object Model**

**Cucumber BDD**

**Capstone Project**