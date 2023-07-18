package Columnsum;
import java.util.Scanner;

public class Countsum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ar[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		  for(int i = 0; i < b; i++){    
	          int   sumCol = 0;    
	            for(int j = 0; j < a; j++){    
	              sumCol = sumCol + ar[j][i];    
	            }    
	            System.out.println( sumCol);    
	        }    
	}
}
		