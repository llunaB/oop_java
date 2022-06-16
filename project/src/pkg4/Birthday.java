package pkg4;

public class Birthday {
    private int day;
    private int month;
    private int year;

    private boolean isValid; //default=false, set은 없다.

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {

        this.day = day;
    }

    //set 메서드에서 데이터 제어
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        }
        else {
            isValid = true;
            this.month = month;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year +"년"+ month +"월"+ day +"일");
        }
        else {
            System.out.println("invalid");
        }
    }
}
