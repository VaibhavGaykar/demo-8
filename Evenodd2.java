package Pack;

public class Evenodd2 {

	void evencheck()
	{
		
		int a=10;
		if(a%2==0)  //% - reminder
			{
			 System.out.println("Even number");
			 System.out.println("bye");
			}
		else
		{
			System.out.println("odd number");
		
		}
	}
	
	
	public static void main(String[] args) {
	
		Evenodd2 e= new Evenodd2();
		e.evencheck();
		
	}

}
