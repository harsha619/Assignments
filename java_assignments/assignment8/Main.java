package assignment8;

public class Main {
    public static void main(String[] args) {
        boolean inputError=true;
        boolean printError=true;
        boolean lineError=true;
        try{
            if(inputError) {
                throw new ScannerError("input must be integer");
            }
            if (printError){
                throw  new PrintError("output should be integer");
            }
            if(lineError)
                throw  new LineError("line should not be empty");

        } catch (ScannerError | PrintError |LineError e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("process is completed");
        }
    }
}
