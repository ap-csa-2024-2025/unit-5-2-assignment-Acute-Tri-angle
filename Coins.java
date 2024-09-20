public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(95268);
  }

  // write code for coinConverter
public static void coinConverter (int x){
  if (x<0){
    System.out.println("invalid input");
  }
  else{
    int y = x / 100;
    System.out.println("Dollar bills: " + y);
    y = x % 100 / 25;
    System.out.println("Quarters: " + y);
    y = x % 100 % 25 / 10;
    System.out.println("Dimes: " + y);
    y = x % 100 % 25 % 10 / 5;
    System.out.println("Nickels: " + y);
    y = x % 100 % 25 % 10 % 5;
    System.out.println("Pennies: " + y);
  }
}
}
