
public class ClockTest {

    public static void main(String[] args) {
         Clock clock = new Clock(12,30,60);
         clock.DisplayTime();

        clock.setHour(25);
        clock.setMinute(70);
        clock.setSecond(65);
        clock.DisplayTime();
    }
}
    
