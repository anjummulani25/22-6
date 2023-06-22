import java.util.LinkedList;

public class Main9{
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    cars.removeLast();
    System.out.println(cars);
  }
}
