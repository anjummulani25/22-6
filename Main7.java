import java.util.LinkedList;

public class Main7 {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    
    cars.addLast("Mazda");
    System.out.println(cars);
  }
}
