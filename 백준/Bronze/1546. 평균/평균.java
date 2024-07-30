import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		double[] score=new double[n]; 
		double[] newscore=new double[n];
		double result=0;
		for(int i=0;i<n;i++ ) {
			score[i]=sc.nextInt();
		}
		Arrays.sort(score);
		for(int i=0;i<n;i++) {					
				newscore[i]=((score[i]/score[n-1])*100);}		
		for(int i=0;i<n;i++) {
			result+=newscore[i];
		}
		System.out.print(result/n);
	} 
}