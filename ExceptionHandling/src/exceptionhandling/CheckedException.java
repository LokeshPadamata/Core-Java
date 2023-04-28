package exceptionhandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CheckedException {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		read.readLine(); //checked Exception
		System.out.println("Other code");    //Using Throws Keyword
	}
	
}
