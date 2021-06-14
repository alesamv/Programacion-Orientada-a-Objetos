//package principal;
public class ScopeExample {
   private int i = 1;
   public void firstMethod() {
      int i = 4, j = 5;
      int z;
      this.i = i + j;
      secondMethod(7);
   }
   public void secondMethod(int i) {
      int j = 8;
      this.i = i + j;
      System.out.println("Variable de instancia i = " + this.i);
      System.out.println("Variable local i = " + i);
   }
}
