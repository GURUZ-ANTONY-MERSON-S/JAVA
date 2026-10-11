
    public class  Synchronization {
        private int count;
    
        public synchronized void increment() {
            count++;
        }
    
        public int getCount() {
            return count;
        }

