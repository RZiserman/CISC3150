public class Question4 {
	public static void main(String[] args){
		System.out.println("\n\nExample 1");
		int x = 4282;
		for(int i=0;i<35;i++){
			System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x>>>i));
			System.out.println("The value of x is " + x );
		}
		
		System.out.println("\n\nExample 2");
		for(int i=0;i<35;i++){
			System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x));
			x = x >>> i;
			System.out.println("The value of x is " + x );
		}
	}
}

/*
We are not changing the value of x in the first example. Since integers are 32-bits wide, and shift distance is always in the range 0-31 **, the bit position "index"
wraps around to the beginning of x. Thus, the bit position is 0 on the 32nd iteration.

In the second example, we are changing the value of x by shifting bits on each iteration. On iteration six, x becomes 0. Every subsequent iteration pads x with 0. Hence, x's value is 0 until the
end of the loop.
**Source:https: //docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.19
*/
