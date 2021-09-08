package tk.barnettabc.javaml.learning.generic;


import tk.barnettabc.javaml.learning.NNFunctions;

public class NeuralNetwork {
    NeuralLayer[] NEURALLAYERS;
    class weightLayers {
        class weightLayer {
            NeuralLayer previousLayer;
            NeuralLayer nextLayer;

            public void setNextLayer(NeuralLayer nextLayer) {
                this.nextLayer = nextLayer;
            }

            public void setPreviousLayer(NeuralLayer previousLayer) {
                this.previousLayer = previousLayer;
            }

            double[][] weights;

            public void setWeights(double[][] weights) {

                this.weights = weights;
            }

            public void weightPropagate() {
                for (int i = 0; i < NeuralLayer.NEURONS.length; i++) {
                    NeuralLayer.NEURONS[i].INPUT = 0; //Reset Neurons INPUT;
                    for (int a = 0; a < NeuralLayer.NEURONS.length; a++) {
                        NeuralLayer.NEURONS[i].addToInput(NeuralLayer.NEURONS[a].OUTPUT * weights[i][a]);
                    }
                }
            }
        }
    }
    class NeuralLayerFactory    {
        NeuralLayer[] neuralLayers;
        public void createLayer()   {
            neuralLayers[neuralLayers.length] = new NeuralLayer(1, neuralLayers.length);
        }
        public void build() {
            this.neuralLayers = neuralLayers;
        }
    }
    class NeuralLayer   {
        public static Neuron[] NEURONS;
        public NeuralLayer(int neurons, int index) {
        }


        class Neuron    {
            public double INPUT;
            public double OUTPUT = NNFunctions.function("sigmoid", INPUT);
            public void addToInput(double INPUT)    {
                this.INPUT+=INPUT;
            }
            }
        }
    }

