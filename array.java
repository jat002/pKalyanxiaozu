import java.util.*;	
public class array{
    public static void main(String[] args){
    	int[] a;
 		int i,j,temp,min;
 		a=new int[10];
 		Scanner reader=new Scanner(System.in);
 		for(i=0;i<a.length;i++)
 			a[i]=reader.nextInt();  
 		for(i=0;i<a.length-1;i++){
 			min=i;
 			for(j=i+1;j<a.length;j++)
 				if(a[min]>a[j])
 					min=j;
 			temp=a[i];a[i]=a[min];a[min]=temp;
 		}
 		for(i=0;i<a.length;i++)
 			System.out.println(a[i]+"\t");
    }
}