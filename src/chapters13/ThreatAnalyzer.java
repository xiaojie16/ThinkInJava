package chapters13;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * @author by kissx on 2016/9/8.
 */
public class ThreatAnalyzer {
    static String threatData =
            "58.27.161.01@02/10/2005\n" +
                    "192.24.161.177@01/10/2015\n" +
                    "192.168.0.1@08/09/2016";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.printf("Threat on %s from %s\n", date, ip);
        }
    }
}
