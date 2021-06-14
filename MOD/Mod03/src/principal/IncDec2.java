package principal;
//  @author adanz
public class IncDec2 {
// Demonstrate ++ and --.
   public static void main(String args[]) {
      int i = 4;
      int j = 6;
      int x = 0;
      int y = 0;
      int z = 0;
      x = i++;
      System.out.println("x =  " + x + " i = " + i);
      y = --j;
      System.out.println("y =  " + y + " j = " + j);
      z = i-- + ++j;
      System.out.println("z =  " + z + " i = " + i + " j = " + j);
   }
}
