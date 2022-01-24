package Homework.week1;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		
		//sum of all elements in this array
		
		int sum=0;
		 
		for(int i=0;i<arr.length;i++)
		{
			sum=sum +arr[i];
			
		}
		
		//System.out.println(sum);
		int sum1=0;
	for(int i=1;i<=8;i++)
	{
		sum1= sum1+i;
		
	}

	//System.out.println(sum1);

	System.out.println("Missing Number is" + (sum1-sum));
	
	}
}

