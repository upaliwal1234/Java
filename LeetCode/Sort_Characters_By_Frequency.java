// 451. Sort Characters By Frequency
// Given a string s, sort it in decreasing order based on the frequency of the characters.
// The frequency of a character is the number of times it appears in the string.
// Return the sorted string. If there are multiple answers, return any of them.
  
class Solution {
    public String frequencySort(String s) {
        return string_sort(s);
    }
    public static String string_sort(String s){
        String ans = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[256];
        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)]==0){
                list.add((int)s.charAt(i));
            }
            arr[s.charAt(i)]++;
        }
        int[][] ch = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            ch[i][0] = list.get(i);
            ch[i][1] = arr[list.get(i)];
        }
        Sort(ch);
        int x = 0;
        int y = ch.length-1;
        for(int i = 0;i<s.length();i++){
            if(ch[y][1]>0){
                ans = ans +""+ (char)ch[y][0];
                ch[y][1]--;
            }
            else{
                y--;
                ans = ans +""+ (char)ch[y][0];
                ch[y][1]--;
            } 
        }
        
        return ans;
    }
    public static void Sort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][1] < arr[min][1]) {
                    min = j;
                }
            }
            int temp = arr[i][0];
            int t = arr[i][1];
            arr[i][0] = arr[min][0];
            arr[i][1] = arr[min][1];
            arr[min][0] = temp;
            arr[min][1] = t;
        }
    }
}
