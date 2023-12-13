package uk.co.library.testsuite;


import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Test (groups = {"smoke"})
    public void verifyJobSearchResultUsingDifferentDataSet(){
        homePage.switchToIframe();
        homePage.enterJobTitle("tester");
        homePage.enterLocation("london");
        homePage.selectDistance("10 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("35000");
        homePage.enterMaxSalary("60000");
        homePage.selectSalaryType("Per annum");
        homePage.selectJobType("Contract");
        homePage.clickOnFindJobsButton();
        String actualResult = resultPage.verifyTheResults();
        String expectedResult = actualResult;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test (priority = 1)
    public void verifyJobSearchResultUsingDifferentDataSet1(){
        homePage.switchToIframe();
        homePage.enterJobTitle("software engineer");
        homePage.enterLocation("southampton");
        homePage.selectDistance("5 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("2000");
        homePage.enterMaxSalary("3000");
        homePage.selectSalaryType("Per month");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();
        String actualResult = resultPage.verifyTheResults();
        String expectedResult = actualResult;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test (groups = {"smoke"})
    public void verifyJobSearchResultUsingDifferentDataSet2(){
        homePage.switchToIframe();
        homePage.enterJobTitle("developer");
        homePage.enterLocation("london");
        homePage.selectDistance("15 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("3500");
        homePage.enterMaxSalary("6000");
        homePage.selectSalaryType("Per week");
        homePage.selectJobType("Temporary");
        homePage.clickOnFindJobsButton();
        String actualResult = resultPage.verifyTheResults();
        String expectedResult = actualResult;
        Assert.assertEquals(actualResult,expectedResult);
    }
}
