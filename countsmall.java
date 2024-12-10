import java.util.*;
class countsmall{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c[]=new int[26];
        int n=a.length();
        for(int i=0;i<n;i++){
            c[((int)(a.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c));
    }
}