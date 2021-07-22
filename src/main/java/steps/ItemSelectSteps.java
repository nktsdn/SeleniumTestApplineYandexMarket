package steps;
import pages.ItemSelectPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;
import static pages.ItemSelectPage.*;

public class ItemSelectSteps {

    @Step("в фильтре установлена минимальная цена - {0}")
    public void selectPriceMin(String priceMin){
        new ItemSelectPage().selectPriceMin(priceMin);
    }

    @Step("в фильтре выбрана модель - {0}")
    public void selectModel(String modelTV){
        new ItemSelectPage().selectModel(modelTV);
    }

    @Step("в фильтре выбрана модель из полного списка производителей  - {0}")
    public void selectFromAllModel(String modelTV){
        new ItemSelectPage().selectFromAllModel(modelTV);
    }

    @Step("количество элементов на странице -   {0}")
    public void countOfItems(int expectedNumberOfItems) {
        new ItemSelectPage().countOfItems();

        int actualNumberOfItems = new ItemSelectPage().numberActual;
        actualNumberOfItems *= 3; //количество блоков по 3 записи
        assertEquals(String.format("Товаров на странице - [%s]. Ожидалось - [%s]",
                actualNumberOfItems, expectedNumberOfItems), actualNumberOfItems, expectedNumberOfItems);
    }

    @Step("cохранены данные товара")
    public void saveDataOfItems() {
        new ItemSelectPage().saveDataOfItems();
    }

    @Step("товар указан в поисковой строке")
    public void enterName() {
        new ItemSelectPage().enterName(nameFirstItem);
    }

    @Step("найден товар по заданным параметрам")
    public void findItem() {
        new ItemSelectPage().findItem();
    }

}
