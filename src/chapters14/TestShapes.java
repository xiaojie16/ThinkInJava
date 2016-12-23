package chapters14;

/**
 * @author by kissx on 2016/9/13.
 */
class Shapes {
    @Override
    public String toString() {
        return "这是一个形状！";
    }

    public static void rote(Shapes shapes) throws ClassNotFoundException {
        if (!shapes.getClass().isInstance(new Circle()))
            System.out.println("旋转180度！");
        else
            System.out.println("你是圆不用旋转！");
    }
}

class Square extends Shapes {
    @Override
    public String toString() {
        return "这是一个正方形！";
    }
}

class Circle extends Shapes {
    @Override
    public String toString() {
        return "这是一个圆！";
    }
}


public class TestShapes {
    public static void main(String[] args) throws Exception {
        Shapes[] array = {new Circle(), new Square(), new Circle(), new Square()};
        for (Shapes shape : array) {
            Shapes.rote(shape);
        }
    }
}
