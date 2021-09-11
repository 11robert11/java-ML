package tk.barnettabc.javaml.controll;

import tk.barnettabc.javaml.learning.generic.NeuralLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tk.barnettabc.javaml.learning.generic.NeuralLayer;
import tk.barnettabc.javaml.learning.generic.Neuron;
import tk.barnettabc.javaml.learning.generic.WeightLayer;

import java.awt.event.WindowEvent;
import java.util.Arrays;

public class Main {
    String[] args;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public Main(String[] args) {
        this.args = args;
        NeuralLayer neuralLayer1 = new NeuralLayer(16384, "Input Layer 1");
        NeuralLayer neuralLayer2 = new NeuralLayer(32768, "Test Layer 2");
        NeuralLayer neuralLayer3 = new NeuralLayer(32768, "Test Layer 3");
        NeuralLayer neuralLayer4 = new NeuralLayer(9, "Output Layer");

        WeightLayer weightLayer1 = new WeightLayer();
        WeightLayer weightLayer2 = new WeightLayer();
        WeightLayer weightLayer3 = new WeightLayer();

        weightLayer1.setPreviousLayer(neuralLayer1);
        weightLayer1.setNextLayer(neuralLayer2);

        weightLayer2.setPreviousLayer(neuralLayer2);
        weightLayer2.setNextLayer(neuralLayer3);

        weightLayer3.setPreviousLayer(neuralLayer3);
        weightLayer3.setNextLayer(neuralLayer4);

        weightLayer1.initializeWeights();
        weightLayer2.initializeWeights();

        for (Neuron neuron:neuralLayer1.getMyNeurons()) {
            neuron.setInput(1);
            neuron.calculateState();
        }
        weightLayer1.weightPropagate();
        for (Neuron neuron:neuralLayer4.getMyNeurons()) {
            neuron.calculateState();
            System.out.println(neuron.getState());
        }

    }
}
