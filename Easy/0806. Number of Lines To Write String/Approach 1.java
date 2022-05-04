class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        s+=" ";
        int result[]=new int[2];
        int sum=0,line=0;
        int i=0;
        
        for(i=0;s.charAt(i)!=' ';i++){
            int index=widths[s.charAt(i)-'a'];
           
            if(sum+index>100){
                sum=0;
                line+=1;
                sum+=index;
            }
            
            else{
                sum+=index;
            }
    }
        
        line+=1;
        
         if(s.charAt(i)==' '){
                result[0]=line;
                result[1]=sum;
            }
        
        return result;
}
}
