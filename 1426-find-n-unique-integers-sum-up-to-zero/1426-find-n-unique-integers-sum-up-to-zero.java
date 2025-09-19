class Solution {
    public int[] sumZero(int n) {
       int i=0,j=n-1;
       int t=n/2;
       int  array[]=new int[n];
       while(i<j){
        array[i]=t*-1;
        array[j]=t;
        i++;
        j--;
        t--;
       } 
       return array;
    }
}