package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class YandexPage extends BasePage{

    public YandexPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuItem(String itemName) throws InterruptedException {
        BaseSteps.getDriver().findElement(By.xpath("//div[text() = '" + itemName + "']")).click();
        String winHandleBefore = BaseSteps.getDriver().getWindowHandle();
        for (String winHandle : BaseSteps.getDriver().getWindowHandles()) {
            if (!winHandle.equals(winHandleBefore)) {
                BaseSteps.getDriver().switchTo().window(winHandle);
                Thread.sleep(3000);
            }}
    }

    public void Search(String itemSearch){
        BaseSteps.getDriver().findElement(By.id("text")).sendKeys(itemSearch);
        BaseSteps.getDriver().findElement(By.xpath("//button[text() = 'Найти']")).click();
    }

    public void clickPage(String itemPage){
        BaseSteps.getDriver().findElement(By.xpath("//b[text() = '" + itemPage + "']")).click();
    }

}
