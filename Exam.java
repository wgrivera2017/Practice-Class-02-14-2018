
public class Exam {

	public static void main(String[] args) {

		int a = 72;
		int b = 6;
		int c = 91;
		double z = averageNumbers(a,b,c);
		System.out.println(z);

		int d = 200;
		int e = 1;
		int f = 117;
		double y = averageNumbers(d,e,f);
		System.out.println(y);

	}

	public static double averageNumbers(int num1, int num2, int num3) {

		double sum = (num1 + num2 + num3) / 3;
		return sum;
	}






}


