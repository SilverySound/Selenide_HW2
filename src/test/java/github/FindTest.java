package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindTest {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

@Test
void SolutionsEnterprizeHover() {

    open("https://github.com");
    $(".header-menu-wrapper").$(byText("Solutions")).hover();
    $$("a.HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
    $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));

}
}