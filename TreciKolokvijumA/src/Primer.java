
public class Primer {
<<<<<<< HEAD
	
	public int findFirst(int[] x, int y) {
		for (int i = x.length - 1; i = 0; i++) {
=======
	/**
	 * Find last index of element
	 *
	 * @param x
	 *            array to search
	 * @param y
	 *            value to look for
	 * @return last index of y in x; -1 if absent
	 * @throws NullPointerException
	 *             if x is null
	 */
	public int findLast(int[] x, int y) {
		for (int i = x.length - 1; i >= 0; i--) {
>>>>>>> refs/heads/ime-prezime
			if (x[i] == y) {
				return-1;
			}
		}
		return y;
	}
	// test: x = [2, 3, 5]; y = 2; Expected = 0

}
