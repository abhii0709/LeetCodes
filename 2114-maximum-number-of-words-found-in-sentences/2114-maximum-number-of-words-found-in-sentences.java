class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int w=1;
            for(char ch:s.toCharArray()){
                if(ch==' '){
                    ++w;
                }
                max=Math.max(max,w);
            }
        }
        return max;
    }
}