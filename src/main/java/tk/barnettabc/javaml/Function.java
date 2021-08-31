package tk.barnettabc.javaml;

public class Function {
    private int slope = 1;
    private int YIntercept = 0;
    private int X = -0;
    private int Y = -0;

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public void setMB(int slope, int YIntercept)    {
        this.slope = slope;
        this.YIntercept = YIntercept;
    }
    public void setYIntercept(int yIntercept) {
        this.YIntercept = yIntercept;
    }

    public void setX(int x) {
        X = x;
    }
    public int getX()   {
        return X;
    }

    public int getY() {
        updateY();
        return Y;
    }

    public void randomX(int min, int max)    {
        X = (int) (min + Math.random() * max);
    }

    public void randomX()   {
        X = (int) (0 + Math.random() * 9);
    }

    private void updateY()  {
        Y = X * slope + YIntercept;
    }
}
