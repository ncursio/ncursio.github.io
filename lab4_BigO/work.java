package lab4;
import java.util.Scanner;
public class work {

	public static void main(String[] args) {
		int list[]=new int [5];
		
		Scanner input = new Scanner(System.in);
		
		for (int x=0;x < list.length; x++) {
			System.out.println("Enter number: ");
			int num=input.nextInt();
			list[x]=num;
		} 
		System.out.println("Index\tValue");
		for(int X=0;X < list.length; X++) {
			System.out.println(X+"\t "+ list[X]);}	
		
		System.out.println("what type of operation they would like to perform on your numbers 'Search' press 1 'Sort' press 2 ");
		int choice = input.nextInt();
		
		if (choice==1) { 
			search find= new search(list);
		}
		else if (choice==2) {
			sort find= new sort(list);
		}
		System.out.println("Big-O Notation for Work algorithm =O(N) Linear ");
	}
	
	
	

}
