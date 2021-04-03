package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		double result;
		
		a = 5; b = 6; c = 2;
		
		double temp;
		temp = 2 * a;
		if (temp != 0) {
		result =( Math.pow(b, 2) + Math.sqrt(Math.pow(b, 2)+ 4*a*c) / temp ) - Math.pow(a, 3)*c +b;
			
	} else {
		System.out.println("Знаменатель равен нулю.");
		result = Double.NaN;
	}
		System.out.println ("Ответ = " + result);

	}

	}
