# lab1TS


Obiective:
- Familizarea cu Selenium.
- Testarea functionalitatii de logare intr-o aplicatie(web) la alegere(FaceBook).
Sarcini de lucru:
-	Instalarea pluginului SeleniumIDE in browser si simularea comenzilor pentru a executa logarea folosind acest plugin.
-	Realizarea unei aplicatii care testeaza prin Selenium functionalitatea de logare folosind un limbaj de programare (JAVA).

1.testarea functionalitatii de logare automata prin Selenium:</br>
 
 
Dupa lansarea in executie a Selenium-ului:</br>
 
 
 
 
Testarea logarii prin intermediul testelor scrise.Codul sursa al programului:</br>
package com.ana;</br>

import org.openqa.selenium.By;</br>
import org.openqa.selenium.WebDriver;</br>
import org.openqa.selenium.WebElement;</br>
import org.openqa.selenium.chrome.ChromeDriver;</br>

public class Main {</br>

    public static void main(String[] args) throws InterruptedException {</br>

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Root\\Downloads\\chromedriver_win32\\chromedriver.exe");</br>
        WebDriver driver = new ChromeDriver();</br>
        Thread.sleep(5000);</br>
        driver.manage().window().maximize();</br>

        driver.get("https://facebook.com/");</br>

        driver.findElement(By.id("email")).sendKeys("email");</br>
        Thread.sleep(1000);</br>
        driver.findElement(By.id("pass")).sendKeys("password");</br>
        Thread.sleep(1000);</br>
        driver.findElement(By.id("loginbutton")).click();</br>
        Thread.sleep(1000);</br>

        Thread.sleep(5000);</br>
        driver.quit();</br>

    }
}

Dependentele de care am avut nevoie:</br>
<?xml version="1.0" encoding="UTF-8"?></br>
<project xmlns="http://maven.apache.org/POM/4.0.0"</br>
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"</br></br>
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"></br>
    <modelVersion>4.0.0</modelVersion></br>

    <groupId>yigfyfy</groupId></br>
    <artifactId>anaana</artifactId></br>
    <version>1.0-SNAPSHOT</version></br>

    <dependencies></br>

        <dependency></br>
            <groupId>org.seleniumhq.selenium</groupId></br>
            <artifactId>selenium-java</artifactId></br>
            <version>3.14.0</version></br>
        </dependency></br>
        <dependency></br>
            <groupId>org.seleniumhq.selenium</groupId></br>
            <artifactId>selenium-chrome-driver</artifactId></br>
            <version>3.141.59</version></br>
        </dependency></br>
    </dependencies></br>

</project></br>

Rezultatul rularii programului poate fi urmarit accesind link-ul :</br>
https://github.com/anagogu/lab1TS</br>
Concluzii :</br>
In urma efectuarii lucrarii de laborator scopul lucrarii a fost realizat in totalitate. Am facut cunostinta cu un nou plugin pentru testare “Selenium”. </br>
Pentru inceput am testat functionalitatea de logare in mod automat, utilizind doar posibilitatile oferite de selenium cee ace ne-a permis familiarizarea cu acesta.</br>
Pentru realizarea celea de-a doua parte a lucrarii de laborator a fost nevoie de aegerea unui limbaj de programare, in cazul meu a fost lmbajul Java, dupa care</br>
a urmat etapa de creare a primului nostru test pentru testarea automata a functionalitatii de logare a site-ului ales, alegerea mea a fost facebook.com. </br>
Cunostintele dobindite sunt necesare pentru dezvoltarea noastra ulterioara in domeniul testarii softwere, laboratorul dat creindu-ne bazele necesare.
