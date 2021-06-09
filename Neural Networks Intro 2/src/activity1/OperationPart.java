package activity1;

public class OperationPart {

    public static int and(double[] input) {
        boolean r = true;
        for (int i = 0; i < input.length ; i++) {
            r = r && input[i] != 0;
        }
        return r ? 1 : 0;
    }

    public static int or(double[] input) {
        boolean r = false;
        for (int i = 0; i < input.length; i++) {
            r = r || input[i] != 0;
        }
        return r ? 1 : 0;
    }
    
    public static int nand(double[] input) {
        boolean r = false;
        for (int i = 0; i < input.length; i++) {
            r = r && input[i] != 0;
        }
        return r ? 1 : 0;
    }

    public static int xor(double[] input) {
        boolean r = true;
        for (int i = 0; i < input.length; i++) {
            r = r ^ input[i] != 0;
        }
        return r ? 1 : 0;
    }
}