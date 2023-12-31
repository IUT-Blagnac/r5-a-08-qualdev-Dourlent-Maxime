package dojo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import app.Order;

public class CocktailSteps {
    private Order order;

    @Given("Romeo who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(){
        order = new Order();
        order.declareOwner("Romeo");
    }

    @When("an order is declared for Juliette")
    public void an_order_is_declared_for_juliette(){
        order.declareTarget("Juliette");
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order(){
        List<String> cocktails = order.getCocktails();
        assertEquals(0, cocktails.size());
    }

    @Given("{string} who wants to buy a drink")
    public void string_who_wants_to_buy_a_drink(String string){
        order = new Order();
        order.declareOwner(string);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_string(String string){
        order.declareTarget(string);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_int_cocktail_in_the_order(int nb){
        List<String> cocktails = order.getCocktails();
        assertEquals(nb, cocktails.size());
    }
}