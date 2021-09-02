package tk.barnettabc.javaml.learning;


public class NeuralNetwork {



    class NeuralLayer   {
        NeuralLayer previousLayer;
        NeuralLayer nextLayer;
        public void setNextLayer(NeuralLayer nextLayer)   {
            this.nextLayer = nextLayer;
        }
        public void setPreviousLayer(NeuralLayer previousLayer) {
            this.previousLayer = previousLayer;
        }
        class Neuron    {
            class NeuronInput   {
                public double NEURONINPUT;
                public void dataIn(double postWeighsIntoNextNeuron[]) {
                    for(int i = 0; i<postWeighsIntoNextNeuron.length; )
                    NEURONINPUT = NEURONINPUT + postWeighsIntoNextNeuron[i];
                }
            }
            boolean weights[][]
        }
    }
}
