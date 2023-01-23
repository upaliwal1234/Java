// 997. Find the Town Judge
// In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
// If the town judge exists, then:
// The town judge trusts nobody.
// Everybody (except for the town judge) trusts the town judge.
// There is exactly one person that satisfies properties 1 and 2.
// You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
// Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length == 0){
            return 1;
        }
        int[] arr = new int[n+1];
        boolean[] rra = new boolean[n+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<trust.length; i++){
            rra[trust[i][0]] = true;
            arr[trust[i][0]] = 0;
            arr[trust[i][1]]++;
            list.add(trust[i][1]);
        }
        System.out.print(list);
        for(int i = 0; i<list.size(); i++){
            if(rra[list.get(i)] == false && arr[list.get(i)] == n-1 ){
                return list.get(i);
            }
        }
        return -1;
    }
}
