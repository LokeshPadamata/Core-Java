package strings;

public class CharecterOccuranceCount {

	public static void main(String[] args) {
		String str = "hello how are you";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='h') {
				count++;
			}
		}
		System.out.println(count);
	}

}
