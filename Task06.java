package lt.lhu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
			double a = 0;
			double b = 0;
			double c = 0;
			double d = 0;
			double result;
			a = 4;
			b = 3;
			c = 5;
			d = 2;
			double temp;
			temp = c * d ;
			if (temp != 0) {
			result = (a*b / temp) - ((a*b - c)/temp) ;
			} else {
			System.out.println("Знаменатель равен нулю.");
			result = Double.NaN;
			}
			System.out.println("Ответ=" + result);
			}

	}


