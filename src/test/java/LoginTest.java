import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class LoginTest {
    @Test
    void successfulLoginTest() {

        open("https://dobrozaim.ru");
        $(".header__personal").shouldHave(text("Личный кабинет"));

    }


}
