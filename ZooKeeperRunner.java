/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  //added in step 23 4.9.5, not static because I don't want to change all of the prev code to be static, all hear the animal calls are post step 23
  public static void hearTheAnimal(Animal animal)
  {
    Animal.speak();
  }
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
    hearTheAnimal(gorilla);
    // animal > hooved > giraffe
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    hearTheAnimal(giraffe);
    // animal > hooved > hippo
    Hippo hippo = new Hippo();
    hippo.eat();
    hearTheAnimal(hippo);
    // animal > bird > Penguin
    Penguin penguin = new Penguin();
    penguin.fish();
    hearTheAnimal(penguin);
    // animal > bird > Owl
    Owl owl = new Owl();
    owl.hunt();
    hearTheAnimal(owl);
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    hearTheAnimal(owl2);
    //
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    //a.trumpet();
    Animal a1 = new Animal();
    a1.sleep();
    //Object a2 = new Animal();
    //a2.sleep();
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());
    Animal a3 = new Animal();
    System.out.println(a3.toString());
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());
  }
}
