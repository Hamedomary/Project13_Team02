package pages.us_21;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class StudentUtilities {

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}
