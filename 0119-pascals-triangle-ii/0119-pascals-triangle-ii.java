class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> Crow=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            Crow=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    Crow.add(1);
                }else{
                    List<Integer>Prow=result.get(i-1);
                    Crow.add(Prow.get(j-1)+Prow.get(j));
                }
            }
            result.add(Crow);
        }
        return Crow;
    }
}