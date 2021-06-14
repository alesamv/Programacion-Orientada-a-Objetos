package principal;
public class TestHashCode {
   public static void main(String[] args) {
      Employee emp1 = new Employee("Fred Smith", new MyDate(24, 1, 1996), 25000.0F);
      System.out.println("El hash code de Employee es: " + emp1.hashCode());
   }
}
