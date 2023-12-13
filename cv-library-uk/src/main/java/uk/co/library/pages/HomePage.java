package uk.co.library.pages;

import org.openqa.selenium.By;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

   By jobTitle1 = By.xpath("//div[@class='hps-jobtitle hps-transition']/input");
   By location1 = By.xpath("//div[@class='hps-location hps-transition']/input");
   By distanceDropDown1 = By.xpath("//div[@class='hps-distance hps-transition']/select");
   By moreSearchOptionsLink1 = By.xpath("//div[@class='hp-search-more']/button");
   By salaryMin1 = By.xpath("//div[@class='hps-sal-min']/input");
   By salaryMax1 = By.xpath("//div[@class='hps-sal-max']/input");
   By salaryTypeDropDown1 = By.xpath("//div[@class='hps-sal-type']/select");
   By jobTypeDropDown1 = By.xpath("//div[@class='hps-jobtype']/select");
   By findJobsButton1 = By.xpath("//div[@class='hp-search-top']/input");

   public void switchToIframe(){
      driver.switchTo().frame("gdpr-consent-notice");
      clickOnElement(By.xpath("//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]"));
      driver.switchTo().defaultContent();
   }
   public void enterJobTitle(String jobTitle){
      sendTextToElement(jobTitle1, jobTitle);
   }
   public void enterLocation(String location){
      sendTextToElement(location1,location);
   }
   public void selectDistance(String distance){
      selectByVisibleTextFromDropDown(distanceDropDown1,distance);
   }
   public void clickOnMoreSearchOptionLink(){
      clickOnElement(moreSearchOptionsLink1);
   }
   public void enterMinSalary(String minSalary){
      sendTextToElement(salaryMin1,minSalary);
   }
   public void enterMaxSalary(String maxSalary){
      sendTextToElement(salaryMax1, maxSalary);
   }
   public void selectSalaryType(String sType){
      selectByVisibleTextFromDropDown(salaryTypeDropDown1,sType);
   }
   public void selectJobType(String jobType){
      selectByVisibleTextFromDropDown(jobTypeDropDown1,jobType);
   }
   public void clickOnFindJobsButton(){
      clickOnElement(findJobsButton1);
   }
}
