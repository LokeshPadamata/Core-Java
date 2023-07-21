import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String id;
    String name;
    String address;
    Employee(String id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("1", "Raju", "Hyderabad");
        Employee e2 = new Employee("2", "Ravi", "Banglore");
        Employee e3 = new Employee("3", "Ashok", "Chennai");
        Employee e4 = new Employee("4", "Kailash", "Delhi");
        Employee e5 = new Employee("5", "Syam", "Pune");
        Employee e6 = new Employee("6", "Vishnu", "Kolkata");
        Employee e7 = new Employee("7", "Eswar", "Haryana");
        HashMap<String, Employee> map = new HashMap<String, Employee>();
        map.put(e1.id, e1);
        map.put(e2.id, e2);
        map.put(e3.id, e3);
        map.put(e4.id, e4);
        map.put(e5.id, e5);
        map.put(e6.id, e6);
        map.put(e7.id, e7);
        System.out.println("Map is:");
        System.out.println(map);
        List<Map<String,Employee>> list = new ArrayList<Map<String,Employee>>();
        System.out.println("List is:");
        System.out.println(list);
//        list.stream().sorted(Comparator.comparing()).collect(Collectors.toList());
    }
}