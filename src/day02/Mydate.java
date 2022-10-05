package day02;

import java.util.Objects;

public class Mydate {
    int year;
    int month;
    int day;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return this.year == mydate.year && this.month == mydate.month && this.day == mydate.day;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(year, month, day);
//    }

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
