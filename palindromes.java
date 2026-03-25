import java.util.*;
public class palindromes {
    public static void main(String[] args) {
      try (Scanner obj = new Scanner(System.in)) {
        String str=obj.nextLine();
          int[] left=new int[26];
          int[] right=new int[26];
          for(int i=0;i<str.length();i++){
            right[str.charAt(i)-97]+=1;
          }   
          int count=0;
          for(int i=0;i<str.length();i++){
            right[str.charAt(i)-97]-=1;
            for(int idx=0;idx<26;idx++){
                count+=(left[idx]*right[idx]);
            }
            left[str.charAt(i)-97]-=1;
          }
          System.out.print(-count);
      }
    }
}
