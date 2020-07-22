import Controllers.AppenderWorkshop;
import Controllers.LayoutWorkshop;
import Controllers.LogFile;
import Core.EngineImpl;
import Logger01.Logger;
import Logger01.MessageLogger;
import enums.ReportLevel;
import interfaces.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        var reader =  new BufferedReader(new InputStreamReader(System.in));
        Logger logger = new MessageLogger();
        new EngineImpl(reader, logger).run();

        System.out.println(logger);



    }


}
