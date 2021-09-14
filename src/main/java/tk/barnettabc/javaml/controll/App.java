package tk.barnettabc.javaml.controll;



import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;


import java.io.IOException;
import java.util.List;

public class App
{

    public static void main( String[] args ) throws IOException {
        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
        List<String> arguments = runtimeMxBean.getInputArguments();
        if(!(arguments.contains("-Dlog4j.configurationFile=log4j2.xml")))    {
            System.out.println("U dont have a logger config");
        }
        new Main(args);

    }
}
