package finalword;

public final class FinalClass {

    private final String finalVariableOutterClass;

    public FinalClass() {
        finalVariableOutterClass = "final variable value in outter class, this will be immuatable";
    }

    private final void finalMethodExample(){

    }

    public class finalWord {
        private final String finalVariableInInnerClass;

        public finalWord() {
            finalVariableInInnerClass = "final variable value in inner class, this will be immuatable";;
        }
    }

}

