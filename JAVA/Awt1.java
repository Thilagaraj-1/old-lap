import java.awt.*;

class MyWindow extends Frame {
    Button but1;

    MyWindow() {
        setVisible(true);

        but1 = new Button("ok");
        add(but1);
    }
}

class Awt1 {
    public static void main(String[] arg) {
        MyWindow mw = new MyWindow();
        mw.setVisible(true);
        mw.setSize(200, 200);
        // MyWindow mw1 = new MyWindow();
    }
}