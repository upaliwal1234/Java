// 1079. Letter Tile Possibilities
// You have n  tiles, where each tile has one letter tiles[i] printed on it.
// Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.
class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> list = new HashSet<>();
        boolean[] arr = new boolean[tiles.length()];
        possibilities(tiles, arr, "", list);
        return list.size();
    }

    public static void possibilities(String tiles, boolean[] arr, String ans, Set<String> list) {
        if(ans.length() > 0){
            if(list.contains(ans)){
                return;
            }
            list.add(ans);
        }
        for (int i = 0; i < tiles.length(); i++) {
            if (arr[i]) 
                continue;
            arr[i] = true;
            possibilities(tiles, arr, ans + tiles.charAt(i), list);
            arr[i] = false;
        }
    }
}
