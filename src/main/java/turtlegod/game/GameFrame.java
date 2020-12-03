package turtlegod.game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("hahahaha");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(800, 800));
        
    }

}
