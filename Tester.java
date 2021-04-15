public class Tester
{
  public static void main(String[] args)
  {
    Squirrel s1 = new Squirrel(1, 3);
    s1.move(2);
    System.out.println(s1.toString());
    GreySquirrel gs1 = new GreySquirrel(2, 1);
    gs1.move(2);
    System.out.println(gs1.toString());
    FlyingSquirrel fs1 = new FlyingSquirrel(1, 1);
    fs1.move(2);
    System.out.println(fs1.toString());
    Sloth s2 = new Sloth(1, 3);
    s2.move(2);
    System.out.println(s2.toString());
  }
}