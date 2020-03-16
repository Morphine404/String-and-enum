import java.util.Scanner;

public class zad2 {
    public enum Month {
        JANUARY(31, Season.WINTER),
        FEBRUARY(28, Season.WINTER),
        MARCH(31, Season.SPRING),
        APRIL(30, Season.SPRING),
        MAY(31, Season.SPRING),
        JUNE(30, Season.SUMMER),
        JULY(31, Season.SUMMER),
        AUGUST(31, Season.SUMMER),
        SEPTEMBER(30, Season.AUTUMN),
        OCTOBER(31, Season.AUTUMN),
        NOVEMBER(30, Season.AUTUMN),
        DECEMBER(31, Season.WINTER);
        public Season season;
        private Month month;
        public int days;
        Month(int days, Season season) {
            this.season = season;
            this.days = days;
        }
        public int getDays() {
            return days;
        }
        public void setDays(int days) {
            this.days = days;
        }
        public Month getMonth() {
            return month;
        }
        public void setMonth(Month month) {
            this.month = month;
        }
        public Season getSeason() {
            return season;
        }
        public void setSeason(Season season) {
            this.season = season;
        }
    }

    public enum Season {
        WINTER {},
        SPRING,
        SUMMER,
        AUTUMN;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Season: ");
        String scanData = scanner.next();
        for (Season s : Season.values()) {
            if (scanData.equalsIgnoreCase(s.name())) {
                System.out.println("SUCCESS");
                for (Month m : Month.values()) {
                    if (Season.valueOf(s.name()) == m.season)
                        System.out.println(m.name());
                }
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the Month: ");
        String scanData1 = scanner1.next();
        for (Month m : Month.values()) {
            if (scanData1.equalsIgnoreCase(m.name())) {
                System.out.println("SUCCESS");
                System.out.println("In " + m.name() +" is "+ m.days + " days");
                int year = Month.JANUARY.days + Month.FEBRUARY.days + Month.MARCH.days +
                        Month.APRIL.days + Month.MAY.days + Month.JUNE.days +
                        Month.JULY.days + Month.AUGUST.days + Month.SEPTEMBER.days +
                        Month.OCTOBER.days + Month.NOVEMBER.days + Month.DECEMBER.days;
                System.out.println("But, in the year is " + year + " days! :)");
                }
            }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String scanData2 = scanner2.next();
        for (Month m : Month.values()) {
            if (scanData2.equalsIgnoreCase(m.name())) {
                System.out.println("SUCCESS");
                Month month = Month.valueOf(m.name());
                int nom = month.ordinal();
                int prev = nom-1;
                int next = nom+1;
                Month[] months = Month.values();
                Month prewmonth = months[prev];
                Month nextmonth = months[next];
                //System.out.println(month.ordinal());
                System.out.println("Предыдущий месяц: " + prewmonth +" Следующий месяц: " + nextmonth);
            }
        }
    }
}
