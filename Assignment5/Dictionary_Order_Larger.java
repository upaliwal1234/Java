import java.util.*;
public class Main {
   public static void main(String[] args) {
    Scanner scan21 = new Scanner(System.in);
    String str = scan21.next();
    ArrayList<String> list=new ArrayList<>();
	Permutation_Dictionary_Order(str,"",str,list);
    Collections.sort(list);
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
	}
	
	public static void Permutation_Dictionary_Order(String rra, String sna_1,String gro_1,ArrayList<String>list) {
		if (rra.length() == 0) {
			if(sna_1.compareTo(gro_1)>0){
                list.add(sna_1);
            }
			return;
		}
		for (int i = 0; i < rra.length(); i++) {
			char ch = rra.charAt(i);
			String ros=rra.substring(0,i)+rra.substring(i+1);
            Permutation_Dictionary_Order(ros,sna_1+ch,gro_1,list);
		}

	}
}
