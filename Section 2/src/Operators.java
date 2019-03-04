public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result% 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;


        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("This is not an Alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You have the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90 ) || (secondTopScore <= 90))
            System.out.println("One of these tests are true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is True");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is True");

        double myCurrValue = 20d;
        double myNextCurrValue = 80;

        double dataResult = ((myCurrValue + myNextCurrValue) * 25);
        System.out.println("My Result Is: " + dataResult);

        double conversionResult = dataResult % 40;
        System.out.println("ConversionResult Is: " + conversionResult);

        if (conversionResult <= 20)
            System.out.println("The Total Was Over Limit");

        if (conversionResult > 20)
            System.out.println("Expected Output");



















    }
}
