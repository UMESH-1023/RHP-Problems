import java.util.*;
public class maxsum{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int R=obj.nextInt();
        int C=obj.nextInt();
        int[][] arr=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        int[][] dp=new int[R][C];
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<C;i++){
            dp[0][i]=arr[0][i];
            if(dp[0][i]>fmax){
                smax=fmax;
                fmax=dp[0][i];
            }
            else if(dp[0][i]>smax){
                smax=dp[0][i];
            }
        }
        for(int i=1;i<R;i++){
            int newFmax=Integer.MIN_VALUE;
            int newSmax=Integer.MIN_VALUE;
            for(int j=0;j<C;j++){
                if(dp[i-1][j]==fmax){
                    dp[i][j]=arr[i][j]+smax;
                }
                else{
                    dp[i][j]=arr[i][j]+fmax;
                }
                if(dp[i][j]>newFmax){
                    newSmax=newFmax;
                    newFmax=dp[i][j];
                }
                else if(dp[i][j]>newSmax){
                    newSmax=dp[i][j];
                }
            }
            fmax=newFmax;
            smax=newSmax;
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<C;i++){
            if(dp[R-1][i]>ans) ans=dp[R-1][i];
        }
        System.out.println(ans);
    }
}