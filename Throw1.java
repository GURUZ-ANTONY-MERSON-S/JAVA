public class Throw1 {
    static void Year(int year) {
     while (year%4!=0) {
      throw new ArithmeticException ("It is not a leap year");
         }
    
    }
        public static void main(String[] args) {
           
            try {
               Year(1945);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
