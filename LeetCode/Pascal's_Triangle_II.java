// 119. Pascal's Triangle II
// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        long val = 1;
        while(i<=rowIndex){
            list.add((int)val);
            val = ((rowIndex-i)*val)/(i+1);
            i++;
        }
        return list;
    }
}
