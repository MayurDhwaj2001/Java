public class leapYear {
    public static boolean isLeapYear(int y) {
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 1990;
        System.out.println(isLeapYear(year));
    }
}
