package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MarketSteps {

    @Step("выбран пункт меню - {0}")
    public void selectCatalog(String itemName) {
        new MarketPage().selectCatalog(itemName);
    }

    @Step("выбран пункт меню - {0}")
    public void selectCategory(String itemName) {
        new MarketPage().selectCategory(itemName);

    }
}

