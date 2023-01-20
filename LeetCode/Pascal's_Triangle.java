// 118. Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int row = 0;
        int col = 1;
        while(row < numRows){
            int i = 0;
            int num = 1;
            list.add(new ArrayList<Integer>());
            while(i<col){
                list.get(row).add(num);
                num = ((row-i)*num)/(i+1);
                i++;
            }
            col++;
            row++;
        }
        return list;
    }
}
