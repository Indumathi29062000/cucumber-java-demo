🛠️ Tools & Technologies Used
Java (JDK 8 or later)

Maven

Eclipse IDE

Cucumber (BDD)

JUnit

📦 Maven Dependencies
Add the following to your pom.xml:


<dependencies>
  <!-- Cucumber with JUnit -->
  <dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.14.0</version>
  </dependency>
  <dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.14.0</version>
    <scope>test</scope>
  </dependency>
  <!-- JUnit -->
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
  </dependency>
</dependencies>

🧪 Gherkin Syntax Practiced
 I practiced:

Feature, Scenario Outline, Examples

Step keywords: Given, When, Then, And, But

Background section

Tags like @login, @simplelogin
Hooks


▶️ How I Ran the Tests
Right-click on RunCucumberTest.java in Eclipse

Select Run As > JUnit Test

Output appears in the JUnit tab and console
