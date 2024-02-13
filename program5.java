import java.util.*;
class LargeDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		LargeDemo obj=new LargeDemo();
		int ans=obj.fun(arr);
		System.out.println("OUTPUT:"+ans);

	}
	int fun(int[] arr){
		int length=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum +=arr[k];
					if(sum==0){
						if(length <= (j-i-1)){
							length=j-i-1;
						}
					}
				}
			}
		}
		return length;
	}
}
