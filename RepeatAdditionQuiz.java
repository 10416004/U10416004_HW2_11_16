//U10416004 

import java.util.Scanner;
import java.util.*;

public class RepeatAdditionQuiz{
	public static void main(String[] args){
		int A = (int)(Math.random() * 10);
		int B = (int)(Math.random() * 10);
		int ans;
		ArrayList arraylist = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is " + A + "*" + B + " ?");
		ans = scanner.nextInt();
	
	
	while(A*B!= ans){
		if(arraylist.contains(ans)){
			System.out.println("You already entered " + ans );
		}
		System.out.print("Wrong answer. Try again.What is " + A + "*" + B + " ?");
		arraylist.add(ans);
		ans = scanner.nextInt();
	}
	System.out.print("You got it!");
	}
}