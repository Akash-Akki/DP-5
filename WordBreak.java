	//Time Complexity : O(n^2)
//Space Complexity :O(n)

class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
         HashSet<String> set = new HashSet<>();
         
        if(s.length() == 0 )
            return true;
        if(wordDict == null || wordDict.size() == 0)
            return false;
        
        for(String word : wordDict){
             set.add(word);
         }
        
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1 ; i < dp.length;i++){
            
            for(int j = 0 ;  j < i ; j++){
                
                //this checks upto jth whether the string and from j to ith index if its 
                //true make dp[i] as true.
                //It means that it can be partitioned
                if(dp[j] == true && set.contains(s.substring(j,i)) == true){
                    dp[i] = true;
                    break;

                }        
            }
        }
        
        
        return dp[dp.length-1];
    }
    
    
}