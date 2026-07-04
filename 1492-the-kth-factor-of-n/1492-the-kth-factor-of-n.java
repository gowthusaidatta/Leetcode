class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return k<=list.size()?list.get(k-1):-1;
    }
}