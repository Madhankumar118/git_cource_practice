import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int arr[]={1,2,3,4,5,6,7};
        int freq[]=new int[10];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println(i+"-"+freq[i]);
            }
        }
    }
}