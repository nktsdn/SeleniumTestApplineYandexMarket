package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class ItemSelectPage extends BasePage{

    public static int numberActual;
    public static String nameFirstItem, nameSearchItem;
    public static String price, priceSearchItem;


    public ItemSelectPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectPriceMin(String priceMin){
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("window.scrollBy(0,900)", "");
        BaseSteps.getDriver().findElement(By.xpath("//*[@name='Цена от']")).sendKeys(priceMin);
    }

    public void selectModel(String modelItem){
        BaseSteps.getDriver().findElement(By.xpath("//span[text() = '"+modelItem+"']")).click();
    }

    public void selectFromAllModel(String modelItem){
        BaseSteps.getDriver().findElement(By.xpath("//span[text() = '"+modelItem+"']")).click();
    }

    public void countOfItems() {
        numberActual =  BaseSteps.getDriver().findElements(By.xpath("//*[@data-zone-name='snippetList']")).size();
    }

    public void saveDataOfItems(){
        nameFirstItem = BaseSteps.getDriver().findElement(By.xpath("//*[@data-zone-name='title']")).getText();
        price = BaseSteps.getDriver().findElement(By.xpath("//*[@data-zone-name='price']/div/a/div/span/span[1]")).getText();
        System.out.println("наименование первого товара в списке: " + nameFirstItem);
        System.out.println("цена товара: " + price);
    }

    public void enterName(String nameSelectItem){
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("window.scrollBy(0,-5000)", "");
        BaseSteps.getDriver().findElement(By.xpath("//*[@id='header-search']")).sendKeys(nameSelectItem);
        BaseSteps.getDriver().findElement(By.xpath("//span[contains(text(),'Найти')]")).click();
    }

    public void findItem(){
            nameSearchItem = BaseSteps.getDriver().findElement(By.xpath("//*[@data-zone-name='title']")).getText();
            priceSearchItem = BaseSteps.getDriver().findElement(By.xpath("//*[@data-zone-name='price']/div/a/div/span/span[1]")).getText();
     }

    }











































