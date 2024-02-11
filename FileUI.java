import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
class UI extends JFrame implements ActionListener{
	JFrame jfrm;
	JButton IMPORT,CALCULATE;
	JLabel b1,b2,h,info,result;
	UI(){
		jfrm = new JFrame("File UI");
		IMPORT =new JButton("IMPORT");
		CALCULATE = new JButton("CALCULATE");
		info = new JLabel("");
		b1 = new JLabel("");
		b2 = new JLabel("");
		h = new JLabel("");
		result = new JLabel();
		b1.setBounds(100, 20, 500, 30);
        	h.setBounds(100, 55, 400, 30);
        	b2.setBounds(100, 90, 500, 30);
                info.setBounds(100, 125, 400, 30);
                result.setBounds(150, 180, 100, 30);
                IMPORT.setBounds(100, 300, 80, 30);
                CALCULATE.setBounds(200, 300, 150, 30);
		
		IMPORT.addActionListener(this);
		CALCULATE.addActionListener(this);
		jfrm.add(info);
		jfrm.add(h);
		jfrm.add(b1);
		jfrm.add(b2);
		jfrm.add(result);
        jfrm.add(IMPORT);
        jfrm.add(CALCULATE);
		jfrm.setLayout(null);
        jfrm.setSize(700,700);
		jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
}
public void actionPerformed(ActionEvent e) {
    JButton id = (JButton) e.getSource();
    String txtbtn = id.getText();
    if (txtbtn.equals("IMPORT")) {
        try (FileReader out = new FileReader("NewSample.txt");
            BufferedReader bf = new BufferedReader(out)) {
            b1.setText(bf.readLine());
            h.setText(bf.readLine());
            b2.setText(bf.readLine());
            info.setText(bf.readLine());
        } catch (IOException ex) {
            ex.printStackTrace(); // Print the stack trace for debugging
            JOptionPane.showMessageDialog(null, "Error Occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        String ftxt = info.getText();
        int sum = 0;
        String[] tokens = ftxt.split("\\s+");
        for (String token : tokens) {
        try {
            int number = Integer.parseInt(token);
            sum += number;
        } catch (NumberFormatException exx) {
            //
        }
        result.setText("Total Marks: "+(sum-111));
    }
    }
}
} 
class FileUI{
	public static void main(String args[])throws IOException{
		String border,name,head,text;
		int mark1,mark2,mark3;
        Scanner sc = new Scanner(System.in);
		File f = new File("NewSample.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter("NewSample.txt");
		border= "==========================================\n";
		head ="Roll no      Name         Mark1         Mark2         Mark3\n";
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the mark of three subject");
		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
        sc.close();
		text="111       "+name+"        "+mark1+"         "+mark2+"       "+mark3;
		fw.write(border);
		fw.write(head);
		fw.write(border);
		fw.write(text);
        fw.close();
		new UI();        
		
	}
}
