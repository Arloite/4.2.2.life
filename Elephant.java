public class Elephant extends Animal{
    public Elephant(String food, boolean nocturnal, double aveLifeSpan){
    super(food, nocturnal, aveLifeSpan);
    System.out.println("The mighty elephant has arrived");
}
public Elephant(){
    System.out.println("The mighty elephant has arrived");
    }
  public void trumpet()
  {
    System.out.println("The elephant trumpets loudly!");
  }
  
  public void forage()
  {
    System.out.println("The elephant forages for food.");
  }
}