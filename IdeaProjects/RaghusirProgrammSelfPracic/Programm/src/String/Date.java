package String;
public class Date {
    int dd,mm,yy;
    int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    String dname[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public Date(int dd,int mm,int yy)
    {
        this.dd=dd;
        this.mm=mm;
        this.yy=yy;
        if (yy%4==0&&yy%100!=0||yy%400==0)
            month[2]=29;
    }
    int noofDays()
    {
        int y=yy-1;
        int days=y*365+y/400+y/4-y/100;
        for (int i=1;i<mm;i++)
        {
            days=days+dd;
        }
        days=days+dd;
        return days;
    }
    String getDayName()
    {
        int d=noofDays()%7;
        return dname[d];
    }
}
