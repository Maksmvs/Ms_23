package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDemo {


    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = null;
        try {
            webDriver = new ChromeDriver(); // запуск хрома
            webDriver.get("https://bt.rozetka.com.ua/ua/"); // відкрити відповідну сторінку
            //List<WebElement> buttons = webDriver.findElements(By.tagName("button")); //визначення кількості всіх кнопок
            //if (buttons.size() == 5) {
                //приймаємо cookies
            //    System.out.println("we need to accept cookies");
            //    buttons.get(3).click(); // необхідна кнопка з переліка
            //}
            //work with google.com
            WebElement inputField = webDriver.findElement(By.name("search")); // натискання кнопки
            inputField.sendKeys("Iphone"); // що шукаємо
            Thread.sleep(2500); // затримка але це не бажано робити
            inputField.sendKeys(Keys.ENTER); //натискання кнопки
            Thread.sleep(2500);
            //List<WebElement> searchHeaders = webDriver.findElements(By.xpath("//a/h3")); //перевірка відповідності пошуку
            //System.out.println("Країна знайдена: " +
            //        searchHeaders.stream().anyMatch(webElement -> webElement.getText().contains("Україна")));
        } finally {
            if (webDriver != null) { //вихід з веб драйвера
                webDriver.quit();
            }
        }
    }
}