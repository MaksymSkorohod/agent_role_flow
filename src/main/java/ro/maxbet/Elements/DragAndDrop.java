package ro.maxbet.Elements;
import ro.maxbet.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop extends BaseElement {

    private By locatorSource;
    private By locatorTarget;

    public DragAndDrop(By locatorSource, By locatorTarget, String description) {
        super(locatorSource, locatorTarget, description);
        this.locatorSource = locatorSource;
        this.locatorTarget = locatorTarget;
    }

    public void DragAndDropElement() {
        WebDriver driver = DriverManager.getDriver();
        WebElement webElementSource = driver.findElement(locatorSource);
        WebElement webElementTarget = driver.findElement(locatorTarget);
        Actions actionProvider = new Actions(driver);
        actionProvider.dragAndDrop(webElementSource, webElementTarget)
                .build()
                .perform();
    }
}
