public class Main {
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int longestLength = 1;
        String longestStr = s.substring(0, 1);
        int start = 0;
        for(int i = 1; i < s.length(); i++){
            if(!longestStr.contains(s.substring(i, i+1))){
                longestStr+= s.substring(i, i+1);
                longestLength++;
            }else{
                start++;
                int lengthOfNext = lengthOfLongestSubstring(s.substring(start));
                if(lengthOfNext > longestLength){
                    return lengthOfNext;
                }else{
                    return longestLength;
                }
            }
        }
        return longestLength;
    }
    public static void main(String[] args) {
        String s = "ckilbkd";
        System.out.println(lengthOfLongestSubstring(s));
    }
}