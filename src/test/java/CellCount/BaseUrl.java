package CellCount;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by monk on 2/17/2017.
 */
public class BaseUrl {
    {

        Configuration.holdBrowserOpen = true;

    }

    @Test
    public void open() {
        Selenide.open("http://www.rapidtables.com/web/tools/html-table-generator.htm");
    }

    public void CellCount() {

        $("#demo>tbody>tr>td").setValue("1");
        SelenideElement FirstCell= $("#demo>tbody>tr>td");
        $("#demo>tbody>tr>td").setValue("2");
        SelenideElement SecondCell=$("#demo>tbody>tr>td");
        SecondCell.shouldHave(Condition.value(FirstCell+"1");





    }
}
