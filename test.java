
public class test {

	public static void main(String[] args) {

		int a = 82;
		int b = 64;
		int x = compareNumbers(a,b);
		System.out.println(x);

		int c = 2;
		int d = 221;
		int y = compareNumbers(c,d);
		System.out.println(y); 

		int e = 18;
		int f = 31;
		int z = compareNumbers(e,f);
		System.out.println(z);

	}

	public static int compareNumbers(int num1, int num2) {

		if(num1 > num2 ) {
			return num2;
		}
		else {
			return num1;
		}


	}


}
