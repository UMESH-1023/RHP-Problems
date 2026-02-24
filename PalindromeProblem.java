import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            flag=flag^(1<<(ch-'a'));
        }
        if(flag==0 || (flag&(flag-1))==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("NO");
        }
        obj.close();
    }
}
