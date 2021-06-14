package principal;
public class Employee {
   protected String name;
   protected MyDate birthDate;
   protected float salary;
   public Employee(String name, MyDate DoB, float salary) {
      this.name = name;
      this.birthDate = DoB;
      this.salary = salary;
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
   public float getSalary() {
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
