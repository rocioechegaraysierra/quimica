package showqui;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Fondo extends javax.swing.JPanel {
    
    public Fondo(int w, int h) {
        initComponents();
        setSize(w, h);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image im = new ImageIcon("C:/Users/Rocio/Documents/NetBeansProjects/ShowQui/src/showqui/fondo.jpg").getImage();
        g.drawImage(im, 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }
}
