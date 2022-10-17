package JavaAdvanced.lambdaAndMethodReference;

interface Parser {
    String parse(String s);
}

class StringConverter {
    public static String convert(String s) {
        return s + " is the Boss";
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Parser parser = StringConverter::convert;
//        Parser par = (str)-> str + " is the Boss";
        System.out.println(parser.parse("Devesh"));
    }
}




