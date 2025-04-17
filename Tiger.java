public class Tiger extends Feline 
{
  public Tiger(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The mighty Tiger has arrived");
  }

  public void huntAlone()
  {
    System.out.println("The tiger hunts alone.");
  }
  
  public void swim()
  {
    System.out.println("The tiger swims!");
  }

  public static void growl()
  {
    System.out.println("The tiger growls");
  }

  //added in 4.9.5 step 22
  public static void speak()
  {
    growl();
  }
}

