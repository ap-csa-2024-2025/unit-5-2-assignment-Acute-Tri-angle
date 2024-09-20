public class Clock
{
  public static void main(String[] args)
  {
    timeOfDay(24);
  }

  // write code for timeOfDay here
public static void timeOfDay (int x){
  if (x == 12){
    System.out.println("noon");
  }
  else if (x == 0){
    System.out.println("midnight");
  }
  else if (x == 18){
    System.out.println("dusk");
  }
  else if (x > 0 && x < 12){
    System.out.println("morning");
  }
  else if (x > 12 && x < 18){
    System.out.println("afternoon");
  }
  else if (x > 18 && x < 24){
    System.out.println("evening");
  }
  else {
    System.out.println("invalid input");
  }
}
}
