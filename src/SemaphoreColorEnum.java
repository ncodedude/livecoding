
public enum SemaphoreColorEnum {
    GREEN("YELLOW", 2000),
    YELLOW("RED", 1000),
    RED("GREEN", 3000);

    private String nextColor;
    private int waitingTime;

    SemaphoreColorEnum(String nextColor, int waitingTime) {
        this.nextColor = nextColor;
        this.waitingTime = waitingTime;
    }

    public SemaphoreColorEnum getNextColor() {
        return SemaphoreColorEnum.valueOf(this.nextColor);
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }
}
