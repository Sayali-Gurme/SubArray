import java.util.*;
class sumZero{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		sumZero obj=new sumZero();
		boolean ans=obj.fun(arr);
		System.out.println("ANSWER="+ans);

	}
	boolean fun(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum=sum+arr[k];
					if(sum==0){
						return true;
					}
				}
			}
		}
		return false;
	}
}
