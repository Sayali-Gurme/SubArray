import java.util.*;
class ProductDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		ProductDemo obj=new ProductDemo();
		int ans=obj.fun(arr);
		System.out.println("OUTPUT:"+ans);

	}
	int fun(int[] arr){
		int maxpro=1;
		for(int i=0;i<arr.length;i++){
			int pro=1;
			for(int j=i;j<arr.length;j++){
				pro=pro*arr[j];
				if(pro >maxpro){
					maxpro=pro;
				}
			}
		}
		return maxpro;
	}
}
