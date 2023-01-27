// Take as input str, a string. 
// Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string.
// The output strings must be lexicographically sorted.


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        String str = scan21.next();
        ArrayList<String> list = new ArrayList<>();
        Permutations_Dictionary_Order(str, "", str, list);
        Collections.sort(list);
        for(int l=0; l < list.size(); l++){
            System.out.println(list.get(l));
        }
	}
	
	public static void Permutations_Dictionary_Order(String rra, String sna, String xyz, ArrayList<String>list) {
		if (rra.length() == 0) {
			if(sna.compareTo(xyz) < 0){
                list.add(sna);
            }
			return;
		}
		for (int i = 0; i < rra.length(); i++) {
			char ch = rra.charAt(i);
			String ros = rra.substring( 0, i)+rra.substring(i + 1);
            Permutations_Dictionary_Order(ros, sna + ch, xyz, list);
		}

	}
}
