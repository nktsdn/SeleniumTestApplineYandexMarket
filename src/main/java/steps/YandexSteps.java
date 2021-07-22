package steps;

import pages.YandexPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexSteps{

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String itemName) throws InterruptedException {
        new YandexPage().selectMenuItem(itemName);
    }

    @Step("выбран пункт меню {0}")
    public void Search(String itemSearch){
        new YandexPage().Search(itemSearch);

    } @Step("выбран пункт меню {0}")
    public void clickPage(String itemPage){
        new YandexPage().clickPage(itemPage);
    }

}
