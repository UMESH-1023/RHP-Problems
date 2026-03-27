import java.util.*;
public class segmentTree {
    public static int get_sum(int[] res,int node,int start,int end,int lower_limit,int upper_limit){
        if (upper_limit < start || lower_limit > end) return 0;
        if (lower_limit <= start && end <=upper_limit) return res[node];
        int mid = (start + end) / 2;
        int left = get_sum(res, 2*node, start, mid, lower_limit, upper_limit);
        int right = get_sum(res, 2 * node + 1, mid+1, end, lower_limit, upper_limit);
        return left + right;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int tow=0;
        while((1<<tow)<n) tow++;
        int new_n=1<<tow;
        int[] res=new int[new_n+new_n];
        for(int i=new_n;i<new_n+n;i++){
            res[i]=obj.nextInt();
        }
        for(int i=new_n-1;i>=1;i--){
            res[i]=res[2*i]+res[2*i+1];
        }
        for(int i=0;i<(2*new_n);i++) System.out.print(res[i]+" ");
        int start=obj.nextInt();
        int end=obj.nextInt();
        int result=get_sum(res,1,0,new_n-1,start,end);
        System.out.println();
        System.out.print(result);
    }
}
