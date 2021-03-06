import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SquadTest {
  @After
  public void tearDown() {
    Squad.clear();
    Hero.clear();
  }

  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
    assertTrue(mySquad instanceof Squad);
  }

  @Test
  public void getSquadName_squadInstantiatesWithName_GoodGuys() {
    Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
    assertEquals("Good Guys", mySquad.getSquadName());
  }

  @Test
  public void getSquadGoal_squadInstantiatesWithGoal_FightingBadGuys() {
    Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
    assertEquals("Fighting bad guys", mySquad.getSquadGoal());
  }

  @Test
  public void all_returnsAllInstancesOfSquad_true() {
    Squad squadOne = new Squad("Good Guys", "Fighting bad guys");
    Squad squadTwo = new Squad("Bad Guys", "Fighting good guys");
    assertTrue(Squad.all().contains(squadOne));
    assertTrue(Squad.all().contains(squadTwo));
  }

  @Test
  public void clear_emptiesAllInstancesOfSquad_0() {
    Squad squadOne = new Squad("Good Guys", "Fighting bad guys");
    Squad squadTwo = new Squad("Bad Guys", "Fighting good guys");
    Squad.clear();
    assertEquals(0, Squad.all().size());
  }

  @Test
  public void getId_squadInstantiateWithAnId_1() {
    Squad squadOne = new Squad("Good Guys", "Fighting bad guys");
    assertEquals(1, squadOne.getId());
  }

  @Test
  public void find_returnsSquadWithSameId_secondSquad() {
    Squad squadOne = new Squad("Good Guys", "Fighting bad guys");
    Squad squadTwo = new Squad("Bad Guys", "Fighting good guys");
    assertEquals(Squad.find(squadTwo.getId()), squadTwo);
  }

  @Test
  public void squad_instantiatesArraySize_4() {
    Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
    assertEquals(3, mySquad.getHeroes().length);
  }

  @Test
  public void addHero_addsHeroToArray_true() {
    Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    mySquad.addHero(testHero, 1);
    assertTrue(Arrays.asList(mySquad.getHeroes()).contains(testHero));
  }

  // @Test
  // public void addHeroTest_addsHeroToArray_testHero() {
  //   Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
  //   Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
  //   assertEquals(mySquad.addHeroTest(testHero, 1), testHero);
  // }

  @Test
  public void addHero_returnsNullWhenHeroesMoreThan4_null() {
    Squad mySquad = new Squad("Good Guys", "Fighting bad guys");
    Hero testHero = new Hero("Superman", 100, "Flying", "Kryptonite");
    assertTrue(mySquad.addHero(testHero, 4) == null);
  }
}
