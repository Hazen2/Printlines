// Showing the difference between println and print
public class Printlines
{
  public static void main(String[] args)
  {
    System.out.println("println will advance the cursor to the next line after output");
    System.out.print("However, print will ");
    System.out.print("not advance to the next line after output.");
    
    // Discuss escape sequence /n
    System.out.print("You may also use an escape sequence like so: \nApples \nGrapes \nTurtles");
  }
}
