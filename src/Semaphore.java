public class Semaphore {

    private SemaphoreColorEnum color;
    private Boolean stop;

    public Semaphore() {
        this.color = SemaphoreColorEnum.RED;
        this.stop = false;
    }

    public void start() {

        while (!stop) {
            try {
                this.color = this.color.getNextColor();
                System.out.println(this.color);
                Thread.sleep(this.color.getWaitingTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void stop() {
        this.stop = true;
    }

}
