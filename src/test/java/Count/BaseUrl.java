package Count;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class BaseUrl {
    @BeforeClass
    public static void Configuration() {

        Configuration.holdBrowserOpen = true;
        //Configuration.browser="Chrome";
        //ChromeDriverManager.getInstance().setup();
        //startMazimized=false;

    }

    @Test
    public void setValueGoogle() {

        Selenide.open("https://wcca.wicourts.gov/index.xsl");
        Configuration();
        $(".formField").click();
        $(By.name("partyName.lastName")).setValue("John");
        $(By.name("partyName.firstName")).setValue("Smith").shouldHave(Condition.exactText("Smith"));
        //$(By.name("partyName.firstName")).shouldHave(Condition.text("Smith"));

        //SelenideElement firstName=$(By.name("partyName.firstName"));
        //firstName.shouldHave(Condition.text("AB"));
    }}






