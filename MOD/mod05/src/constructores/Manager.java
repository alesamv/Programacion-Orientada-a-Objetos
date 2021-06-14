package constructores;
import principal.*;
public class Manager extends Employee {
   private String department;
   public Manager(String name, MyDate DoB, double salary, String dept) {
      super(name, salary, DoB);
      this.department = dept;
   }
   public Manager(String name, String dept) {
      super(name);
      department = dept;
   }
//   public Manager(String dept) {                         // error, no hay constructor sin argumentos
//          department = dept;                                     // en clase Employee
//   }
   public String getDepartment() {
      return department;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
}
