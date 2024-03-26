package ch04;

public class S04_switchcase {
    public static void main(String[] args) {

        int month = 8;

        String monthString = "";
        switch (month) {
            // 입력 변수의 자료형은 byte ,short, char, int, enum, String만 가능함
            case 1: monthString = "Jan";
                break;
            case 2: monthString = "Feb";
                break;
            case 3: monthString = "Mar";
                break;
            case 4: monthString = "Apr";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "Aug";
                break;
            case 9: monthString = "Sep";
                break;
            case 10: monthString = "Oct";
                break;
            case 11: monthString = "Nov";
                break;
            case 12: monthString = "Dec";
                break;
            default: monthString = "Invalid month";
                break;
        }

        System.out.println(monthString);
    }
}
