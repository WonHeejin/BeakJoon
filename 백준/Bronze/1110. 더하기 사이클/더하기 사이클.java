import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] number=new int[5];
		int i=0;
		number[0]=input;
		while(true) {
			number[1]=number[0]/10;
			number[2]=number[0]%10;
			number[3]=number[1]+number[2];
			number[4]=number[2]*10+number[3]%10;
			if(number[4]==input) {
				break;
			}else {
				number[0]=number[4];
				i++;
			}			
		}
	
			System.out.println(i+1);
				
	}

}
