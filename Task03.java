package lt.lhu.unit02.main;

public class Task03 {
	

	public static void main(String[] args) {
		int a,b,c;
		double result;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Введите a: " );
		a = sc.nextInt();
		System.out.print("Введите b: " );
		b = sc.nextInt();
		System.out.print("Введите c: " );
		c = sc.nextInt();
		sc.close();
		 result = Math.pow(a, 2)- Math.pow(b-c, 2) + Math.log(Math.pow(b, 2)+ 1);

		 System.out.println("Ответ=" + result);

		
	}
}


