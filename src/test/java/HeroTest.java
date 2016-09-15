import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertTrue(testHero instanceof Hero);
  }

  @Test
  public void Hero_getsNameCorrectly_true() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertEquals("Superman", testHero.getName());
  }

  @Test
  public void Hero_getsAgeCorrectly_true() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertEquals(100, testHero.getAge());
  }

  @Test
  public void Hero_getsSuperPowerCorrectly_true() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertEquals("Flying", testHero.getSuperPower());
  }

  @Test
  public void Hero_getsWeaknessCorrectly_true() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertEquals("Kryptonite", testHero.getWeakness());
  }
}
