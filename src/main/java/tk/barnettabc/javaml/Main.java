package tk.barnettabc.javaml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    String[] args;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public Main(String[] args) {
        this.args = args;
        logger.info(args.toString());
        Function function = new Function();
        function.setMB(2, 0);
        for(int i = 0; i<99; i++)   {
            function.setX(i);
            System.out.println(function.getY());
        }
        logger.
    }
}
