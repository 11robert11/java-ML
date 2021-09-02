package tk.barnettabc.javaml.learning;

public class NNFunctions {
    public static double sigmoid(double x)
    {
        return 1 / (1 + Math.exp(-x));
    }
}
