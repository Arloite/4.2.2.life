public class Lion extends Feline
{
    public Lion()
    {
        System.out.println("The lion relies");
    }

    public static void roar()
    {
        System.out.println("The lion roars");
    }

    //added in 4.9.5 step 22
    public static void speak()
    {
        roar();
    }
}
