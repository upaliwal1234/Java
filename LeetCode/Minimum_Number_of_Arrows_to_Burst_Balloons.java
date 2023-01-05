// 452. Minimum Number of Arrows to Burst Balloons
// There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where
// points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. 
// You do not know the exact y-coordinates of the balloons.
// Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. 
// A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. 
// There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
// Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        // sort the elements based on the second element
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        // lets have a varible for storing the result
        int arrowCount = 0;
        long possibleEnd = Long.MIN_VALUE;
        for (int [] p: points) {
            if (p[0] > possibleEnd) {
                possibleEnd = p[1];
                arrowCount += 1;
            }
        }
        return arrowCount;
    }
}
