package day02;

import java.util.Objects;

public class Strings {
    String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Strings strings = (Strings) o;
        return Objects.equals(s, strings.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }

}
