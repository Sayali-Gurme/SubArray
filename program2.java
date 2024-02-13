import java.util.*;
class EqualDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++){
			int sum1=0;
			int sum2=0;
			for(int k=0;k<j;k++){
				sum1=sum1+arr[k];
			}
			for(int m=arr.length-1;j<m;m--){
				sum2=sum2+arr[m];
			}
			if(sum1==sum2){
				System.out.println((j+1)+" ");
				break;
			}
		}
	}
}
