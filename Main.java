import java.util.*;

public class Main{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int k=sc.nextInt();
        for(int wid=1;wid<=k;wid++){
            Worker w=new Worker(wid,N);
            w.start();
        }
        sc.close();
    }
}