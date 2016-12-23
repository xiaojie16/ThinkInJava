package chapters13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author by kissx on 2016/9/8.
 */
public class JGrep {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        Matcher matcher = p.matcher("");
        /*
        //下面的 TextFile 没有定义（略）
        for (String line : new TextFile(args[0])){
            matcher.reset(line);
            while (matcher.find())
                System.out.println(index++ + ": " + matcher.group() + ": " + matcher.start());
        }
        //*/
    }
}
