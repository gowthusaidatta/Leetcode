class Solution {
    public String sortVowels(String s) {

        // freq arrray
        int[] arr = new int[128];

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                arr[ch]++;
            }

        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
 
        for(char ch: s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){

                while(arr[idx] == 0) idx++; //skipping if freq is 0
                sb.append( (char)idx );   //if not adding throw index value
                arr[idx]--;        // reduing value by 1

            }else{
                sb.append(ch);
            }
        }


        return sb.toString();
        
    }
}