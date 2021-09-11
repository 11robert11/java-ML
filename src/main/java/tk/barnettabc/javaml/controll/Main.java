package tk.barnettabc.javaml.controll;

import tk.barnettabc.javaml.learning.generic.NeuralLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.barnettabc.javaml.learning.generic.NeuralLayer;
import tk.barnettabc.javaml.learning.generic.Neuron;
import tk.barnettabc.javaml.learning.generic.WeightLayer;

import java.util.Arrays;

public class Main {
    String[] args;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public Main(String[] args) {
        this.args = args;
        NeuralLayer neuralLayer1 = new NeuralLayer(2, "Test Layer 1");
        NeuralLayer neuralLayer2 = new NeuralLayer(2, "Test Layer 2");
        WeightLayer weightLayer1 = new WeightLayer();
        weightLayer1.setPreviousLayer(neuralLayer1);
        weightLayer1.setNextLayer(neuralLayer2);
        weightLayer1.initializeWeights();
        for (Neuron neuron:neuralLayer1.getMyNeurons()) {
            neuron.setInput(1);
            neuron.calculateState();
        }
        weightLayer1.weightPropagate();
        for (Neuron neuron:neuralLayer2.getMyNeurons()) {
            neuron.calculateState();
            System.out.println(neuron.getState());
        }

    }
}
