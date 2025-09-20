class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        boolean last = true;

        for(char ch : s.toCharArray()){
            if(ch == 'i'){
                last = !last;  // if i encounters it changes way of insert  
            }else{
                if(last){
                    sb.append(ch);   // if last means correct order 
                }else{
                    sb.insert(0 , ch);  //odd no.of i occours;
                }
            }
        }
        if(!last){
           sb.reverse();   //if odd occurs it reverses
        }
        return sb.toString();
        
        
    }
}