package strings;

public class CountOfEachCharecter {
		public static void main(String[] args) {
				String str="hi hello";
				int count=0;

				for (int j=0;j<str.length();j++) {

					for (int i=0;i<str.length();i++) {
						if (str.charAt(i)==str.charAt(j)) {
							count++;
						}
					}	
					System.out.println(str.charAt(j)+" -> Occurs "+count+ " times");
					count=0;
				}
			
			}
		}