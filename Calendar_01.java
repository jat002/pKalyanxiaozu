import java.util.*;
import java.text.*;	
public class Calendar_01{
    public static void main(String[] args){
        int year,month,weekDay,days,i;
        Calendar calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH)+1;
        calendar.set(year,month-1,1);	//初始时间设为本月1号
        weekDay=(calendar.get(Calendar.DAY_OF_WEEK)+6)%7;	//获得今天是星期几
        days=getDays(year,month);	//本月总天数
        char [] str="日一二三四五六".toCharArray();	//字符串变为字符串数组
        for(char c:str){	//":"用于遍历数组
        	System.out.print("\t"+c);	//输出日历抬头																			
        }
        System.out.println();	//换行
        for(i=0;i<weekDay;i++)
        	System.out.print("\t"+"");	//输出前面几个空位置
        for(i=0;i<days;i++){
        	if((i+weekDay)%7==0)	//本行满了七天就换行
        		System.out.println();
        	System.out.print("\t"+(i+1));	//从1开始输出本月所有天
        }
        System.out.println();  
    }
    static int getDays(int year,int month){
    	int day=0;
    	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
    		day=31;
    	if(month==4||month==6||month==9||month==11)
    		day=30;
    	if(month==2){
    		if(((year%4==0)&&(year%100!=0))||(year%400==0))
    			day=29;
    		else
    			day=28;
    	}
    	return day;
    }
}