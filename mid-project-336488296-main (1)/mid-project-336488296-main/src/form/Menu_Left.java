
package form;

import Component.Item_people;
import Swing.ScrollBar;
import event.EventMenuLeft;
import event.PublicEvent;
import java.util.ArrayList;
import java.util.List;
import model.Model_User_Account;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Le Duy
 */
public class Menu_Left extends javax.swing.JPanel {
     private List<Model_User_Account> userAccount;
    /**
     * Creates new form Menu_Lèt
     */
    public Menu_Left() {
        initComponents();
        init();
    }

   private void init() {
        sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        userAccount = new ArrayList<>();
        PublicEvent.getInstance().addEventMenuLeft(new EventMenuLeft() {
            @Override
            public void newUser(List<Model_User_Account> users) {
                for (Model_User_Account d : users) {
                    userAccount.add(d);
                    menuList.add(new Item_people(d.getUserName()), "wrap");
                    refreshMenuList();
                }
            }
        });
        showMessage();
    }

    private void showMessage() {
        //  test data
        menuList.removeAll();
        for (Model_User_Account d : userAccount) {
            menuList.add(new Item_people(d.getUserName()), "wrap");
        }
        refreshMenuList();
    }

    private void showGroup() {
        //  test data
        menuList.removeAll();
        for (int i = 0; i < 5; i++) {
            menuList.add(new Item_people("Group " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showBox() {
        //  test data
        menuList.removeAll();
        for (int i = 0; i < 10; i++) {
            menuList.add(new Item_people("Box " + i), "wrap");
        }
        refreshMenuList();
    }

    private void refreshMenuList() {
        menuList.repaint();
        menuList.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JLayeredPane();
        menuMessage = new Component.MenuButton();
        menuGroup = new Component.MenuButton();
        menuBox = new Component.MenuButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        Menu.setBackground(new java.awt.Color(229, 229, 229));
        Menu.setInheritsPopupMenu(true);
        Menu.setOpaque(true);
        Menu.setLayout(new javax.swing.BoxLayout(Menu, javax.swing.BoxLayout.LINE_AXIS));

        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-message-30 (1).png"))); // NOI18N
        menuMessage.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-message-30.png"))); // NOI18N
        menuMessage.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-message-30 (1).png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        Menu.add(menuMessage);

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-people-30.png"))); // NOI18N
        menuGroup.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-group-30.png"))); // NOI18N
        menuGroup.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-people-30.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        Menu.add(menuGroup);

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-letter-30 (1).png"))); // NOI18N
        menuBox.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-letter-30.png"))); // NOI18N
        menuBox.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-letter-30 (1).png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        Menu.add(menuBox);

        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(229, 229, 229));
        menuList.setLayout(new javax.swing.BoxLayout(menuList, javax.swing.BoxLayout.LINE_AXIS));
        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
        if (!menuMessage.isSelected()) {
            menuMessage.setSelected(true);
            menuGroup.setSelected(false);
            menuBox.setSelected(false);
            showMessage();
        }
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        if (!menuGroup.isSelected()) {
            menuMessage.setSelected(false);
            menuGroup.setSelected(true);
            menuBox.setSelected(false);
            showGroup();
        }
    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
         if (!menuBox.isSelected()) {
            menuMessage.setSelected(false);
            menuGroup.setSelected(false);
            menuBox.setSelected(true);
            showBox();
         }
    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Menu;
    private Component.MenuButton menuBox;
    private Component.MenuButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private Component.MenuButton menuMessage;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
