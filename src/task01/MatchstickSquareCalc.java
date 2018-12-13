package task01;

public class MatchstickSquareCalc {
	/**
	 * @author interzone
	 * */
	public static long matchstickSquare(long quantity) {

		if (quantity <= 0) {
			return 0;
		}

		long width = (long) Math.sqrt(1 * quantity);

		long length = quantity / width;
		long rest = quantity - width * length;

		long res = width * (length + 1) + length * (width + 1);

		if (rest == 1) {
			res = res + 2 * rest + 1;
		}
		System.out.println(res);
		return res;
	}
}
