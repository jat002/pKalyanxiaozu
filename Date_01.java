import java.util.*;
import java.text.*;	
public class Date_01{
    public static void main(String[] args){
        Date nowTime=new Date();
        System.out.println(nowTime);
        String pattern="yyyy-MM-dd";
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);//定义一种格式
        String timePattern=sdf.format(nowTime);
        System.out.println(timePattern);  
    }
}