package ui.pages;

import base.WebTestRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.constants.Colors.*;
import static base.utils.Wait.waitElement;
import static com.codeborne.selenide.Selenide.$$;

public class Search extends WebTestRunner {

    public Search() {PageFactory.initElements(webDriver, this);}

    @FindBy(name = "text")
    private WebElement inputSearch;

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "(//h2[contains(@class, 'organic__title-wrapper')]//child::a)[last()-1]")
    private WebElement penultimateItemInTheList;

    public ElementsCollection elementsList = $$(".serp-item h2>a");

    public void search(String searchText) {
        waitElement(inputSearch, webDriver);
        inputSearch.sendKeys(searchText);
        waitElement(submitButton, webDriver);
        submitButton.click();
    }

    /**
     * Displays the reference of the penultimate element in the list
     */
    public void displaysReferencePenultimateElementList() {
        waitElement(penultimateItemInTheList, webDriver);
        String link = penultimateItemInTheList.getAttribute("href");
        System.out.println("\n\n"
                + ANSI_RED + "Вот она ссылка: " + ANSI_RESET + link + "\n\n");
        penultimateItemInTheList.click();
    }

    public void displaysReferencePenultimateElementList2() {
        elementsList.last(2);
    }
}
