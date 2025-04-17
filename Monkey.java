/*
 * Activity 4.9.2
 */
public class Monkey extends Primate
{
  public void climb()
  {
    System.out.println("The monkey climbs.");
  }
  
  public static void hoot()
  {
    System.out.println("The monkey hoots.");
  }
  
  public static void howl()
  {
    System.out.println("The monkey howls.");
  }

  //added in 4.9.5 step 22
  public static void speak()
  {
    hoot();
    howl();
  }
}