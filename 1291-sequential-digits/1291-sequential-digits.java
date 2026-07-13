class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        int lc=String.valueOf(Math.abs(low)).length();
        int hc=String.valueOf(Math.abs(high)).length();
        String s="123456789";
        for(int i=lc;i<=hc;i++){
            for(int j=0;j<=s.length()-i;j++){
                int num=Integer.valueOf(s.substring(j,j+i));
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}