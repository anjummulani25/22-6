import java.util.LinkedList;

public class Main6 {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
  
    cars.addFirst("Mazda");
    System.out.println(cars);
  }
}
