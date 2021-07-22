package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends BasePage{

    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectCategory(String itemName) {
        BaseSteps.getDriver().findElement(By.xpath("//*[@alt='"+itemName+"']")).click();

    }
    public void selectCatalog(String itemName) {
                BaseSteps.getDriver().findElement(By.xpath("//span[text() ='" + itemName + "']")).click();
            }


}
