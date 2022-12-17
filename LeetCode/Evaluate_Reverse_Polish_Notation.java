// 150. Evaluate Reverse Polish Notation
// Evaluate the value of an arithmetic expression in Reverse Polish Notation.
// Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
// Note that division between two integers should truncate toward zero.
// It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result,
// and there will not be any division by zero operation.

class Solution {
    public int evalRPN(String[] tokens) {
        return RPN(tokens);
    }
    public static int RPN(String[] arr){
        int[] sta = new int[arr.length];
        int p = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i].equals("+")){
                sta[p-1] = sta[p-1]+sta[p];
                sta[p] = 0;
                p--;
            }
            else if(arr[i].equals("-")){
                sta[p-1] = sta[p-1]-sta[p];
                sta[p] = 0;
                p--;
            }
            else if(arr[i].equals("*")){
                sta[p-1] = sta[p-1]*sta[p];
                sta[p] = 0;
                p--;
            }
            else if(arr[i].equals("/")){
                sta[p-1] = sta[p-1]/sta[p];
                p--;
            }
            else{
                p++;
                sta[p] = Integer.parseInt(arr[i]);
            }
        }
        return sta[0];
    }
}
