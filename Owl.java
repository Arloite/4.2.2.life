public class Owl extends Bird
{
  public Owl(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An owl arrived");
  }
  
  public Owl()
  {
    System.out.println("An owl arrived");
  }
  
  public void hunt()
  {
    System.out.println("The owl hunts and preys");
  }

  public static void hoot()
  {
    System.out.println("The owl hoots");
  }

  //added in 4.9.5 step 22
  public static void speak()
  {
    hoot();
  }
}