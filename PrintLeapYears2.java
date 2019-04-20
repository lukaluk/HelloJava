/*
 * Próba rozwiąznia zadania LataPrzestępne
 *
 * Exercise from: http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
 *
 * Point 12. Conditional (or Decision)
 * Exercise
 *  2. Write a program called PrintLeapYears to print all the leap years between AD999 and AD2010.
 *
 *  https://pl.wikipedia.org/wiki/Rok_przestępny
 *
 *  Also print the total number of leap years.
 *  (Hints: use a int variable called count, which is initialized to zero.
 *  Increment the count whenever a leap year is found.)
 *
 * 	// Return true if "year" is a leap year
    // A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
    ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)
 */

public class PrintLeapYears2 {  // Save as "PrintLeapYears.java"
    public static void main(String[] args) {
        int AD999 = 999, AD2019 = 2019;  // zakres obliczeń, warunki brzegowe

        int count = 0; // licznik lat przestępnych
        int year = AD999; // pobiera pierwszy i kolejne numery z puli od 999 do 2100
        while (year <= AD2019) // pętle są wykonywane do momentu uzyskania roku/wartości AD2010

        {
            // year = AD999, AD999+1, AD999+2, ..., AD2010 for each iteration

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) //warunki jakie ma spełnić rok przestępny,
            {  // jeśli powyższy warunek zosał spełniony dodaje jeden
                ++count;   // licznik przestępnych
                System.out.println("Rokiem przestępnym był " + year); // pokazanie który rok był przestępny
            }
            ++year;  // Next number, zapętlenie i następna liczba do testu
        }

        // Print the result
        System.out.println("Liczba lat przestępnychc z zakresu lat " + AD999 + " do " + AD2019 + " to " + count);

    }
}
