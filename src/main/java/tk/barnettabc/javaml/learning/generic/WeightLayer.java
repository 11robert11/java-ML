package tk.barnettabc.javaml.learning.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The WeightLayer is responsible for factoring each connection to each individual Neuron.
 * The Weight Layer holds weights in a 2D array of doubles called weights.
 * Each Weight Layer also has varibles for the previos and next NeuralLayer
 */
public class WeightLayer {
    NeuralLayer previousLayer;
    NeuralLayer nextLayer;
    double[][] weights;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());


    public WeightLayer()    {
        logger.info("Created Weight Layer");
    }
    public void initializeWeights()  {
        logger.info("Initilizing a weight layer");
        weights = new double[nextLayer.getMyNeurons().size()][previousLayer.getMyNeurons().size()];
        for(int a = 0; a<nextLayer.getMyNeurons().size(); a++)  {
            for(int b = 0; b<previousLayer.getMyNeurons().size(); b++)  {
                weights[a][b] = 1;
            }
        }
    }
    public void setNextLayer(NeuralLayer nextLayer) {
        logger.info("Setting Next layer to " + nextLayer.layerName);
        this.nextLayer = nextLayer;
    }

    public void setPreviousLayer(NeuralLayer previousLayer) {
        logger.info("Setting Previous layer to " + previousLayer.layerName);
        this.previousLayer = previousLayer;
    }

    public void setWeights(double[][] weights) {
        this.weights = weights;
    }
    public double[][] getWeights()  {
        return weights;
    }

    public void weightPropagate() {
        for (int i = 0; i < nextLayer.getMyNeurons().size(); i++) {
            logger.info("Propogating weights");
            nextLayer.getMyNeurons().get(i).setInput(0);
            for (int a = 0; a < previousLayer.getMyNeurons().size(); a++) {
                nextLayer.getMyNeurons().get(i).addToInput(previousLayer.getMyNeurons().get(a).getState() * weights[i][a]);
            }
        }
    }

}
