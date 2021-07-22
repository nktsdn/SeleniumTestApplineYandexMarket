package pages;


import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import static org.junit.Assert.assertEquals;
import static pages.ItemSelectPage.nameFirstItem;
import static pages.ItemSelectPage.price;


public class ItemPage extends BasePage {


    public ItemPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void compareNameItem()  {

        String nameSearchItem = new ItemSelectPage().nameSearchItem;
        String priceSearchItem = new ItemSelectPage().priceSearchItem;
        assertEquals(String.format("Наименование товара - [%s]. Ожидалось наименование товара - [%s]",
                nameSearchItem, nameFirstItem), nameSearchItem, nameFirstItem);
        assertEquals(String.format("Цена товара - [%s]. Ожидалась цена товара - [%s]",
                priceSearchItem, price), priceSearchItem, price);
    }
}
