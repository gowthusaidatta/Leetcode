class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map  = new HashMap<>();
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
             String sorted = String.valueOf(ch); 

            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(sorted,list);

            }
        }
        return new ArrayList<>(map.values());
    }
}