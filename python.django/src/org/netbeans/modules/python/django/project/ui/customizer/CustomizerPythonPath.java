/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package org.netbeans.modules.python.django.project.ui.customizer;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.netbeans.modules.python.api.PythonPlatform;
import org.netbeans.modules.python.api.PythonPlatformManager;
import org.netbeans.modules.python.core.ui.models.PathListModel;

import org.netbeans.modules.python.project.ui.Utils;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.Repository;
import org.openide.loaders.DataObject;
import org.openide.loaders.InstanceDataObject;
import org.openide.util.Exceptions;
import org.openide.util.actions.CallableSystemAction;

/**
 *
 * @author Vasant
 */
public class CustomizerPythonPath extends javax.swing.JPanel {
    private final DjangoProjectProperties uiProperties;
    /** Creates new form CustomizerPythonPath */
    public CustomizerPythonPath(DjangoProjectProperties properties) {
        this.uiProperties = properties;
        initComponents();
        pythonPathModel.setModel(uiProperties.getPythonPath());
        this.platforms.setRenderer(Utils.createPlatformRenderer());
        this.platforms.setModel(Utils.createPlatformModel());
        final PythonPlatformManager manager = PythonPlatformManager.getInstance();
        String pid = uiProperties.getActivePlatformId();
        if (pid == null) {
            pid = manager.getDefaultPlatform();
        }
        final PythonPlatform activePlatform = manager.getPlatform(pid);
        if (activePlatform != null) {
            platforms.setSelectedItem(activePlatform);
        }
    }

    CustomizerPythonPath() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        pythonPath = new javax.swing.JList();
        addPythonPath = new javax.swing.JButton();
        removePythonPath = new javax.swing.JButton();
        moveUpPythonPath = new javax.swing.JButton();
        moveDownPythonPath = new javax.swing.JButton();
        manage = new javax.swing.JButton();
        platforms = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        pythonPath.setModel(pythonPathModel);
        pythonPath.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(pythonPath);

        addPythonPath.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.addPythonPath.text_1")); // NOI18N
        addPythonPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPythonPathActionPerformed(evt);
            }
        });

        removePythonPath.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.removePythonPath.text_1")); // NOI18N
        removePythonPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePythonPathActionPerformed(evt);
            }
        });

        moveUpPythonPath.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.moveUpPythonPath.text_1")); // NOI18N
        moveUpPythonPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveUpPythonPathActionPerformed(evt);
            }
        });

        moveDownPythonPath.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.moveDownPythonPath.text_1")); // NOI18N
        moveDownPythonPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDownPythonPathActionPerformed(evt);
            }
        });

        manage.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.manage.text")); // NOI18N
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });

        platforms.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        platforms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platformsActionPerformed(evt);
            }
        });

        jLabel1.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(CustomizerPythonPath.class, "CustomizerPythonPath.jLabel2.text")); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(platforms, 0, 259, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(manage)
                        .add(30, 30, 30))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(moveDownPythonPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, Short.MAX_VALUE)
                            .add(moveUpPythonPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, Short.MAX_VALUE)
                            .add(removePythonPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, Short.MAX_VALUE)
                            .add(addPythonPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, Short.MAX_VALUE)))
                    .add(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(platforms, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel1))
                    .add(manage))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(addPythonPath)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(removePythonPath)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(moveUpPythonPath)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(moveDownPythonPath))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .add(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPythonPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPythonPathActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileHidingEnabled(false);
        fc.setDialogTitle("Select Python Egg or Python Lib Directory");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            String cmd = fc.getSelectedFile().getAbsolutePath();
            pythonPathModel.add( cmd);
        }
}//GEN-LAST:event_addPythonPathActionPerformed

    private void removePythonPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePythonPathActionPerformed
        pythonPathModel.remove(pythonPath.getSelectedIndex());
}//GEN-LAST:event_removePythonPathActionPerformed

    private void moveUpPythonPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpPythonPathActionPerformed
        pythonPathModel.moveUp(pythonPath.getSelectedIndex());
}//GEN-LAST:event_moveUpPythonPathActionPerformed

    private void moveDownPythonPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownPythonPathActionPerformed
        pythonPathModel.moveDown(pythonPath.getSelectedIndex());
}//GEN-LAST:event_moveDownPythonPathActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
        //Workaround, Needs an API to display platform customizer
        final FileObject fo = Repository.getDefault().getDefaultFileSystem().findResource("Actions/Python/net-java-dev-nbpython-platform-PythonManagerAction.instance");  //NOI18N
        if (fo != null) {
            try {
                InstanceDataObject ido = (InstanceDataObject) DataObject.find(fo);
                CallableSystemAction action = (CallableSystemAction) ido.instanceCreate();
                action.performAction();
                platforms.setModel(Utils.createPlatformModel()); //Currentl the PythonManager doesn't fire events, we need to replace model.
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            } catch (ClassNotFoundException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
}//GEN-LAST:event_manageActionPerformed

    private void platformsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platformsActionPerformed
        uiProperties.setActivePlatformId(
                        ((PythonPlatform)platforms.getSelectedItem()).getName());
    }//GEN-LAST:event_platformsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPythonPath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton manage;
    private javax.swing.JButton moveDownPythonPath;
    private javax.swing.JButton moveUpPythonPath;
    private javax.swing.JComboBox platforms;
    private javax.swing.JList pythonPath;
    private javax.swing.JButton removePythonPath;
    // End of variables declaration//GEN-END:variables
    private PathListModel pythonPathModel = new PathListModel();
}
