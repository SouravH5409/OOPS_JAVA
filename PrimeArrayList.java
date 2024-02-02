import java.io.*;
import java.util.*;

class Test{
    public boolean isPrime(int n){
    if (n <= 1) return false;
    for(int i = 2; i <= Math.sqrt(n); i++){
        if(n%i == 0){
            return false;
        }
    }
    return true;
}
}

class PrimeNumList{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        System.out.println("Initial size :"+al.size());
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of the List");
	int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
	System.out.println("Enter the"+(i+1)+"th element");
		al.add(sc.nextInt());
	}
    	System.out.println("Enter the nth prime number(value of n)");
		int find=sc.nextInt();
	Iterator<Integer> itr = al.iterator();
	Test t = new Test();
	int count =0;
    while(itr.hasNext() && count < find){
        int num = itr.next();
        if(t.isPrime(num)){
            count++;
            if(count == find){
                System.out.println("The "+ find+ "th prime no is:" + num);
                break;
            }
        }
    }
    if(count < find)
        System.out.println("Not found");
    }
}


