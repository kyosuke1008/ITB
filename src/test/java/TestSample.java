import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class TestSample {


    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        FirefoxDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.firefox.bin", "/usr/bin/firefox");
        driver.get("https://www.hotpepper.jp/");
        driver.findElement(By.linkText("北海道")).click();
        assertEquals("person.walkがおかしいよ！", "person.walkがおかしいよ！");
    }

}