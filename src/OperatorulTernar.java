import sun.util.resources.LocaleData;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OperatorulTernar {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "PM" : "AM";

        System.out.println(ora + " : " + minute +perioada);
        for(int i=5;i>0;i--){
            System.out.println(i);
        }

    }
}
