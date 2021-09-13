package tk.barnettabc.javaml.controll;

import tk.barnettabc.javaml.learning.NNFunctions;
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
        NeuralLayer inputLayer = new NeuralLayer(1,"Input");
        NeuralLayer hiddenLayer = new NeuralLayer(1,"Hidden");
        NeuralLayer outputLayer = new NeuralLayer(1,"Output");
        NeuralLayer testLayer = new NeuralLayer(1, "Test Layer");

        WeightLayer weightLayer1 = new WeightLayer();
        WeightLayer weightLayer2 = new WeightLayer();

        weightLayer1.setPreviousLayer(inputLayer);
        weightLayer1.setNextLayer(hiddenLayer);

        weightLayer2.setPreviousLayer(hiddenLayer);
        weightLayer2.setNextLayer(outputLayer);

        weightLayer1.initializeWeights();
        weightLayer2.initializeWeights();

        inputLayer.getMyNeurons().get(0).setInput(5);

        //weightLayer2.propogateBackward();
        //weightLayer1.propogateBackward();
        weightLayer1.propogateForward();
        weightLayer2.propogateForward();
        System.out.println(outputLayer.getMyNeurons().get(0).Input);
        System.out.println(outputLayer.getMyNeurons().get(0).calculateState());
        outputLayer.getMyNeurons().get(0).setBackIn(outputLayer.getMyNeurons().get(0).calculateState());

        weightLayer2.propogateBackward();
        weightLayer1.propogateBackward();
        System.out.println("After Back Prop input layer backin: " + inputLayer.getMyNeurons().get(0).calculateBackward());
        testLayer.getMyNeurons().get(0).setInput(4);
        testLayer.getMyNeurons().get(0).setBackIn(testLayer.getMyNeurons().get(0).calculateState());
        System.out.println(testLayer.getMyNeurons().get(0).calculateBackward());

    }
}
