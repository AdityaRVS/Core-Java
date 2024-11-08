package arrays2;

public class numberrepeat {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,10,10,20,10};
		
		int b=20;
		int count=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
