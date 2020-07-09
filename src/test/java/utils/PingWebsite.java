package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class PingWebsite {
    public static boolean doCommand(List<String> command)
            throws IOException {

        ProcessBuilder pb = new ProcessBuilder(command);
        Process process = pb.start();

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        return stdInput.readLine() != null;
    }
} 