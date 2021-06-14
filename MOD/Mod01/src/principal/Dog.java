package principal;
public class Dog {
   private int weight;
   public Dog() {			// Constructor 1
      weight = 42;
   }
   public Dog(int kilos) {		// Constructor 2
      weight = kilos;
   }
   public int getWeight() {
      return weight;
   }
}
