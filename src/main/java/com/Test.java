package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @ClassName Test
 * @Author mjwang
 * @Date 2021/4/19 9:43
 * @Description Test
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","H:\\autotest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebElement element = null;
        Actions actions = new Actions(driver);

        //   driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);   //设置默认超时时间
//        driver.get("https://www.baidu.com");
//        // 获取 网页的 title
//        System.out.println("The testing page title is: " + driver.getTitle());
//        driver.findElement(By.id("kw")).sendKeys("selenium");
//        driver.findElement(By.id("su")).click();

        // 输入，点击
        // driver.get("https://www.baidu.com/");
        // element = driver.findElement(By.id("kw"));
        // actions.sendKeys(element, "yofc").click(driver.findElement(By.xpath("//*[@id=\"su\"]"))).perform();


        // form
//         driver.get("http://127.0.5.1:81/user-login.html");
//         element = driver.findElement(By.xpath("//input[@name='account']"));
//         element.sendKeys("yonghuming");
//         element = driver.findElement(By.xpath("//input[@name='password']"));
//         element.sendKeys("mima");
//         element = driver.findElement(By.className("form-condensed"));
//         element.submit();


        // update file
        // driver.get("https://imgurl.org/");
        // element = driver.findElement(By.className("layui-upload-file"));
        // element.sendKeys("D:\\selenium\\test.jpg");


        // 滑动
//         driver.get("http://www.jq22.com/yanshi20053");
//
//         element = driver.findElement(By.id("iframe"));
//         driver.switchTo().frame(element);
//
//         element = driver.findElement(By.className("slider"));
//         actions.dragAndDropBy(element, 100, 0).perform();


        // 执行 js
//        driver.get("https://www.baidu.com/");
//        JavascriptExecutor je = (JavascriptExecutor) driver;
//        je.executeScript("alert('hello!')");

        // 缩放
        // je.executeScript("document.getElementsByTagName('body')[0].style.zoom=0.5");
        // 新窗口打开网页
        // je.executeScript("window.open('http://www.baidu.com')");

//        driver.quit();

    }

}
