package Leetcode;

class Solution {
    public int nonSpecialCount(int l, int r) {
        int count = 0;
        int max = (int) Math.sqrt(r);
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int a = 2; a * a <= max; a++) {
            if (isPrime[a]) {
                for (int b = a * a; b <= max; b += a) {
                    isPrime[b] = false;
                }
            }
        }

        for (int a = l; a <= r; a++) {
            if (!isSpecial(a, isPrime)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSpecial(int num, boolean[] isPrime) {
        int sq = (int) Math.sqrt(num);
        if (sq * sq != num) {
            return false;
        }
        return isPrime[sq];
    }
}
