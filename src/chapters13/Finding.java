package chapters13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author by kissx on 2016/9/1.
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");  //m.group()只获得第一匹配的字符串
            i++;
        }
    }
}
