public class Loops {
    public static void main(String[] args) {
        // casting: to convert variables between data types

        int j = (int) (5.0 / 2.0);
        System.out.println(j);

        // other methods of casting: declaring a new variable of a different data type
        // set it equal to the value of a previous variable

        int original = 6;
        double copy = original;

        // repeatedly doing the operations shown below will just end up making a long chain of operations
        System.out.println(copy);

        // automatically, whole values are interpreted as integers

        // change value of variables in shorthand
         original = original + 1;
         System.out.println(original);

         // shorthand versions

        original += 1; // this also means original + 1
        original++; // this also means original + 1
        original--; // this means original - 1
        original += 10; // this means original + 10
        original *= 5; // this means original x 5
        original /= 2; // original = original / 2

        // iteration: fancy word for looping a process
        // for(starting condition; condition that must be true; condition of change)
        for(int i = 0; i < 10; i++) {
            System.out.println("I am " + i + " years old." ); // prints I am 0-9 years old.
        }

        for(int i = 1; i <= 10000; i *= 10 ) {
            System.out.println(i);
        }

        for(int o = 1000; o >= 1; o /= 10) {
            System.out.println(o);
        }

        for (int i = 1 ; i< 10 ; i++) {
            if (i < 6) {
                System.out.println("*" .repeat(i));}
            else { System.out.println("*" .repeat(10-i));
            }
        }

        // for loop: count down from 101 to 0. print every perfect square.
        // math.sqrt() = square root function
        // ?: how to tell that this is equal to the integer value of the square root.

        System.out.println(Math.sqrt(101));

        for (int i = 1 ; i <= 101 ; i++);
        System.out.println(Math.sqrt());
    }
}
