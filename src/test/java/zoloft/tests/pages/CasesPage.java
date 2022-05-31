package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CasesPage {
    //locator
    SelenideElement
        telecomMediaButton = $$(".secondary-nav__link").findBy(Condition.text("Телеком и медиа")),
        telecomMediaText = $(".telekom-i-media-text");

    //action

    public void telecomMediaCases() {
        telecomMediaButton.click();
    }

    public void telekomMediaScreenCheck() {
        telecomMediaText.shouldHave(Condition.text("Телеком-компаниям"));
    }
}
