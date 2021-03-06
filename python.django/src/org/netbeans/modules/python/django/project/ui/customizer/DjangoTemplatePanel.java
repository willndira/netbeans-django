/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ravi Hingarajiya
 *
 * Created on Oct 15, 2008, 5:43:15 PM
 */

package org.netbeans.modules.python.django.project.ui.customizer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.openide.awt.Mnemonics;

/**
 *
 * @author Ravi Hingarajiya
 */
public class DjangoTemplatePanel extends javax.swing.JPanel {

    private JButton cancelButton = new JButton();
    private JButton okButton = new JButton();
    
    /** Creates new form DjangoTemplatePanel */
    public DjangoTemplatePanel(String[] djangoTemplate ) {
        initComponents();
        for(String item: djangoTemplate){
            templateNameComboBox.addItem(item);
        }
        Mnemonics.setLocalizedText(cancelButton,"cancel");//NOI18N
        Mnemonics.setLocalizedText(okButton,"OK");//NOI18N
    }
    
    public String getTemplateName () {
        return String.valueOf(templateNameComboBox.getSelectedItem());
    }

    public String getUrlName () {
        return String.valueOf(templateUrlTextField.getText());
        
    }

    public JButton getOKButton() {
        return okButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void templateNameComboBoxActionPerformed(java.awt.event.ActionEvent evt){
        templateUrlTextField.setText((String)templateNameComboBox.getSelectedItem());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        templateNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        templateNameComboBox = new javax.swing.JComboBox();
        templateUrlTextField = new javax.swing.JTextField();

        templateNameLabel.setText(org.openide.util.NbBundle.getMessage(DjangoTemplatePanel.class, "DjangoTemplatePanel.templateNameLabel.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(DjangoTemplatePanel.class, "DjangoTemplatePanel.jLabel2.text")); // NOI18N

        templateNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        templateNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                templateNameComboBoxActionPerformed(evt);
            }
        });

        templateUrlTextField.setText(org.openide.util.NbBundle.getMessage(DjangoTemplatePanel.class, "DjangoTemplatePanel.templateUrlTextField.text")); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, templateNameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(templateUrlTextField)
                    .add(templateNameComboBox, 0, 222, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(templateNameLabel)
                    .add(templateNameComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel2)
                    .add(templateUrlTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox templateNameComboBox;
    private javax.swing.JLabel templateNameLabel;
    private javax.swing.JTextField templateUrlTextField;
    // End of variables declaration//GEN-END:variables

}
