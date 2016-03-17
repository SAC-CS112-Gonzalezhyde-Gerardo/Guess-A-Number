import java.util.Scanner; 

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in );
		
		int computer;
		int user;
		
		System.out.println("Enter a Number");
		user = input.nextInt();
	
		
		System.out.println("Computer Entered: ");
		computer = 0 + (int) (Math.random() * 10);
		System.out.println(computer);
		
		if(user==computer)
			System.out.println("Your number is correct");
		if(user>computer)
			System.out.println("Your number is bigger");
		if(user<computer)
			System.out.println("Your number is smaller");
			

	}

}
