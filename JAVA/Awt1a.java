import java.awt.*;

class MyWindow extends Frame {
    Button but1;

    MyWindow() {
        setVisible(true);
        setSize(400, 300);
        but1 = new Button("hello");

        add(but1);

    }
}

class Awt1a {
    public static void main(String[] arg) {
        MyWindow mw1 = new MyWindow();
    }
}