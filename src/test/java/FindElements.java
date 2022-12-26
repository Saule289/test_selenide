
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindElements {
    @Test
    void successfulFindElement() {
        // Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");

        // Перейти в раздел Wiki
        $("#wiki-tab").click();


        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();



//Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit 5

        $("div.markdown-body").shouldHave(text(" Using JUnit5 extend test class"));

        sleep(5000);
}
}