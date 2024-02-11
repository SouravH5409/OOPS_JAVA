/* Read a line of sentence("Model Engineering College") from a text 
box when clicking on the a "read'button and tokenize it with delimeter space.
write each token to the file in the following format
=========================
SL.No         Token
=========================
111           Model
112           Engineering 
113           College
*/
import java.util.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class UIX extends JFrame implements ActionListener{
        JFrame jfrm;
        JButton jb;
        JLabel jlab;
        JTextField text;

        UIX(){
            jfrm=new JFrame("Tokenize GUI");
            jfrm.setSize(500,700);
            jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jb=new JButton("Read");
            text=new JTextField();
            text.setBounds(150,130,190,30);
            jb.setBounds(150,170,80,30);
            jb.addActionListener(this);

            jfrm.add(text);
            jfrm.add(jb);
            jfrm.setLayout(null);
            jfrm.setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            String data=text.getText();
            jb.setEnabled(false);
            try{
                writetoFile(data);
            }catch(Exception ex){
                System.out.println("Error");
            }
    }
    public void writetoFile(String txt)throws IOException{
        String border,head;
        FileOutputStream f = new FileOutputStream("Sample.txt");
        int i=111;
        byte arr[];
        border="==========================\n";
        head="SL.NO                  "+"Tokens\n";
        arr=border.getBytes();
        f.write(arr);
        arr=head.getBytes();
        f.write(arr);
        arr=border.getBytes();
        f.write(arr);
        StringTokenizer st = new StringTokenizer(txt," ");
        while(st.hasMoreTokens()){
            String token =i+"                      "+st.nextToken()+"\n";
            arr=token.getBytes();
            f.write(arr);
            i++;
        }
        f.close(); 
        }
    }
    class SwitchingButton{
        public static void main(String args[]){
            new UIX();
        }
    }

