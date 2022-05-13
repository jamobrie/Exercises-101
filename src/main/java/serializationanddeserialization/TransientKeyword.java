package serializationanddeserialization;// of a Java object
import java.io.*;

class TransientKeyword implements java.io.Serializable
{
    public int a;
    public String b;
    public transient String transientWord;
    //When we mark any variable as transient, then that variable is not serialized.

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", transientWord='" + transientWord + '\'' +
                '}';
    }

    // Default constructor
    public TransientKeyword(int a, String b, String transientWord)
    {
        this.a = a;
        this.b = b;
        this.transientWord = transientWord;
    }

}

class Test
{
    public static void main(String[] args)
    {
        TransientKeyword object = new TransientKeyword(1, "geeksforgeeks", "transientWord");
        String filename = "file.ser";

        // Serialization 
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        TransientKeyword object1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (TransientKeyword)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
            System.out.println("b = " + object1.transientWord);
            System.out.println("toString() = " + object1.toString());


        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}