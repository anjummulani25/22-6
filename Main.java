import java.util.ArrayList;
public class Main
{
public static void main(String[] args)
{
ArrayList<String> cars = new ArrayList<String>();
cars.add("volvo");
cars.add("bmw");
cars.add("ford");
cars.add("audi");
System.out.println(cars);
cars.set(0, "Opel");
System.out.println(cars);
    cars.clear();
System.out.println(cars);


}
}