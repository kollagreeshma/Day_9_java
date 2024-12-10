import java.util.*;
class repeated{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c[]=new int[26];
        int n=a.length();
        for(int i=0;i<n;i++){
            c[((int)(a.charAt(i)))-65]++;
        }
                int max=0;
                int index=0;
                for(int i=0;i<n;i++){
                    if(c[i]>max){
                        max=c[i];
                        index=i;
                    }
                }
        System.out.println("The Most Frequent character is:"+((char)(index+65)));
    }
}
