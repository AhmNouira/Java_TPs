import java.awt.*;
import java.awt.event.*;

/** version static of Caculator exercice
 * Caculator
 */


public class Caculator  extends Frame {

    private Panel inputPanel = new Panel();
    private Panel keysPanel = new Panel();
    private Panel opsPanel = new Panel();
    private Panel validation = new Panel();

    Caculator() {

        this.setTitle("Caculator");
        this.setSize(300, 300);
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(212, 212, 212));


        // keys Btns 
        Button [][] keysBtns = new Button[][] {

            { new Button("7"), new Button("8"), new Button("9") },
            { new Button("6"), new Button("5"), new Button("4") },
            { new Button("3"), new Button("2"), new Button("1") },
            { new Button("0"), new Button("+/-"), new Button("ClearAll") } 

        };


        //declare opsBtn
        Button[][] opsBtns = new Button [][] {
                    { new Button("+") },
                    { new Button("-") },
                    { new Button("*") },
                    { new Button("/") },
        };

        // inputPanel
        inputPanel.setLayout(new BorderLayout());
        // "0" value by default 
        inputPanel.add(new TextField("0"), BorderLayout.NORTH);

        // set keysButtons 
        keysPanel.setLayout(new GridLayout(4, 3));
        for(int row = 0; row < 4; row ++ ) {
            for(int col = 0; col < 3; col ++) {
                keysBtns[row][col].setForeground(Color.BLUE); 

                // set ClearAll btn to rose Color
                if(keysBtns[row][col].getLabel().equals("ClearAll")) {
                    keysBtns[row][col].setForeground(new Color(255, 170, 170)); // light rose
                }

                keysPanel.add(keysBtns[row][col]);
             }

        }


        opsPanel.setLayout(new GridLayout(4,1)); 
        for(int row = 0; row < 4; row ++ ) {
            opsBtns[row][0].setForeground(Color.RED); 
            opsPanel.add(opsBtns[row][0]);
        }
        

        // validation button
        validation.setLayout(new BorderLayout());
        validation.setForeground(Color.GREEN);
        validation.add(new Button("Enter"), BorderLayout.SOUTH);



        // add all Panel to Layout
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(keysPanel, BorderLayout.CENTER);
        this.add(opsPanel, BorderLayout.EAST);
        this.add(validation, BorderLayout.SOUTH);

        this.setVisible(true);

    }

    public static void main(String[] args) {
       Caculator caculator = new Caculator();

        // close the window when clicking 'x'
        caculator.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
        });
   

    }
}