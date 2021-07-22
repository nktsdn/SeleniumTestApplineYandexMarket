package steps;

import pages.ItemPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ItemSteps {

    @Step("имя товара соответствует запомненному значению")
    public void compareNameItem() {
        new ItemPage().compareNameItem();
    }
}
