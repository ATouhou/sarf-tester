import java.util.ArrayList;

import javax.swing.JTextArea;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SarfGUI.java
 *
 * Created on Jan 4, 2010, 8:19:12 PM
 */



/**
 *
 * @author User
 */
public class SarfGUI extends javax.swing.JFrame {

    /** Creates new form SarfGUI */
    public SarfGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBox = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        quizTypes = new javax.swing.JScrollPane();
        quizzes = new javax.swing.JList();
        selectQuiz = new javax.swing.JLabel();
        difficultyMeter = new javax.swing.JSlider();
        setDifficulty = new javax.swing.JLabel();
        selectNumQuestions = new javax.swing.JSpinner();
        numberOfQuestions = new javax.swing.JLabel();
        easyLabel = new javax.swing.JLabel();
        hardLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sarf Quiz");
        
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        textBox.setViewportView(jTextArea1);
        
        startButton.setText("Start");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                startButtonMouseReleased(evt);
            }
        });
        
        
//        startButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                startButtonActionPerformed(evt);
//            }
//        });

        quizzes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Details to Conjugation", "Conjugations to Details", "Maadi to Mudaari", "Mudaari to Maadi", "Verb to Definition", "Definition to Verb", "Random" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        quizzes.setSelectedIndex(0);
        
        quizTypes.setViewportView(quizzes);

        selectQuiz.setText("Select Quiz");

        difficultyMeter.setMajorTickSpacing(1);
        difficultyMeter.setMaximum(21);
        difficultyMeter.setMinimum(1);
        difficultyMeter.setPaintTicks(true);
        difficultyMeter.setSnapToTicks(true);
        difficultyMeter.setValue(10);

        setDifficulty.setText("Select Difficulty");

        selectNumQuestions.setAutoscrolls(true);
        selectNumQuestions.setValue(1);

        numberOfQuestions.setText("Number of Questions");

        easyLabel.setText("Easy");

        hardLabel.setText("Hard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(difficultyMeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(hardLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(setDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(easyLabel)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(numberOfQuestions)
                            .addComponent(selectNumQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textBox, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(startButton)
                    .addComponent(quizTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selectQuiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quizTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(startButton)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numberOfQuestions)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(setDifficulty)
                                .addComponent(easyLabel)
                                .addComponent(hardLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(difficultyMeter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectNumQuestions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
    private void startButtonMouseReleased(java.awt.event.MouseEvent evt) {
    
        Integer numQuestions = ((Integer)(selectNumQuestions.getModel().getValue()));
//        System.out.println("Number of Questions: " + numQuestions);
        int difficulty = (difficultyMeter.getValue());
        int quizNum = quizzes.getSelectedIndex();
//       System.out.println("quiz");
//        this.jTextArea1.append("Quiz Area");
//        jTextArea1.repaint();
//        repaint();
//        System.out.println("Difficulty Level: " + difficulty);
//      jTextArea1.setText("Testing");
//      printToGUIln("test");
//        jTextArea1 = jTextArea1;
//        jTextArea1.repaint();
//        jTextArea1.append("ماضي");
//        jTextArea1.repaint();
//        System.out.println("before ");
//        printToGUIln("test");
//        System.out.Println("Diffculty Level: " + difficulty);
        
    	{
    		// TODO Auto-generated method stub
//    		System.out.println("فَعَلَ");
//    		String test = "ف";
//    		test += "َ";
//    		System.out.println(test);
    		String fileName = "verb_List_Formatted_txt.txt";
//    		Parser parser = new Parser(fileName);
    		ArrayList<Table> tables = new ArrayList<Table>();
    		Table maadi = new Maadi();
    		Table mudaari = new Mudaari();
    		tables.add(maadi);
    		tables.add(mudaari);
    		Quiz quiz = new Quiz(fileName, tables, difficulty, jTextArea1, this);
//    		System.out.println("quiz made");
    		
    		for (int i = 0; i < numQuestions; i++) 
    		{
    			//		quiz.maadiToMudaari();
    			//		quiz.detailsTester();
//    			quiz.randomQuiz();
//    			Wait.manySec(3);
//    			System.out.println();
//    		}
    			quiz.selectQuiz(quizNum);
    			System.out.println();
    			if(i+1 != numQuestions)
    				Wait.manySec(3);
    		}
    	}
    }//GEN-LAST:event_startButtonActionPerformed

//    private void startButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseReleased
//        // TODO add your handling code here:
//        
//    }//GEN-LAST:event_startButtonMouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SarfGUI().setVisible(true);
            }
        });
    }
    
    public void printToGUIln(String newText)
    {
    	PrintToGUI print = new PrintToGUI(this.jTextArea1, newText);
    	Thread printThread = new Thread(print);
    	printThread.start();
//    	jTextArea1.append("\n" + newText);
    	this.repaint();
//        String text = jTextArea1.getText();
//        jTextArea1.setText(text + "Test");
//        jTextArea1.append("ماضي");
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider difficultyMeter;
    private javax.swing.JLabel easyLabel;
    private javax.swing.JLabel hardLabel;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel numberOfQuestions;
    private javax.swing.JScrollPane quizTypes;
    private javax.swing.JList quizzes;
    private javax.swing.JSpinner selectNumQuestions;
    private javax.swing.JLabel selectQuiz;
    private javax.swing.JLabel setDifficulty;
    private javax.swing.JButton startButton;
    private javax.swing.JScrollPane textBox;
    // End of variables declaration//GEN-END:variables
	public javax.swing.JTextArea getjTextArea1() {
		return jTextArea1;
	}


}

class PrintToGUI implements Runnable
{
	JTextArea textBox;
	String newLine;
	
	public PrintToGUI(JTextArea textArea, String newText)
	{
		textBox = textArea;
		newLine = newText;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("-----------");
    	textBox.append("\n" + newLine);
    	textBox.repaint();
	}
	
}


