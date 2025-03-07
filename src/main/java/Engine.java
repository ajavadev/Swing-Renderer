import java.awt.*;
import javax.swing.*;

public class Engine extends JFrame {
    private final int xResolution;
    private final int yResolution;

    public Engine(String title, int xResolution, int yResolution) {
        super(title);
        setVisible(false);

        this.xResolution = xResolution;
        this.yResolution = yResolution;

        init();
    }

    private void init() {
        setSize(xResolution, yResolution);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public int getXResolution() {
        return this.xResolution;
    }

    public int getYResolution() {
        return this.yResolution;
    }
}
