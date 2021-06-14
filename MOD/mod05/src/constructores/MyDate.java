package constructores;
public class MyDate {
   private int day;
   private int month;
   private int year;
   public MyDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   public MyDate() {
      this(1, 1, 1970);
   }
   public MyDate(MyDate date) {
      this.day = date.day;
      this.month = date.month;
      this.year = date.year;
   }
   public int getDay() {
      return day;
   }
   public void setDay(int day) {
      this.day = day;
   }
   public int getMonth() {
      return month;
   }
   public void setMonth(int month) {
      this.month = month;
   }
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
   }
     public boolean equals(MyDate d) {
      boolean result = false;
      if (d != null) {
         if ((getDay() == d.getDay()) && (getMonth() == d.getMonth())
               && (getYear() == d.getYear())) {
            result = true;
         }
      }
      return result;
   }
   public int hashCode() {
      return ((new Integer(getDay()).hashCode())
            ^ (new Integer(getMonth()).hashCode())
            ^ (new Integer(getYear()).hashCode()));
   }
}
