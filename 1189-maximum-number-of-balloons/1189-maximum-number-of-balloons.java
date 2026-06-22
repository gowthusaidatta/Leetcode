class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balon";
        Map<Character,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(char ch:text.toCharArray()){
            if(s.indexOf(ch) != -1){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(char ch :s.toCharArray()){
            if(!map.containsKey(ch)) return 0;
            if(ch == 'l' || ch =='o'){
                min = Math.min(map.get(ch)/2 , min);
            }else{
                min = Math.min(map.get(ch) ,min);
            }
        }
        return min;

    }
}