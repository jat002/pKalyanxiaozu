import java.util.*;
import java.text.*;	
public class calender_01{
    public static void main(String[] args){
        int year,month,weekDay,days,i;
        Calendar calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH)+1;
        calendar.set(year,month-1,1);
        weekDay=(calendar.get(Calendar.DAY_OF_WEEK)+6)%7;
        days=getDays(year,month);
        char [] str="日一二三四五六".toCharArray();
        for(char c:str){
        	System.out.print("\t"+c);																			
        }
        System.out.println();
        for(i=0;i<weekDay;i++)
        	System.out.print("\t"+"");
        for(i=0;i<days;i++){
        	if((i+weekDay)%7==0)
        		System.out.println();
        	System.out.print("\t"+(i+1));
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