package ui.pages;

import base.WebTestRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.collections.SizeGreaterThan;
import com.codeborne.selenide.collections.SizeLessThan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.constants.Colors.*;
import static base.utils.Wait.waitElement;
import static base.utils.Wait.waitSec;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Search extends WebTestRunner {

//    public Search() {PageFactory.initElements(webDriver, this);}

    @FindBy(name = "text")
    private WebElement inputSearch;
    SelenideElement inputSearch2 = $(By.name("text"));

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;
    SelenideElement submitButton2 = $("[type='submit']");

    @FindBy(xpath = "(//h2[contains(@class, 'organic__title-wrapper')]//child::a)[last()-1]")
    private WebElement penultimateItemInTheList;

    private ElementsCollection elementsList = $$(".serp-item h2>a");

    public void search(String searchText) {
        waitElement(inputSearch, webDriver);
        inputSearch.sendKeys(searchText);
        waitElement(submitButton, webDriver);
        submitButton.click();
    }

    public void search2(String searchText) {
        inputSearch2.sendKeys(searchText);
        submitButton2.click();
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
        SelenideElement element = elementsList.get(elementsList.size()-2).shouldBe(Condition.visible);
        String link = element.getAttribute("href");
        System.out.println(link);
        element.click();
    }
}
