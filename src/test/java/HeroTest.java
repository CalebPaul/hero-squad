import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @After
  public void tearDown() {
    Hero.clear();
  }

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

  @Test
  public void all_returnsAllInstancesOfHero_true() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    Hero otherHero = new Hero("Spiderman", 19, "SpideySense", "MaryJane");
    assertEquals(true, Hero.all().contains(testHero));
    assertEquals(true, Hero.all().contains(otherHero));
  }

  @Test
  public void clear_emptiesAllHerosFromArrayList_0() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    Hero.clear();
    assertEquals(0, Hero.all().size());
  }

  @Test
  public void getId_herosInstantiatesWithAnId_1() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertEquals(1, testHero.getId());
  }

  @Test
  public void find_returnsHeroWithSameId_otherHero() {
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    Hero otherHero = new Hero("Spiderman", 19, "SpideySense", "MaryJane");
    assertEquals(otherHero, Hero.find(otherHero.getId()));
  }
}
