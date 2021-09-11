package tk.barnettabc.javaml.learning.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class NeuralLayer {
    List<Neuron> myNeurons = new ArrayList<Neuron>();
    String layerName;
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public NeuralLayer(int neuronCount)    {
        logger.info("Creating NeuralLayer with " + neuronCount + " Neurons");
        for(int i = 0; i<neuronCount; i++)  {
            myNeurons.add(new Neuron());
        }
    }
    public NeuralLayer(int neuronCount, String layerName)    {
        this.layerName = layerName;
        logger.info("Creating NeuralLayer with " + neuronCount + " Neurons and is named " + this.layerName);
        for(int i = 0; i<neuronCount; i++)  {
            myNeurons.add(new Neuron());
        }
    }
    public List<Neuron> getMyNeurons() {
        return myNeurons;
    }
}