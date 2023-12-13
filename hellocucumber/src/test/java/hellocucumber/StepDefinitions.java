package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private String today;
    private String answer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    @Given("It is Sunday")
    public void it_is_sunday(){
        today = "Sunday";
    }

    @When("The user asks if it is Friday")
    public void the_user_asks_if_it_is_friday(){
        answer = IsItFriday.isItFriday(today);
    }

    @Then("Say {string}")
    public void say(String string){
        assertEquals(string, answer);
    }


    @Given("today is {string}")
    public void today_is_Friday(String day){
        today = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet(){
        answer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string){
        assertEquals(string, answer);
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "no";
    }
}
