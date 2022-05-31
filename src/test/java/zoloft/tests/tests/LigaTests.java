package zoloft.tests.tests;

import zoloft.tests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class LigaTests extends TestBase {

    @Test
    @Description("Проверка работы страницы 'Ищем сотрудников'")
    @DisplayName("Работа в Лиге")
    void careerPageTest() {
        step("Открываем сайт Лиги", () -> {
           mainPage.openPage();
        });

        step("Нажимаем кнопку 'Ишем сотрудников'", () -> {
            mainPage.careerPageTransfer();
        });

        step("Проверяем, что мы на верной странице", () -> {
            careerPage.careerPageCheck();
        });
    }

    @Test
    @Description("Проверка работы станицы 'Делаем'")
    @DisplayName("Кейсы")
    void casesPageTest() {
        step("Открываем сайт Лиги", () -> {
            mainPage.openPage();
        });

        step("Переходим на страницу 'Делаем'", () -> {
            mainPage.casesPageTransfer();
            mainPage.acceptCookie();
        });

        step("Выбираем раздел 'Телеком и Медиа'", () -> {
            casesPage.telecomMediaCases();
        });

        step("Проверяем, что мы на верном экране", () -> {
            casesPage.telekomMediaScreenCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт Лиги", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Лига Цифровой Экономики";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт Лиги", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}