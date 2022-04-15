class Solution {
    
    private int maxfleft(int[] height,int gi)
    {
        int max=0;
        for(int i=0;i<gi;i++)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
        }
        
        return max;
    }
    
     private int maxfright(int[] height,int gi)
    {
        int max=0;
        for(int i=gi+1;i<=height.length-1;i++)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
        }
        
        return max;
    }
    
    public int trap(int[] height) {
        int sum=0;
        for(int i=0;i<height.length;i++)
        {
            int ml=maxfleft(height,i);
            int mr=maxfright(height,i);
            int jc=Math.min(ml,mr);
            
            if(jc>height[i])
            {
                sum+=jc-height[i]; 
            }
            
            // System.out.println();
        }
        return sum;
    }
}