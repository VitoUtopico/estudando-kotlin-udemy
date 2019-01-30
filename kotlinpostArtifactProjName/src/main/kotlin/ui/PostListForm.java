package ui;

import javax.swing.*;

public class PostListForm extends JFrame{
    private JPanel rootPainel;
    private JTable tablePost;

    public PostListForm(){
        super();
        this.setContentPane(rootPainel);
        this.setSize(250,250);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
