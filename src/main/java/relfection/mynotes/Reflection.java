package relfection.mynotes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


//In this article, we will be exploring Java reflection, which allows us to inspect or/and modify runtime attributes of classes, interfaces, fields, and methods. This particularly comes in handy when we don't know their names at compile time.
//Additionally, we can instantiate new objects, invoke methods, and get or set field values using reflection.

public class Reflection {
    private String name;
    private int age;

    public static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }


}
