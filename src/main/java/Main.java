public class Main {
    public static void main(String[] args) {

        //Convert string representation of an integer (e.g. 4, -77, ...) to an int and an Integer. Which method on Integer do you use to convert to int and which for Integer?
        String num = "25";
        int numInt = Integer.parseInt(num);
        Integer numInteger = Integer.valueOf(num);

        //Convert string representation of an decimal number (e.g. 4, -77.22, ...) to a double and a Double. Which method on Double do you use to convert to double and which for Double?

        String doubleNumString = "1.25";
        double numdouble = Double.parseDouble(doubleNumString);
        Double numDouble = Double.valueOf(doubleNumString);

        //Try to convert a string that is not a number (e.g. abc) to an Integer. What happens?
        int abcInt = Integer.parseInt("abc");
        System.out.println(abcInt);

        //How do you convert an integer to a double?
        int a = 3;
        double b = a;
        System.out.println(a);

        //How do you convert a double to an integer?
        double c = 3.14;
        int i = (int) c;

    }
}
