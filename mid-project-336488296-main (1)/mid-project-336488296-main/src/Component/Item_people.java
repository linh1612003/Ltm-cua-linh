
package Component;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Le Duy
 */
public class Item_people extends javax.swing.JPanel {

    /**
     * Creates new form Item_people
     */
    public Item_people(String name) {
        initComponents();
        lb.setText(name);
        init();
    }
    
    private void init() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(new Color(230,230,230));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(new Color(242, 242, 242));
            }
        });
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new Swing.ImageAvatar();
        imageAvatar2 = new Swing.ImageAvatar();
        imageAvatar3 = new Swing.ImageAvatar();
        lb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));

        imageAvatar3.setBorderSize(0);
        imageAvatar3.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-test-account-45.png"))); // NOI18N

        lb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ImageAvatar imageAvatar1;
    private Swing.ImageAvatar imageAvatar2;
    private Swing.ImageAvatar imageAvatar3;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
