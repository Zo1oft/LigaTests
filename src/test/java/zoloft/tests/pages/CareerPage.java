package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    //locators
    SelenideElement
    careerPageTitle = $(".font-header");


    //actions
    public void careerPageCheck() {
        careerPageTitle.shouldHave(Condition.text("Работа в Лиге"));
    }
}
