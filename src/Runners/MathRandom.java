package Runners;

public class MathRandom {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10 + 1);
		int b = (int) (Math.random() * 10 + 1);

		System.out.println(a + " "+ b);
		System.out.println(a + b);
		System.out.println((a + b) / 2);

		

	}

}
