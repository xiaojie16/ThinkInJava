package chapters14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 代理模式的经典应用
 *
 * @author by kissx on 2016/9/25.
 */
public class TestProxy {
    public static void main(String[] args) {
        ImageProxy proxy = new ImageProxy(new IImageDisplay());
        proxy.displayImage();
        proxy.mousePress();
    }
}

interface IImage {
    void displayImage();
}

class IImageDisplay implements IImage {
    @Override
    public void displayImage() {
        System.out.println("显示原图！");
    }
}

class ImageProxy implements IImage {
    private IImage proxy;

    public ImageProxy(IImage proxy) {
        this.proxy = proxy;
    }

    @Override
    public void displayImage() {
        System.out.println("显示缩略图！");
        try {
            FileInputStream file = new FileInputStream("我只是测试!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void mousePress() {
        proxy.displayImage();
    }
}
