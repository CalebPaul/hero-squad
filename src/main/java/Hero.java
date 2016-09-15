import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Hero {
  private String mName;
  private int mAge;
  private String mSuperPower;
  private String mWeakness;

  public Hero(String name, int age, String superPower, String weakness) {
    mName = name;
    mAge = age;
    mSuperPower = superPower;
    mWeakness = weakness;
  }

  public String getName(){
    return mName;
  }

  public int getAge(){
    return mAge;
  }

  public String getSuperPower(){
    return mSuperPower;
  }

  public String getWeakness(){
    return mWeakness;
  }
}
