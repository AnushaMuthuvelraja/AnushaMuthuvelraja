package Homework.week1;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {

		
		String test= "I am a software Tester";
		
		String [] split= test.split(" ");
		System.out.println(Arrays.toString(split));
		for (int i=0;i<split.length;i++)
		{
			if(i%2!=0)
			{
				char [] charArray=split[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j-- )
				{
					System.out.print("\t" + charArray[j]);
				}
			}
		}
	}

}
