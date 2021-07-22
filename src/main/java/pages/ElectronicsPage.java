package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class ElectronicsPage extends BasePage{

    public ElectronicsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectSubCategory(String itemName ) {
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("window.scrollBy(0,900)", "");
        BaseSteps.getDriver().findElement(By.xpath("//a[text() ='" + itemName + "']")).click();
    }
}
