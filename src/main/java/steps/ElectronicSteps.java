package steps;

import pages.ElectronicsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {

    @Step("выбрана категория товаров - {0}")
    public void selectSubCategory(String itemName) {
        new ElectronicsPage().selectSubCategory(itemName);
    }
}
