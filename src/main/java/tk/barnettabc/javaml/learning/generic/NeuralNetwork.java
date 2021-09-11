package tk.barnettabc.javaml.learning.generic;


import tk.barnettabc.javaml.learning.NNFunctions;

public class NeuralNetwork {
    NeuralLayer[] NEURALLAYERS;

    class NeuralLayerFactory    {
        NeuralLayer[] neuralLayers;
        public void createLayer(int neurons)   {
            neuralLayers[neuralLayers.length] = new NeuralLayer(1, neuralLayers.length);
        }
        public void build() {
            this.neuralLayers = neuralLayers;
        }
    }
    class NeuralLayer {
        /***
         * The NEURONS list holds all the neuron objects in this NeuralLayer
         */
        public Neuron[] NEURONS;
        /***
         * The NEURONS varible holds the neurons for this layer, each layer has neurons and thier
         */
        public int indexInNetwork;

        public NeuralLayer(int neurons, int indexInNetwork) {
            this.indexInNetwork = indexInNetwork;
            for (int i = 0; i < neurons; i++) {
                NEURONS[i] = new Neuron(); // FUNCTION is the neuron activation function, this is gona be changed later.
            }
        }


    }
    }

