import java.util.*;	
public class array_2d{
    public static void main(String[] args){
    	int[][] a;
    	int i,j,max,min,maxI,minI,t;
    	a=new int[3][4];
    	Scanner reader=new Scanner(System.in);
    	for(i=0;i<3;i++)
    		for(j=0;j<4;j++)
    			a[i][j]=reader.nextInt();
    	max=min=a[0][0];
    	maxI=minI=0;
    	for(i=0;i<3;i++)
    		for(j=0;j<4;j++){
    			if(a[i][j]>max){
    				max=a[i][j];minI=i;
    			}
    			if(a[i][j]<min){
    				min=a[i][j];maxI=i;
    			}
    		}
    	for(j=0;j<4;j++){		
    	t=a[minI][j];a[minI][j]=a[maxI][j];a[maxI][j]=t;
    	}
    	for(i=0;i<3;i++){
    		for(j=0;j<4;j++)
    			System.out.print(a[i][j]+"\t");
    		System.out.println();
    	}
    }
}