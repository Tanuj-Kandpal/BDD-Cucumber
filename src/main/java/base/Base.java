package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

    public WebDriver driver;
    public Properties prop;

    /**
     *
     * @param browser
     * @return WebDriver
     */
    public WebDriver initializeBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("ie")) {

            driver = new InternetExplorerDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        return driver;

    }

    public void loadProjectDataProperties() {

        prop = new Properties();

        String projectPath = System.getProperty("user.dir");

        File file = new File(projectPath + "/src/main/java/resources/ProjectData.properties");

        try {

            FileInputStream fis = new FileInputStream(file);

            prop.load(fis);

        } catch (Throwable t) {

            System.out.println(t.getMessage());

        }

    }
}
