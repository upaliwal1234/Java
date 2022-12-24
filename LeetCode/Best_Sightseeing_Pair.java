// 1014. Best Sightseeing Pair
// You are given an integer array values where values[i] represents the value of the ith sightseeing spot.
//   Two sightseeing spots i and j have a distance j - i between them.
// The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots,
// minus the distance between them.
// Return the maximum score of a pair of sightseeing spots.
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        return max_Score(values);
    }
    public static int max_Score(int[] A){
        int max = A[0];
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i - 1] + i - 1);
            res = Math.max(res, max + A[i] - i);
        }
        return res;
    }
}
