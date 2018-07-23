import java.util.Arrays;
import java.util.Scanner;
public class Repeated {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count = 0, n,n1;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();			
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
		 count=0;
			
			for(int j=i;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==2){
				System.out.print(arr[i]);
			}
		}
		if(count<=1){
			System.out.println("unique");
		}
		
	}

}
