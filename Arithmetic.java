public class Arithmetic{
	public static void main(String[] args){
		int x = 10, y = 2;
		int z;
		// basic arithmetic 
		//z= x+y;
		// z = x -y;
		// z = x*y;
		// z = x/y; the result will truncate to non fraction value
		z = x % y;
		System.out.println(z);
		// Augmented Assignment Operators
		// x +=y;
		// x -=y;
		// x *=y;
		// x %=y;
		x /= y;
		System.out.println(x);

		//increment and decrement
		x ++; // adds one
		x --; // subtracts one
		System.out.println(x);

		//order of operation (PEMDAS)
		double result = 3 + 4 *(7-5)/2.0;
		// left to right, start with () then , from left to right expo, then left to right Mul and div, then left to right add and sub
		System.out.println(result);
	
	}
}