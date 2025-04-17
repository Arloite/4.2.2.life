/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public static void groan()
  {
    System.out.println("The hippo groans.");
  }

  // added in 4.9.5
  public static void speak()
  {
    groan();
  }
}