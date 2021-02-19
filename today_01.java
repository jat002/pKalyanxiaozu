import java.util.*;	
public class today_01{
    /*已知今天周几，给定日期判断星期几*/
    public static void main(String[] args){
        int year,month,date,days;
        Scanner reader=new Scanner(System.in);
        year=reader.nextInt();
        month=reader.nextInt();
        date=reader.nextInt();
        days=date;//把天数的零头加上去
        for(int i=2019;i<year;i++)//把整年数的天数和算出来
            if(isLeapYear(i))
                days+=366;
            else
                days+=365;
        for(int i=1;i<month;i++)//把剩下月数的天数和算出来
            days+=daysIntMonth(year,i);
        System.out.println("星期"+(days+1)%7);         
    }
    /*判断闰年函数*/
    public static boolean isLeapYear(int year){
        if((year%4==0&&year%100!=0)||year%400==0)
            return true;
        return false;
    }
    /*计算月份天数*/
    public static int daysIntMonth(int year,int month){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month!=2)
            return days[month-1];//数组下标从零开始
        else if(isLeapYear(year))
            return 29;
        else
            return 28;
    }
}