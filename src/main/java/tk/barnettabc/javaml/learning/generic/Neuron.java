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
    double Input;
    double state;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    /***
     *
     *
     */
    public Neuron() {
        logger.info("Neuron Created");
    }
    public double calculateState()   {
        state = NNFunctions.function("no-function", Input);
        return state;
    }
    public double getState()    {
        return state;
    }
    /***
     *
     * @param INPUT double number to add on to the neurons input
     */
    public void addToInput(double Input)    {
        this.Input+=Input;
    }
    public void setInput(double Input)  {
        this.Input = Input;
    }
}