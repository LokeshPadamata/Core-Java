package exceptionhandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Checked_UsingTryCatch {
	public static void main(String[] args){
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			read.readLine();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
	
}
