class Solution {
    public ArrayList<Integer> printPat(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=1; j--){
                for(int k = i; k<=n; k++){
                    result.add(j);
                }
            }
            result.add(-1);
        }
        return result;
    }
}

Example : 
Input: 2
Output: [2, 2, 1, 1, -1, 2, 1, -1]

Input: 3
Output: [3, 3, 3, 2, 2, 2, 1, 1, 1, -1, 3, 3, 2, 2, 1, 1, -1, 3, 2, 1, -1]
