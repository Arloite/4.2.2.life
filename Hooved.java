/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The Hooved animal arrives.");
  }
  
  public Hooved()
  {
    System.out.println("The Hooved animal arrives.");
  }

  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}