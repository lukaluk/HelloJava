    /*
     * Próba rozwiąznia zadania TrzyPięćSiedem
     *
     * Exercise from: http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
     *
     * Point 12. Conditional (or Decision)
     * Exercise
     *  1. Write a program called ThreeFiveSevenSum to sum all the running integers from 1 and 1000,
     *     that are divisible by 3, 5 or 7, but NOT by 15, 21, 35 or 105.
     *
     *
     */
    public class ThreeFiveSevenSum {  // Save as "ThreeFiveSevenSum.java"
        public static void main(String[] args) {
            int lowerbound = 1, upperbound = 1000;  // lowerbound and upperbound, warunki brzegowe
            int sumThree  = 0;   // do zbioru dzielnych przez 3
            int sumFive = 0;    // do zbioru dzielnych przez 5
            int sumSeven = 0;   // do zbioru dzielnych przez 7
            int number = lowerbound; // pobiera kolejny numer z puli od 1 do 1000

            while (number <= upperbound) // pętle są wykonywane do momentu uzyskania 1000
            {
                // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
                if ((number % 3 == 0) && (number % 15 != 0) && (number % 21 != 0) && (number % 35 != 0) && (number % 105 != 0)) //warunki jakie ma spełnić liczba która będzie dodana do sumThree
                {  // dzielna przez 3
                    sumThree += number;   // suma dzielnych przez 3
                }
                if ((number % 5 == 0) && (number % 15 != 0) && (number % 21 != 0) && (number % 35 != 0) && (number % 105 != 0)) //warunki jakie ma spełnić liczba która będzie dodana do sumFive
                {   // dzielna przez 5
                    sumFive += number;    // suma dzielnych przez 5
                }
                if ((number % 7 == 0) && (number % 15 != 0) && (number % 21 != 0) && (number % 35 != 0) && (number % 105 != 0)) //warunki jakie ma spełnić liczba która będzie dodana do sumSeven
                {   // dzielna przez 7
                    sumSeven += number;   // suma dzielnych przez 7
                }
                ++number;  // Next number, zapętlenie i następna liczba do testu
            }

            int sumAll = sumThree + sumFive + sumSeven; // suma wszystkich składowych

            // Print the result
            System.out.println("The sum of 3 from " + lowerbound + " to " + upperbound + " is " + sumThree);
            System.out.println("The sum of 5 from " + lowerbound + " to " + upperbound + "  is " + sumFive);
            System.out.println("The sum of 7 from " + lowerbound + " to " + upperbound + "  is " + sumSeven);
            System.out.println("Sum of all is " + sumAll);
        }
    }