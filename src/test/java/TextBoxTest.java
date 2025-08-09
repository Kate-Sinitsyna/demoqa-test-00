import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {


    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadTimeout = 6000;
    }

    @Test
    void fillFormTest() {

        open("/text-box");
        $("#userName").setValue("Kitty");
        $("#userEmail").setValue("kitty@gmail.com");
        $("#currentAddress").setValue("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA");
        $("#permanentAddress").setValue("PO BOX 705 IRELAND IN 47545-0705 USA");
        $("#submit").click();

        $("#output").$("#name").shouldHave(text("Kitty"));
        $("#output").$("#email").shouldHave(text("kitty@gmail.com"));
        $("#output").$("#currentAddress").shouldHave(text("11250 E STATE ROUTE 69 DEWEY AZ 86327-4422 USA"));
        $("#output").$("#permanentAddress").shouldHave(text("PO BOX 705 IRELAND IN 47545-0705 USA"));

    }

    @Test
    void fillFormTestHW() {
        open("https://demoqa.com/automation-practice-form");
        $("=").setValue("");
        $("=").setValue("");
        $("=").setValue("");
        $("=").setValue("");
        $("=").click();

        $("=").shouldHave(text(""));
    }
}
