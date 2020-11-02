import java.util.Scanner;
public class Quiz1 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your height in feet and inches ");
		int feet=obj.nextInt();
		int inches=obj.nextInt();
		
		int totalinches=((feet-5)*12)+inches;
		int idealweightfemale=(totalinches*5)+40;
		int idealweightmale=(totalinches*6)+50;
		
		System.out.println("Ideal weight for female is " +idealweightfemale+ " kg.");
		System.out.println("Ideal weight for male is " +idealweightmale+ " kg.");
	}

}
