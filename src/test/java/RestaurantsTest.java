import org.junit.*;
import static org.junit.Assert.*;

public class RestaurantsTest {

  @Test
  public void Restaurants_instantiatesCorrectly_true() {
    Restaurants myRestaurants = new Restaurants("Utopia");
    assertEquals(true, myRestaurants instanceof Restaurants);
  }
  @Test
  public void Restaurants_instantiatesWithDescription_true() {
  Restaurants myRestaurants = new Restaurants("Utopia");
  assertEquals("Utopia", myRestaurants.getDescription());
  }
}
