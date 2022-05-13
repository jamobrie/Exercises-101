package serializationanddeserialization;

import java.io.Serializable;

//TODO return to this Jimmy
public class SerializeExample implements Serializable {
    private static final long serialVersionUID = 1L;
    static String country = "ITALY";
    private int age;
    private String name;
    transient int height; //transient to ignore class fields during serialization:

    // getters and setters
}
