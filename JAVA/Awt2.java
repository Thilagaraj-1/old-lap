import java.awt.*;

class MyWindow extends Frame {
    Button but1, but2, but3, but4, but5;

    MyWindow() {
        setVisible(true);
        setSize(100, 100);
        but1 = new Button("CENTER");
        but2 = new Button("NORTH");
        but3 = new Button("SOUTH");
        but4 = new Button("WEST");
        but5 = new Button("EAST");

        add(but1, BorderLayout.CENTER);
        add(but2, BorderLayout.NORTH);
        add(but3, BorderLayout.SOUTH);
        add(but4, BorderLayout.WEST);
        add(but5, BorderLayout.EAST);
    }
}

class Awt2 {
    public static void main(String[] arg) {
        MyWindow mw1 = new MyWindow();
    }
}