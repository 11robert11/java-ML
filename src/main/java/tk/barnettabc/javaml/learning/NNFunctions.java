package tk.barnettabc.javaml.learning;

import java.util.Locale;

public class NNFunctions {
    public static String FUNCTION;
    public static double sigmoid(double x)
    {
        return 1 / (1 + Math.exp(-x));
    }
    public static double function(String FUNCTION, double x)    {
        switch (FUNCTION.toLowerCase())  {
            case "sigmoid":
                return sigmoid(x);
            default:
                return 0;
        }
    }
}
