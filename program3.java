import java.util.*;
class LengthDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LengthDemo obj=new LengthDemo();
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int output=obj.fun(arr);
		System.out.println("ontput"+output);
	}
	int fun(int [] arr){
		int maxlen=0;
		for(int i=0;i<arr.length;i++){
			int count1=0;
			int count2=0;
			for(int j=i;j<arr.length;j++){
				if(arr[j]==0){
					count1++;
				}else{
					count2++;
				}

				if(count1==count2){
					maxlen= Math.max(maxlen,j-i+1);
				}
			}
		}
		return maxlen;
	}
}
