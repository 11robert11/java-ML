package tk.barnettabc.javaml;

public class Fuction {
    int slope = 1;
    int YIntercept = 0;
    int X = -0;
    int Y = -0;

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public void setYIntercept(int yIntercept) {
        this.YIntercept = yIntercept;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        updateY();
        return Y;
    }

    public void randomX(int[] range)    {
        X = (int) (range[0] + Math.random() * range[1]);
    }

    public void randomX()   {
        X = (int) (0 + Math.random() * 9);
    }

    private void updateY()  {
        Y = X * slope + YIntercept;
    }
}
