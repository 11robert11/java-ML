package tk.barnettabc.javaml.controll;

import tk.barnettabc.javaml.learning.NNFunctions;
import tk.barnettabc.javaml.learning.generic.NeuralLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tk.barnettabc.javaml.learning.generic.WeightLayer;


public class Main {
    String[] args;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public Main(String[] args) {
        this.args = args;
        NeuralLayer inputLayer = new NeuralLayer(2,"Input");
        NeuralLayer hiddenLayer = new NeuralLayer(2,"Hidden");
        NeuralLayer outputLayer = new NeuralLayer(1,"Output");

        WeightLayer weightLayer1 = new WeightLayer();
        WeightLayer weightLayer2 = new WeightLayer();

        weightLayer1.setPreviousLayer(inputLayer);
        weightLayer1.setNextLayer(hiddenLayer);

        weightLayer2.setPreviousLayer(hiddenLayer);
        weightLayer2.setNextLayer(outputLayer);

        weightLayer1.initializeWeights();
        weightLayer2.initializeWeights();

        inputLayer.getMyNeurons().get(0).setInput(5);
        double a;
        while(true) {
            for(int i = 0; i < inputLayer.getMyNeurons().size(); i++)   {
                a = Math.random()*10;
                System.out.println("Random Number i: " + a);
                inputLayer.getMyNeurons().get(i).setInput(a);
            }
            weightLayer1.propogateForward();
            weightLayer2.propogateForward();
            System.out.println("Output: " + outputLayer.getMyNeurons().get(0).calculateState());
            System.out.println("Cost: " + NNFunctions.cost(new double[]{inputLayer.getMyNeurons().get(0).Input * inputLayer.getMyNeurons().get(1).Input}, new double[]{outputLayer.getMyNeurons().get(0).calculateState()}));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
