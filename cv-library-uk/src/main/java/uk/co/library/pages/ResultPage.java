package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    By resultText = By.xpath("//main[@id='site-main']/div[1]/div[1]/div[2]/div[1]/div[1]/h1");

    public String verifyTheResults(){
        return getTextFromElement(resultText);
    }
}
