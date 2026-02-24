import java.util.*;
public class AllAlphabets {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            flag=flag|(1<<(ch-'a'));
        }
        if(flag==((1<<26)-1)){
            System.out.print("Yes");
        }
        else{
            System.out.print("NO");
        }
        obj.close();
    }

}
