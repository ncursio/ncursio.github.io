package lab4;

import java.util.Scanner;

public class search {

	public search(int [] x) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("what type of search do you want to do 'linearSearch' press (1) or 'binarySearch (2)'  ");
		int pick=input.nextInt();
		System.out.println("what number are you looking for? ");
		int find=input.nextInt();
		int index=0;
		if(pick==1) {
			while (index<x.length) {
				if(x[index] == find) {
					System.out.println(find+" is at index "+ index);
					break;
				}else if (x[index]!=find) {
					index++;
				};
			}
		}
		else if(pick==2) {
			int switcharoo=0;
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
			
			int lowp=0;
			int maxp=x.length-1;
			
			while(lowp<=maxp) {
				int midp=(lowp+maxp)/2;
				if(x[midp]<find) {
					lowp=midp+1;
				}
				else if(x[midp]>find) {
					maxp=midp-1;
				}
				else {System.out.println(find+ " is at "+midp); }
				break;
			}		
		}	
		}
	}

