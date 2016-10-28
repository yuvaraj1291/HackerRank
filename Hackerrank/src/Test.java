import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	Scanner sc=new Scanner(System.in);
		String input=sc.next();
		
		StringBuffer sb=new StringBuffer(input);
		sb.delete(0, 2);
		System.out.println(sb.toString());*/
		
		String a="aaabbcc  ddd ee f";
		String ch11="abaccf";
		char[] ch=ch11.toCharArray();
		for(char c:ch){
			System.out.println(a.contains(String.valueOf(c)));
		}
		char aa='a';
		char b='d';
		int c=b-aa;
		System.out.println(c);
	}
	
}
