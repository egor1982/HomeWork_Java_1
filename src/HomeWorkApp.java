public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        double someOfthing = sum (100, 200);
        System.out.println(someOfthing);
    }

    public static void printThreeWords() {

        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void checkSumSign() {

        int a = 15;   // объявляем целочислен перем по имени a со знач 15
        int b = -20;  // объявляем целочислен перем по имени b со знач -20

        int c = a + b;
        if (c > 0) {

            System.out.println( c + " сумма положительная");

        } else {

            System.out.println( c + " сумма отрицательная");

        }
    }

        public static void printColor() {

            int value = 2 ;
            if ( value <= 0) {

                System.out.println ( "Красный" ) ;

            }

            if ( value >= 0 && value <= 100 ) {

                System.out.println ( "Жёлтый" ) ;

            }

            if ( value > 100 ) {

                System.out.println ( "Зелёный" ) ;

            }

        }

        public static void compareNumbers() {

            int a = 3, b = 5 ;
            if ( a >= b) {

                System.out.println ( "a >= b" ) ;

            } else {

                System.out.println ( "a < b" ) ;

            }


    }
    public static  double sum (double x, double y) {

        double result = 0;
        result = x + y ;
        return result ;
        }


    }

