

public class Mian {

    public static void main(String[] args) {
        System.out.println(Mian.possibleBbts(3));

    }


    static int possibleBbts(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }
        int m=(int)java.lang.Math.pow(10,9)+7;
        int x = possibleBbts(n - 1);
        int y = possibleBbts(n - 2);

        long res1=(long)x*x;
        long res2=(long)x*y*2;

        int finalres=(int)(res1%m);
        int finalres2=(int)(res2%m);


        int finalResult=(finalres+finalres2)%m;




        return finalResult;


    }
    
    // without using modulo operation
    
    static int possibleBbts1(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }
        int x = possibleBbts1(n - 1);
        int y = possibleBbts1(n - 2);

        return x * x + 2 * x * y;

    }
    
    
}