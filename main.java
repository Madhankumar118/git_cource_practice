import java.util.*;
class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
         arr[i]=sc.nextInt();   
         sum+=arr[i];
        }
        System.out.print(sum);
        int freq[]=new int[10];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println(i+""+freq[i]);
            }
        }

    }
}