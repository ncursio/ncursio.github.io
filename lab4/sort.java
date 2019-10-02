package lab4;
import java.util.Scanner;
public class sort {
	
	public sort(int [] x) {
		Scanner input = new Scanner(System.in);
		System.out.println("what type of search do you want to do 'bubbleSort' (1) 'selectionSort' (2) or 'insertionSort' (3)  ");
		int pick=input.nextInt();
		int switcharoo=0;
		if(pick==1) {
			
			for(int i =x.length-1;i>0;i--) {
				for(int j=0;j<i;j++) {
					if (x[j] >x[j+1]) {
						switcharoo=x[j];
						x[j]=x[j+1];
						x[j+1]=switcharoo;
					}
				}	
			}
			System.out.println("New Sequence");
			System.out.println("Index\tValue");
			for(int X=0;X < x.length; X++) {
				System.out.println(X+"\t "+ x[X]);}
			System.out.println();
		}
		else if(pick==2) {
			for(int i=0;i<x.length-1;i++) {
				int mid=i;
				for(int j=i+1;j<x.length;j++) {
					if(x[j]<x[mid]) {
						mid=j;
					}
				}
			switcharoo=x[mid];
			x[mid]=x[i];
			x[i]=switcharoo;
			}
		System.out.println("New Sequence");
		System.out.println("Index\tValue");
		for(int X=0;X < x.length; X++) {
			System.out.println(X+"\t "+ x[X]);}
			System.out.println();
		}
	else if(pick==3) {
		for(int i =1; i<x.length;i++) {
			int hold=x[i];
			int j=i-1;
			
			while(j>=0 && x[j]>hold) {
				x[j+1]=x[j];
				j--;
			}
			x[j+1]=hold;
		}
		System.out.println("New Sequence");
		System.out.println("Index\tValue");
		for(int X=0;X < x.length; X++) {
			System.out.println(X+"\t "+ x[X]);}
			System.out.println();
	}
	}
}
