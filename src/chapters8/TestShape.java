package chapters8;

/**
 * @author by kissx on 2016/7/26.
 *         结论：覆盖优先（动态绑定 --> 实际变量、静态绑定 --> 声明变量）
 *         编译时看声明变量
 */
public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        Shape shape2 = new Square();
        shape2.draw();
    }
}

class Shape {
    public void draw() {
        System.out.println("Shape:  基类；");
    }
}

class Circle extends Shape {
    /*public void draw(){
        System.out.println("Circle: 子类；");
    }*/
}

class Square extends Shape {
    /*public void draw(){
        System.out.println("Square: 子类；");
    }*/
}

