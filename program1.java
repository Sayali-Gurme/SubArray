import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int S=sc.nextInt();
		for(int j=0;j<arr.length;j++){
			int sum=0;
			for(int k=j;k<arr.length;k++){
				sum=sum+arr[k];
				if(sum==S){
					System.out.println(j+" "+k);
					break;
				}

			}
		}
	}
}
