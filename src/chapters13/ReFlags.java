package chapters13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author by kissx on 2016/9/8.
 */
public class ReFlags {
    public static void main(String[] args) {
        //注意下面"|"运算符的用法
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher("java has regex\nJava has regex\n" +
                "JAVA has pretty good regular expression\n" +
                "Regular expression are in Java");
        while (m.find())
            System.out.println(m.group());
    }
}
