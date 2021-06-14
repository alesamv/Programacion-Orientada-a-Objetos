package principal;
public class Manager extends Employee {
   private String department;
  public Manager(String name, MyDate DoB, float salary, String dept) {
      super(name, DoB, salary);
      this.department = dept;
   }
   public String getDepartment() {
      return department;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
}
