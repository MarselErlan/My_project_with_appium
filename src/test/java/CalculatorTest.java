import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    static AppiumDriver<MobileElement> driver;


    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

    }


        public static void openCalculator() throws Exception {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Micromax HS2");
            cap.setCapability("udid", "12345432ab");
            cap.setCapability("platforName", "Android");
            cap.setCapability("platformVersion", "7.1.2");


            cap.setCapability("appPackage", "com.myOs.calculator2");
            cap.setCapability("appActivity", "com.myOs.calculator2.Calculator");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(cap);

            System.out.println("Application Started...!");

            MobileElement two = driver.findElement(By.id("com.myos.calculator2:id/digit2"));
            MobileElement plus = driver.findElement(By.id("com.myos.calculator2:id/plus"));
            MobileElement three = driver.findElement(By.id("com.myos.calculator2:id/digit3"));
            MobileElement equals = driver.findElement(By.id("com.myos.calculator2:id/equal"));
            MobileElement result = driver.findElement(By.id("com.myos.calculator2:id/EditText"));
            two.click();
            plus.click();
            three.click();
            equals.click();

            String res = result.getText();
            System.out.println("\n Result is : " + res);

            System.out.println("Completed....");


        }

}
