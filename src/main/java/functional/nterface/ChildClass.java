package functional.nterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ChildClass implements FunctionalInterfaceParentClass {


    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
//        nameMap.put("John", 688);
        //Where the value is actual a function ... see computeIfAbsent method in MAP class
        Integer value = nameMap.computeIfAbsent("John", String::length);

        System.out.println(value);

        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";

        Function<Integer, String> quoteIntToString = quote.compose(intToString);

        System.out.println("intToString: " + intToString);
        System.out.println("quote: " + quote);
        System.out.println("quoteIntToString: " + quoteIntToString);


//        assertEquals("'5'", quoteIntToString.apply(5));
    }

    @Override
    public String determineName() {
        return null;
    }

}
