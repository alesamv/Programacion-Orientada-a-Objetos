package principal;
public class ShortCircuit {
   public static void main(String[] args) {
      MyDate d = null;
      // Con Short Circuit
      System.out.println("Antes de Con Short Circuit");
      if ((d != null) && (d.day > 31)) {
         System.out.println("       Dentro del if con Short Circuit");
      }
      System.out.println("Después de Con Short Circuit");
      // Sin Short Circuit
      System.out.println("Antes de Sin Short Circuit");
      if ((d != null) & (d.day > 31)) {
         System.out.println("       Dentro del if sin Short Circuit");
      }
      System.out.println("Después de Sin Short Circuit");
   }
}
class MyDate {
   int day;
   int month;
   int year;
}
