package ui.test;

import base.WebTestRunner;
import org.testng.annotations.Test;
import ui.pages.Search;

public class TestSearch extends WebTestRunner {

    @Test
    public void test() {
        Search search = new Search();
        search.search2("Котята");
        search.displaysReferencePenultimateElementList2();
//        search.displaysReferencePenultimateElementList();
    }
}
