import java.util.Scanner;

public class gitdice{
    public static void main(String[] args){
	    
	Scanner s = new Scanner(System.in);
	System.out.println("What is your name?");
	String st = s.next();
	System.out.println("Hello," + st + "!");
	    
	int number = 6;
	System.out.println("Rolling the dice...");
	int a = 1 + (int)(Math.random() * number);
	System.out.println("dice 1 : " + a);
	int b = 1 + (int)(Math.random() * number);
	System.out.println("dice 2 : " + b);
	int sum = a + b;
	System.out.println("Total value : " + sum);
	
	if(sum > 7){
	    System.out.println(st + " won!");
	}else{
	    System.out.println(st + " lost!");
	}

	// Add a new feature.→ if sum=12, it is maximum value.
	if(sum == 12){
	    System.out.println(st + " got maximum value.");
	}
	    

    }
}
