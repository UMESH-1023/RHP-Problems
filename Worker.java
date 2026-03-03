public class Worker extends Thread{
    int id,N;
    public Worker(int i,int N){
        this.id=i;
        this.N=N;
    }
    @Override
    public void run(){
        dowork();
    }
    private void dowork(){
        for(int ctr=1;ctr<=N;ctr++){
            System.out.println("Wid="+id+" ctr="+ctr);
        }
    }
}
