/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    elephant.sleep();
    elephant.eat();
    Gorilla gorilla = new Gorilla();
    
  }
}