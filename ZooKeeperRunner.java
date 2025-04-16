/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    // animal > elephant 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    // animal > feline > tiger 
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    elephant.sleep();
    elephant.eat();
    // animal > primate > gorilla 
    Gorilla gorilla = new Gorilla();
    gorilla.eat();
    // animal > hooved > giraffe
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    // animal > hooved > hippo
    Hippo hippo = new Hippo();
    hippo.eat();
    // animal > bird > Penguin
    Penguin penguin = new Penguin();
    penguin.fish();
    // animal > bird > Owl
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
  }
}