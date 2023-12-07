import java.util.*;
class SToken{
	public static void main(String[] args){
		String expression;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers:");
		expression = s.nextLine();
		StringTokenizer st = new StringTokenizer(expression,",");
		while(st.hasMoreTokens()){
			String a =st.nextToken();
			System.out.print(a);
			sum+=Integer.parseInt(a);
		}
		System.out.println();
		System.out.println("Sum = "+sum);
	}
}		
