import java.util.*;
class Tree{
    
}
public class BeautifulNode {
    public static long dfs(List<List<Integer>> list,List<Integer> colour,HashSet<Integer> visi,int node){
        long maxlen=0;
        boolean include=false;
        if(!visi.contains(colour.get(node))){
            visi.add(colour.get(node));
            include=true;
        }
        for(int child:list.get(node)){
            maxlen=Math.max(maxlen,dfs(list,colour,visi,child));
        }
        if(include) maxlen++;
        return maxlen;
    }
    public static void main(String[] args) {
      try (Scanner obj = new Scanner(System.in)) {
        Map<Integer,List<Integer>> map=new HashMap<>();
          int n=obj.nextInt();
          List<List<Integer>> list=new ArrayList<>();
          for(int idx=0;idx<=n;idx++){
            List<Integer> temp=new ArrayList<>();
            temp.add(idx,temp);
          }
          int q=obj.nextInt();
          while(q!=0){
            int query=obj.nextInt();

          }
      }
      
    }
}
