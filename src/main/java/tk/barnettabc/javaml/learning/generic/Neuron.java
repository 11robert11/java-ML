package tk.barnettabc.javaml.learning.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.barnettabc.javaml.learning.NNFunctions;

/***
 * Each Neuron an
 *  - activation Function (String) FUNCTION
 *  - Input (double) INPUT
 *  - OUTPUT (double) OUTPUT
 */
public class Neuron {
    public double Input;
    public double state;
    public double bias;
    public double backIn;  //
    public double backOut; //The x of the function
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    /***
     *
     *
     */
    public Neuron() {
        logger.info("Neuron Created");
        backIn = 0;
        backOut = 0;
        //this.bias = Math.random();
        this.bias=0;
        System.out.println(this.bias);
    }
    public double calculateState()   {
        state = NNFunctions.sigmoid(Input+bias);
        //state = NNFunctions.function("sigmoid", Input+bias);
        logger.info("Calculating state");
        return state;
    }
    public double calculateBackward()    {
        backOut = NNFunctions.inverseSigmoid(backIn);
        return backOut;
    }

    public double getState()    {
        return state;
    }
    public double getBackOut()  {return backOut;}
    public void addToInput(double Input)    {
        this.Input+=Input;
    }
    public void setInput(double Input)  {this.Input = Input;}
    public void addToBackIn(double backIn)  {this.backIn+=backIn;}
    public void setBackIn(double backIn)  {this.backIn = backIn;}
}