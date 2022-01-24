package Homework.week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum=0, secNum=1, sum=0; 
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int range=0;range<=8;range++)
		{
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
	}
	
	
}
