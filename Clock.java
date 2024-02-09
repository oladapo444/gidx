public class Clock {
    private int Hour;
    private int Minute;
    private int second;
    private int displayTime;


    public Clock(int Hour, int Minute, int second ){
        this.Hour =(Hour <= 23) ? Hour : 0;
        this.Minute = (Minute <= 59) ? Minute : 0;
        this.second = (second <= 59) ? second : 0;
}
public int getHour() {
    return Hour;
}
public void setHour(int hour){
        this.Hour = (Hour <= 23) ? Hour : 0;
    }
    public  int getMinute(){

        return Minute;
    }
    public void setMinute(int minute){
        this.Minute = (Minute <= 59)? Minute : 0;
    }
    public int getSecond(){

        return second;
    }
    public void setSecond(int second) {
        this.second = (second <= 59) ? second : 0;
    }

    public void DisplayTime() {
        System.out.printf("%02d:%02d:%02d%n", Hour, Minute,second);



    }
}




