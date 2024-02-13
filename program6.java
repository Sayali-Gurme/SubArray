import java.util.*;
class SmallDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value of X");
		int x=sc.nextInt();
		SmallDemo obj=new SmallDemo();
		int ans=obj.fun(arr,x);
		System.out.println("OUTPUT:"+ans);

	}
	int fun(int[] arr,int X){
		int length=arr.length +1;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum +=arr[k];
					if(sum>X){
						if(length > (j-i+1)){
							length=j-i;
						}
					}
				}
			}
		}
		return length;
	}
}
