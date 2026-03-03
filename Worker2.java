public class Worker2 implements Runnable {
    int id, N;
    public Worker2(int i, int N) {
        this.id = i;
        this.N = N;
    }
    @Override
    public void run() {
        doWork();
    }
    private void doWork() {
        for (int ctr = 1; ctr <= N; ctr++) {
            System.out.println("Wid=" + id + " ctr=" + ctr);
        }
    }
}
