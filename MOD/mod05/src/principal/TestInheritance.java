package principal;
public class TestInheritance {
   public static void main(String[] args) {
      Manager m = new Manager("Juan", new MyDate(20,8,1990), 10000, "Sistemas");
      Employee e = new Employee("Pedro", new MyDate(20,8,2000), 3000);
      m.setName("Samuel");     
      System.out.println("El nombre del manager es: "  + m.getName() );
   }     
}
