package tk.barnettabc.javaml.controll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.barnettabc.javaml.learning.generic.NeuralNetwork;

public class Main {
    String[] args;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public Main(String[] args) {
        NeuralNetwork network = new NeuralNetwork();
        this.args = args;
    }
}
