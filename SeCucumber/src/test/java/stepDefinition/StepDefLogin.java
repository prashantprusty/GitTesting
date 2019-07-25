package stepDefinition;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefLogin {

	@Given("^User is on the landing page$")
    public void user_is_on_the_landing_page() throws Throwable {
       
		System.out.println("Given execued");
    }

    @When("^User login with valid (.+) and (.+)$")
    public void user_login_with_valid_and(String uname, String pass) throws Throwable {
        
    	System.out.println("When execued for username as:" + uname + " and password as : "+ pass);
    }

    @Then("^Login sucessfull$")
    public void login_sucessfull() throws Throwable {
    	System.out.println("THen execued");
    	
    }

    @And("^Home page displayed$")
    public void home_page_displayed() throws Throwable {
    	System.out.println("Then And executed");
        
    }

    @Then("^Verify home info$")
    public void Verifyhomeinfo() throws Throwable {
    	System.out.println("THen execued");
    	
    }


}