

class sync{
    int count=0;

    public synchronized static void incre(){
            count++;
        }
    }
     class Team implements Runnable{
        sync sc;
    
        public Team(sync sc) {
            this.sc=sc;
    
        }
    
        
        public void run(){
            for (int i = 0; i <=10; i++) {
                sync.incre();
        }
    }
    
}



public class Hell {
    public static void main(String[] args) {
        sync obj=new sync();
    }
}
