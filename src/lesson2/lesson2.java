package lesson2;

public class lesson2 {

    public static void main (String[] args) {

        within10and20(10, 0);
        checkNumber(4);
        isNegative(1);
        printNtimes("", 3);

    }

    public static boolean within10and20 ( int a, int b ) {

        int sum = a + b;
        boolean within10and20 = true;
        within10and20 = (sum >= 10 && sum <= 20) ;
        System.out.println(within10and20) ;
        return false ;
    }

    public static void checkNumber ( int a ) {

        if ( a < 0) {

            System.out.println ("Число отрицательное") ;

        } else if ( a >= 0) {

            System.out.println ("Число положительное") ;

        }

    }

    public static boolean isNegative ( int a ) {

        boolean isNegative = true ;

        isNegative = a < 0 ;

        System.out.println (isNegative);

        return false ;

    }

    public static void printNtimes ( String word, int times) {

        word = "Java is the best" ;

        if (times <= 0) {

            System.out.println ("Введите положительное число") ;

        }

        for ( int i = 0 ; i < times ; i++ ) {


            System.out.println ( word ) ;

        }

    }

}

