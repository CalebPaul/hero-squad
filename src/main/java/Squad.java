import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Squad {
  private String mSquadName;
  private String mSquadGoal;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private Hero[] mHeroes;

  public Squad(String squadName, String squadGoal) {
    mSquadName = squadName;
    mSquadGoal = squadGoal;
    instances.add(this);
    mId = instances.size();
    mHeroes = new Hero[3];
  }

  public String getSquadName() {
    return mSquadName;
  }

  public String getSquadGoal() {
    return mSquadGoal;
  }

  public Hero[] getHeroes() {
    return mHeroes;
  }

  public static List<Squad> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Squad find(int id) {
    return instances.get(id -1);
  }


}
