package JavatestExample;

public class printNumber1To100AndDivisibleBy5 {
	public static void main(String[] args) {
		System.out.println("Print number 1 to 100");
		System.out.println();
		for(int i=1;i<=100;i++) {
			switch(i)
			{
			case 26: System.out.println();
					break;
			case 51:System.out.println();
					break;
			case 76:System.out.println();
					break;
			case 101:System.out.println();
					break;
			default:
					System.out.print(i);
					break;
			}
		} 
		System.out.println();
		System.out.println();
		System.out.println("Divisibleby 5 --->");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+ " ");
			}
		}
	}
}
