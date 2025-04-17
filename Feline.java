public class Feline extends Animal 
{
  public Feline(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The feline arrives.");
  }
  
  public Feline()
  {
    System.out.println("The feline arrives.");
  } 
}