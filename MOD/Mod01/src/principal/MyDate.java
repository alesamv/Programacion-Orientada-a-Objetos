package principal;
public class MyDate {
   private int day;
   private int month;
   private int year;
   public int getDay() {
      return day;
   }
public boolean setDay(int day) {
      // valida day y regresa falso si es inválido
      return false;
   }
   // métodos similares para month y year
}
