package leetcode.ex204;

public class Solution {

	public int countPrimes(int n) {
		boolean [] isPrime = new boolean[n + 1];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (!isPrime[i]) {
				count ++;
				for (int j = 2; i * j < n; j++) {
					isPrime[i * j] = true;
				}
			}
		}
		return count;
	}
}
