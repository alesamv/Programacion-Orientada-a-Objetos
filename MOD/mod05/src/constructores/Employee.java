package constructores;
public class Employee {
   private static final double BASE_SALARY = 15000.00;
   protected String name;
   protected MyDate birthDate;
   protected double salary;
   public Employee(String name, double salary, MyDate DoB) {
      this.name = name;
      this.salary = salary;
      this.birthDate = DoB;
   }
   public Employee(String name, double salary) {
      this(name, salary, null);
   }
   public Employee(String name, MyDate DoB) {
      this(name, BASE_SALARY, DoB);
   }
   public Employee(String name) {
      this(name, BASE_SALARY);
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public MyDate getBirthDate() {
      return birthDate;
   }
   public void setBirthDate(MyDate birthDate) {
      this.birthDate = birthDate;
   }
   public double getSalary() {
      return salary;
   }
   public void setSalary(float salary) {
      this.salary = salary;
   }
   @Override
   public boolean equals(Object o) {
      boolean result = false;
      if ((o != null) && (o instanceof Employee)) {
         Employee e = (Employee) o;
         if (getName().equals(e.getName())
               && getBirthDate().equals(e.getBirthDate())) {
            result = true;
         }
      }
      return result;
   }
   @Override
   public int hashCode() {
      return (getName().hashCode() ^ getBirthDate().hashCode());
   }
}
