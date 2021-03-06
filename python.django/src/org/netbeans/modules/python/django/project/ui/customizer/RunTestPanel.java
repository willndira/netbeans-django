/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RunCommandPanel.java
 *
 * Created on Nov 2, 2008, 3:09:41 PM
 */

package org.netbeans.modules.python.django.project.ui.customizer;

import javax.swing.JButton;
import org.openide.awt.Mnemonics;

/**
 *
 * @author Ravi Hingarajiya
 */
public class RunTestPanel extends javax.swing.JPanel {

    private JButton cancelButton = new JButton();
    private JButton okButton = new JButton();

    /** Creates new form RunCommandPanel */
    public RunTestPanel(String[] applications) {
        String[] commands = new String[1];
        commands[0] = "test";
//        initComponents(applications, commands);
        initComponents();
        for(String item: applications){
            applicationComboBox.addItem(item);
        }
        for(String item: commands){
            commandComboBox.addItem(item);
        }
        Mnemonics.setLocalizedText(cancelButton,"cancel");//NOI18N
        Mnemonics.setLocalizedText(okButton,"OK");//NOI18N
    }

    public JButton getOKButton() {
        return okButton;

    }

    public JButton getCancelButton() {
        return cancelButton;
    }

     public String getApplicationName() {
        return String.valueOf(applicationComboBox.getSelectedItem());

    }

    public String getArgs() {
        return argumetTextField.getText().trim();

    }

    public String getCommand() {
        return String.valueOf(commandComboBox.getSelectedItem());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        commandsLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        applicationComboBox = new javax.swing.JComboBox();
        argumetTextField = new javax.swing.JTextField();
        commandComboBox = new javax.swing.JComboBox();

        commandsLabel.setText(org.openide.util.NbBundle.getMessage(RunTestPanel.class, "RunTestPanel.commandsLabel.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(RunTestPanel.class, "RunTestPanel.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(RunTestPanel.class, "RunTestPanel.jLabel3.text")); // NOI18N

        applicationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationComboBoxActionPerformed(evt);
            }
        });

        argumetTextField.setText(org.openide.util.NbBundle.getMessage(RunTestPanel.class, "RunTestPanel.argumetTextField.text")); // NOI18N

        commandComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(commandsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(argumetTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(applicationComboBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(commandComboBox, 0, 216, Short.MAX_VALUE)))
                .addContainerGap(80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(commandsLabel)
                    .add(commandComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel2)
                    .add(applicationComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(argumetTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applicationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationComboBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_applicationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox applicationComboBox;
    private javax.swing.JTextField argumetTextField;
    private javax.swing.JComboBox commandComboBox;
    private javax.swing.JLabel commandsLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
