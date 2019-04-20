package Task3_1;

public class Main {

    public static void main(String[] args) {

        int s = 867777;

        int m, h, d, w;

        int sec, min, hrs, days, weeks;

        sec = s % 60;

        m = (s -sec) / 60;

        min = m % 60;

        h = (m - min) / 60;

        hrs = h % 24;

        d = (h - hrs)/24;

        days = hrs % 7;

        weeks = (d - days)/7;

        System.out.println(weeks + " недель/ " + days + " дней/ " + hrs+" часов/ " + min + " минут/ " + sec + " секунд/ ");

    }

}
