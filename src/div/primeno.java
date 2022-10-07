package div;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=11;
		int count =0;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		
		if(count>=1)
		{
			System.out.println("It is not prime no");
		}else
		{
			System.out.println("Prime no");
		}

	}

}
