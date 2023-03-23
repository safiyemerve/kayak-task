package com.kayak.stepDefinition;

import com.kayak.page.Kayak_home_page;
import com.kayak.util.ConfigurationReader;
import com.kayak.util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kayakStepDefinition {

    Kayak_home_page kayak_home_page = new Kayak_home_page();

    @Given("user on the kayak")
    public void user_on_the_kayak() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);

    @When("user search for a trip between two cities of your choice for the next weekend")
    public void user_search_for_a_trip_between_two_cities_of_your_choice_for_the_next_weekend() throws InterruptedException {


        kayak_home_page.to.sendKeys("new york");
        Thread.sleep(5000);
        kayak_home_page.to.sendKeys(Keys.ENTER);
        kayak_home_page.departDate.click();
        wait.until(ExpectedConditions.elementToBeClickable(kayak_home_page.previousMonth));
        kayak_home_page.previousMonth.click();
        wait.until(ExpectedConditions.elementToBeClickable(kayak_home_page.march));
        kayak_home_page.march.click();
        kayak_home_page.april.click();
       // JavascriptExecutor js=((JavascriptExecutor) Driver.getDriver());

        //js.executeScript("document.querySelector('kayak_home_page.searchButton').click();");

        kayak_home_page.searchButton.click();
/*
       // Driver.getDriver().switchTo().frame(kayak_home_page.iframe);
       // wait.until(ExpectedConditions.elementToBeClickable(kayak_home_page.popUp));
        //kayak_home_page.popUp.click();

        Thread.sleep(5000);
      Driver.getDriver().switchTo().parentFrame();
      kayak_home_page.searchButton.click();

 */








    }

    @When("users go to the offer page")
    public void users_go_to_the_offer_page() {

    }

    @When("select cheapest ticket")
    public void select_cheapest_ticket() {

    }

    @Then("verify that the offer is the same as the one listed in kayak")
    public void verify_that_the_offer_is_the_same_as_the_one_listed_in_kayak() {

    }
}
