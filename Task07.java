package lt.lhu.unit02.main;
public class Task07 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("������� ����� a:");
	      double a = sc.nextInt();
        System.out.println("������� ����� b:");
	      double b = sc.nextInt();
	      System.out.println("������� ����� c:");
	      double c = sc.nextInt();
         if (a>=0) {
            double a1 = a * a;
            System.out.println("������� a ="  +a1);
        }
         else if (a<0) {
        	 double a2 = a*a*a*a;
        	  System.out.println("������� a ="  +a2);
         }
        if (b>=0) {
            double b1 = b * b;
            System.out.println("������� b  ="+b1);
        }
        else if (b<0) {
       	 double b2 = b*b*b*b;
       	  System.out.println("������� b ="  +b2);
        }
        if (c>=0) {
            double c1 = c * c;
            System.out.println("������� c  ="+c1);
        }
        else if (c<0) {
       	 double c2 = c*c*c*c;
       	  System.out.println("������� c ="  +c2
       			  );
       	  sc.close();
        }
        
	}
}


	


