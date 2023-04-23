package listinterface;
import java.util.Vector;
public class VectorEx {
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();
		vector.add(100);
		vector.add("hello");
		vector.add(100);        //Duplicates are allowed.It is a Dynamic Array
		vector.add(2);
		vector.add(100);
		vector.add(5);
		vector.add(100);
		vector.add(7);
		System.out.println(vector);
		System.out.println("------------------");
		vector.remove(3);
		vector.add(2, 10);
		vector.remove(4);
		System.out.println(vector);
	}

}
