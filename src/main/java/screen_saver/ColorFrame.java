package screen_saver;

import lombok.Setter;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * @author Evgeny Borisov
 */
//@Component
public class ColorFrame extends JFrame {
    private DataFactory factory = new DataFactory();


    @Setter
    private Color color;

    @PostConstruct
    public void init() {
        setSize(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void fly() {
        setLocation(factory.getNumberBetween(0, 1200), factory.getNumberBetween(0, 900));
        getContentPane().setBackground(color);
        repaint();
    }


}
