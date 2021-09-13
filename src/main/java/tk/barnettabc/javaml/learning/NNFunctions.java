package tk.barnettabc.javaml.learning;

import java.util.Locale;

public class NNFunctions {
    public static String FUNCTION;
    public static double cost(double[] expected, double[] reality)  {
        double cost = 0;
        if(expected.length!=reality.length) {
            System.out.println("COST ERRRRROOOOORRRR");
            return Double.parseDouble(null);
        }
        for(int i = 0; i<expected.length; i++)  {
            cost+= Math.sqrt(Math.abs((reality[i]*reality[i])-(expected[i]*expected[i])));
        }
        return cost;
    }
    public static double sigmoid(double x)
    {
        return 1 / (1 + Math.exp(-x));
    }
    public static double inverseSigmoid(double x) {   return -Math.log((1/x)-1)  /   Math.log(Math.E);    }
    public static double function(String FUNCTION, double x)    {
        switch (FUNCTION.toLowerCase())  {
            case "sigmoid":
                return sigmoid(x);
            case "no-function":
                    return (x);
            default:
                return 0;
        }
    }
}
