package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            careerButton = $$(".main-nav__link").findBy(Condition.text("Ищем сотрудников")),
            cookieButton = $("button[class=cookie-modal__btn]"),
            casesButton = $$(".main-nav__link").findBy(Condition.text("Делаем"));

    //actions
    public MainPage openPage() {
        open("https://www.digitalleague.ru/");
        return this;
    }

    public void careerPageTransfer() {
        careerButton.click();

    }

    public void casesPageTransfer() {
        casesButton.click();

    }

    public void acceptCookie() {
        cookieButton.click();
    }
}
