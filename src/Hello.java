public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Veries!"); // use to separate code on spearate lines.
        
        boolean isAlien = false;
        // use code blocks for an if statement
        if (isAlien == false) { // do not use the semicolon on the if statement
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the High Score!");
        }
        
        // Lesson 36 and operator &&
        // --------------------------------------------

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Lesson 37 or operator ||
        // --------------------------------------------
        
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        

        // Challenge
        // --------------------------------------------

        int newValue = 50;
        if (newValue == 50) { // orginal was if (newValue = 50) used an assigment operator. Need == instead of eqaulity operator.
            System.out.println("This is an Error");
        }

        // Lesson 38 Assignment (=) Eqaulity (==)
        // --------------------------------------------
        
        boolean isCar = false;
        if (!isCar) { // (!isCar) is also valid to use returns opposite value (!)
            System.out.println("This is not suppose to happen");
        }
        
        // Lesson 39 Ternary Operator
        // --------------------------------------------
        
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        
        System.out.println(s);
        
        // Lesson Challenge
        // --------------------------------------------
        // Step 1:  create a double variable with a value of 20.00.
        double myFirstVariable = 20.00;

        // Step 2:  create a second variable of type double with a value 80.00.
        double mySecondVariable = 80.00;

        // Step 3:  add both numbers together, then multiply by 100.00.
        double myTotalValue = ((myFirstVariable + mySecondVariable) * 100);
        System.out.println("myTotalValue * 100 is " + myTotalValue);

        // Step 4:  use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be.

        double myRemainder = myTotalValue % 2;
        System.out.println("myRemainder is " + myRemainder);

        // Step 5:  create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.

        // Step 6:  output the boolean variable just to see what the result is. 

        // Step 7:  write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.


        // Lesson 40 Operator Presedence 
        // --------------------------------------------




    }

}
