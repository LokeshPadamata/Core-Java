package abstraction;

interface Panel{
	void turnOnOff();
	void increaseTemp();
	void decreaseTemp();
	void SwingOnOff();
}
class Motherboard implements Panel{
	boolean currentstatus = false;
	int minTemp = 16;
	int maxTemp = 32;
	static int currentTemp=20;
	boolean swing = false;
	public void turnOnOff() {
		if(currentstatus==false) {
			System.out.println("Ac is turned On");
			currentstatus = true;
		}
		else{
			System.out.println("Ac is turned Off");
			currentstatus = false;
		}
	
	}
	public void increaseTemp(){
		if(currentstatus==true) {
			if(currentTemp>minTemp && currentTemp<maxTemp) {
				currentTemp++;
				System.out.println("currentTemp= " + currentTemp);
				if(currentTemp==maxTemp) {
					System.out.println("Maximum Temparature Reached");
				}
			}
			}
	}
	public void decreaseTemp(){ 
		if(currentstatus==true) {
			if(currentTemp>minTemp && currentTemp<maxTemp) {
				currentTemp--;
				System.out.println("currentTemp= " + currentTemp);
			}
			if(currentTemp==minTemp) {
				System.out.println("Minimum Temparature Reached");
			}
		}
	}
	
	public void SwingOnOff() {
		if(currentstatus == true) {
			if(swing==false) {
				System.out.println("Swing is Turned On");
				swing = true;
			}
			else {
				System.out.println("Swing is Turned Off");
				swing = false;
			}
		}	
}}
public class ACRemoteRealtimeUsingInterface {

	public static void main(String[] args) {
		Panel obj = new Motherboard();
		obj.turnOnOff();
		obj.decreaseTemp();
		obj.SwingOnOff();
		obj.SwingOnOff();
	}
}
