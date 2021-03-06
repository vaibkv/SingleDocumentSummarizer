/*
 * TextSummarizerGUI.java
 *
 * Created on July 10, 2009, 11:21 PM
 */

package edu.research.textsummarization.gui;

/**
 *
 * @author  Administrator
 */
public class TextSummarizerGUI extends javax.swing.JFrame 
{
    
    /** Creates new form TextSummarizerGUI */
    public TextSummarizerGUI() 
	{
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() 
	{

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Text Summarizer");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Input File (Original Text)");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("Summarized Text");

        jButton1.setText("Summarize >>");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 216, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 212, Short.MAX_VALUE)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(100, 100, 100))
            .add(layout.createSequentialGroup()
                .add(246, 246, 246)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(42, 42, 42)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(138, 138, 138))))
            .add(layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jLabel1)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
	{
        java.awt.EventQueue.invokeLater(new Runnable()
		{
            public void run() 
			{
                new TextSummarizerGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    
}
