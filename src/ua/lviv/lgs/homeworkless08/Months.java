package ua.lviv.lgs.homeworkless08;

public enum Months {
    JANUARY(Sesons.WINTER, 31),
    FEBRUARY(Sesons.WINTER, 28),
    MARCH(Sesons.SPRING, 31),
    APRIL(Sesons.SPRING, 30),
    MAY(Sesons.SPRING, 31),
    JUNE(Sesons.SUMMER, 30),
    JULY(Sesons.SUMMER, 31),
    AUGUST(Sesons.SUMMER, 31),
    SEPTEMBER(Sesons.AUTUMN, 30),
    OCTOBER(Sesons.AUTUMN, 31),
    NOVEMBER(Sesons.AUTUMN, 30),
    DECEMBER(Sesons.WINTER, 31);

       Sesons seson;
    int day;

    Months(Sesons seson, int day) {
        this.seson = seson;
        this.day = day;
    }

    public Sesons getSes() {
        return seson;
    }

    public int getDay() {
        return day;
    }
}
