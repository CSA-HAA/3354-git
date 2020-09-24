package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        }   catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Not enough arguements");
        } catch(NumberFormatException n) {
            System.err.println("Invalid characters");
        }
    }

    private static int addArguments(String[] args) {
        int total = 0
        for(int i=0;i<args.length;i++){
            total+=Integer.valueOf(args[i]) ;
        }
        return total;
    }
}
