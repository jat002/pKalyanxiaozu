import java.util.*;	
public class String_01{
    public static void main(String[] args){
        String s1;
        String[] str;
        int i;
        Scanner reader=new Scanner(System.in);
        s1=reader.nextLine();
        str=s1.split(" ");
        System.out.println("-------排序前--------");
        for(i=0;i<str.length;i++)
            System.out.println(str[i]);
        for(i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-1-i;j++)
                if(str[j].compareTo(str[j+1])>0){
                    String s=str[j];str[j]=str[j+1];str[j+1]=s;
                    }
        }
        System.out.println("--------排序后--------");
        for(i=0;i<str.length;i++)
            System.out.println(str[i]);	
    }
}