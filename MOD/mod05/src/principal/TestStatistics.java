package principal;
public class TestStatistics {
   public static void main(String[] args) {
      Statistics stats = new Statistics();
      float prom1 = stats.average(4, 5, 6);
      float prom2 = stats.average(4, 5, 6, 7);
      System.out.println("promedio de 4, 5 y 6 = " + prom1);
      System.out.println("promedio de 4, 5, 6 y 7 = " + prom2);
   }
}
