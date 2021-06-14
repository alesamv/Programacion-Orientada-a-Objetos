package principal;
//  @author adanz
public class TestMyDate {
   public static void main(String[] args) {
      MyDate myBirth = new MyDate(22, 7, 2001);
      MyDate theNextWeek = myBirth.addDays(17);
      theNextWeek.print();
   }
}
