public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, Ania");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");

            int topScore = 80;
            if (topScore < 100) {
                System.out.println("You got the high score!");
            }

            int secondTopScore = 95;
            if ((topScore > secondTopScore) && (topScore < 100)) {
                System.out.println("Greater than second top score and less than 100");
            }

            if ((topScore > 90) || (secondTopScore <= 90)){
                System.out.println("Either or both of the conditions are true");
            }

            int newValue = 50;
            if (newValue == 50) {
                System.out.println("This is true");
            }

            boolean isCar = false;
            if (!isCar) {
                System.out.println("This is not supposed to happen");
            }

            String makeOfCar = "Volkswagen";
            boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

            if (isDomestic) {
                System.out.println("This car is domestic to our country");
            }

            String s  = (isDomestic) ? "This car is domestic" : "This car is not domestic";

            System.out.println(s);

            double firstVariable = 20.00d;
            double secondVariable = 80.00d;

            double resultStep3 = (firstVariable + secondVariable) * 100.00d;
            System.out.println("MyValueTotal = " + resultStep3);
            double resultStep4 = resultStep3 %  40.00d;
            System.out.println("theRemainder = " + resultStep4);
            boolean resultStep5 = resultStep4 == 0.00 ? true : false;
            System.out.println("isNoRemainder = " + resultStep5);
            System.out.println(resultStep5);
            if (!resultStep5){
                System.out.println("got some remainder");
            }
        }
    }
}
