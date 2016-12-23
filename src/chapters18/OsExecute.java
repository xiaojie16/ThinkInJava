package chapters18;

import java.io.*;

/**
 * 挺有意思
 * @author by kissx on 2016/11/14.
 */
public class OsExecute {

    public static void command(String command) throws Exception{
        boolean err = Boolean.FALSE;
        // 注意下面指定读取编码
        try(BufferedWriter bfWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\test.txt",false)))){
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results  = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String s;
            while ((s = results.readLine()) != null)
                bfWriter.write(s + "\r\n");
            BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((s = errors.readLine()) != null){
                bfWriter.write(s + "\r\n");
                err = true;
            }
        }catch (Exception e){
            if (!command.startsWith("CMD /C"))
                command("CMD /C " + command);
            else
                throw new RuntimeException(e);
        }
        if (err)
            throw new Exception("Errors executing " + command);
    }

    public static void main(String[] args) throws Exception{
        OsExecute.command("ipconfig");
    }

}
