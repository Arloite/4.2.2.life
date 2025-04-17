public class Penguin extends Bird
{
  public void fish()
  {
    System.out.println("The penguin hunts for fish");
  }

  public static void chirp()
  {
    System.out.println("The penguin chirps");
  }

  //added in 4.9.5 step 22
  public static void speak()
  {
    chirp();
  }
}
