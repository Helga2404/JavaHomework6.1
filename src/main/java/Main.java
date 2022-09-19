public class Main {

    public static void main(String[] args) {

       int rangeLow = 200;
       int rangeHigh = 300;

       int sqrNum = 0;

       for (int i = 10; i <= 99; i++) {
         if (i * i < rangeLow) {
           continue;
       }
         if (i * i > rangeHigh) {
           break;
         }
         sqrNum++;

       }

       System.out.println(sqrNum);

    }

}












