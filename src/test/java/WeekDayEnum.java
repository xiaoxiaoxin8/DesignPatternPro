public enum WeekDayEnum {
    Sunday(1),
    Monday(2),
    TuseDay(3),
    WednessDay(4),
    ThurseDay(5),
    Friday(6),
    SaturDay(7);

    public int value;

    private WeekDayEnum(int value){
        this.value = value;
    }
}
