package ua.lviv.lgs.homeworkless08;

public enum Months {

    СІЧЕНЬ(Sesons.ЗИМА, 31),
    ЛЮТИЙ(Sesons.ЗИМА, 28),
    БЕРЕЗЕНЬ(Sesons.ВЕСНА, 31),
    КВІТЕНЬ(Sesons.ВЕСНА, 30),
    ТРАВЕНЬ(Sesons.ВЕСНА, 31),
    ЧЕРВЕНЬ(Sesons.ЛІТО, 30),
    ЛИПЕНЬ(Sesons.ЛІТО, 31),
    СЕРПЕНЬ(Sesons.ЛІТО, 31),
    ВЕРЕСЕНЬ(Sesons.ОСІНЬ, 30),
    ЖОВТЕНЬ(Sesons.ОСІНЬ, 31),
    ЛИСТОПАД(Sesons.ОСІНЬ, 30),
    ГРУДЕНЬ(Sesons.ЗИМА, 31);
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
