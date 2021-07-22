package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    YandexSteps yandexSteps = new YandexSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    ItemSelectSteps itemSelectSteps = new ItemSelectSteps();
    ItemSteps itemSteps = new ItemSteps();

    @When("^на странице яндекса выбран пункт  \"(.+)\"$")
    public void selectMenuItem(String menuName) throws InterruptedException {
        yandexSteps.selectMenuItem(menuName);
    }

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectCatalog(String menuName) {
        marketSteps.selectCatalog(menuName);
    }

    @When("^выбрана общая категория товаров  \"(.+)\"$")
    public void selectCategory(String itemName) {
        marketSteps.selectCategory(itemName);
    }

    @When("^выбрана категория товаров \"(.+)\"$")
    public void selectSubCategory(String item) {
        electronicSteps.selectSubCategory(item);
    }

    @When("^в фильтре указана минимальная цена - \"(.+)\"$")
    public void selectPriceMin(String item) {
        itemSelectSteps.selectPriceMin(item);
    }

    @When("^в фильтре выбрана модель товара - \"(.+)\"$")
    public void selectModel(String item) {
        itemSelectSteps.selectModel(item);
    }
    @When("^в фильтре выбрана модель из полного списка производителей  - \"(.+)\"$")
    public void selectFromAllModel(String item) {
        itemSelectSteps.selectFromAllModel(item);
    }
    @When("^в фильтре выбрана вторая модель товара - \"(.+)\"$")
    public void selectModel2(String item) {
        itemSelectSteps.selectModel(item);
    }

    @Then("^количество элементов на странице  -  \"(.+)\"$")
    public void countOfItems(int expectedNumberOfItems) {
        itemSelectSteps.countOfItems(expectedNumberOfItems);
    }

    @When("^cохранены данные товара: наименование и цена$")
    public void saveDataOfItems() {
        itemSelectSteps.saveDataOfItems();
    }

    @When("^товар указан в поисковой строке$")
    public void enterName() {
        itemSelectSteps.enterName();
    }

    @When("^найден товар по заданным параметрам$")
    public void findItem(){
        itemSelectSteps.findItem();
    }

    @Then("^наименование товара соответствует запомненному значению$")
    public void compareNameItem() {
        itemSteps.compareNameItem();
    }
}
