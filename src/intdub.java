public class intdub {
    public static void main(String[] args) {
    //Variables
    int intOperandA = 7;
    int intOperandB = 4;
    int intSum;
    int intDifference;
    int intProduct;
    int intQuotient;
    int intModulo;
    double doubleOperandA = 2.73;
    double doubleOperandB = 5.98;
    double doubleSum;
    double doubleProduct;
    double doubleDifference;
    double doubleQuotient;
    double doubleModulo;

    //Process of Integers;
    intSum = intOperandA + intOperandB;
    intDifference = intOperandA - intOperandB;
    intProduct = intOperandA * intOperandB;
    intQuotient = intOperandA / intOperandB;
    intModulo = intOperandA % intOperandB;

    //Process of Doubles;
    doubleSum = doubleOperandA + doubleOperandB;
    doubleDifference = doubleOperandA - doubleOperandB;
    doubleProduct = doubleOperandA * doubleOperandB;
    doubleQuotient = doubleOperandA / doubleOperandB;
    doubleModulo = doubleOperandA % doubleOperandB;

    //Output
    System.out.println("The sum of using integers " + intOperandA + " and " + intOperandB + " is " + intSum + ".");
    System.out.println("The difference of using integers " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");
    System.out.println("The product of using integers " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");
    System.out.println("The quotient of using integers " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");
    System.out.println("The modulo of using integers " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");
    System.out.println("The sum of using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");
    System.out.println("The difference of using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + ".");
    System.out.println("The product of using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + ".");
    System.out.println("The quotient of using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + ".");
    System.out.println("The modulo of using doubles " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo + ".");
    }
}