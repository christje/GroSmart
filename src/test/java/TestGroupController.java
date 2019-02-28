/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris
 */
public class TestGroupController {
    
    public TestGroupController() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test public void user_resource_returns_200_with_expected_size() {
        given().
        when().
            get("http://localhost:8095/GroSmart/api/groups/all").
        then().
            assertThat().
            body("id",hasSize(1));
    }
    
    @Test public void user_resource_returns_200_with_expected_id() {
        given().
        when().
            get("http://localhost:8095/GroSmart/api/groups/{id}", 1).
        then().
            body("name", is("Domus"));
    }
}
