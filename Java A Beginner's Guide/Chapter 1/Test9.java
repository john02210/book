/*
   The moon's gravity is about 17 percent that of earth's.
   Write a program that computer your effective weight on the moon.
*/
class Test9 {
	public static void main(String args[]) {
		double earthWeight, moonWeight;

		earthWeight = 73;
		moonWeight = earthWeight * 0.17;

		System.out.println("My effective weight on the earth is " + earthWeight);
		System.out.println("My effective weight on the moon is " + moonWeight);
	}
}
