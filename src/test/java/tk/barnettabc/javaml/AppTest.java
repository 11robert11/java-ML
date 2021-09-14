package tk.barnettabc.javaml;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static double[] ins = new double[19];
    public static double[] factor = new double[19];
    public static double[] outs = new double[19];
    public static Thread[] threads = new Thread[19];
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        matrixMulti();
        assertTrue( true );
    }
    public void fill()  {
        Thread.
        for(int i = 0; i<19; i++)   {
            ins[i] = 7;
            factor[i] = 8;
        }
    }
    public void matrixMulti()   {
        for(int i = 0; i<ins.length; i++)   {
            threads[i] = new adds(i);
            threads[i].start();
        }
    }
    class adds extends Thread implements Runnable{

        public adds(int i) {
            System.out.println("Adding " + i);
            outs[i] = ins[i] * factor[i];
        }


    }
}
