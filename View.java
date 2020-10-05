package testmvc;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{
	    private JLabel word1 = new JLabel("ID");
		private JTextField StudentID  = new JTextField(10);
		private JLabel word2 = new JLabel("Pass");
		private JTextField Password = new JTextField(10);
		private JButton Search = new JButton("Search");
		private JTextField Solution = new JTextField(20);
		private JButton CheckID = new JButton("CheckID");
		private JTextField SolutionID = new JTextField(20);
		private JButton Count = new JButton("Count");
		private JTextField Solutioncount = new JTextField(20);
		View(){
			
			// Sets up the view and adds the components
			
			JPanel Panel = new JPanel();
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(350, 200);
			
			Panel.add(word1);
			Panel.add(StudentID);
			Panel.add(word2);
			Panel.add(Password);
			Panel.add(Search);
			Panel.add(Solution);
			Panel.add(CheckID);
			Panel.add(SolutionID);
			Panel.add(Count);
			Panel.add(Solutioncount);
			this.add(Panel);
			
			// End of setting up the components --------
			
		}
		public int getstudentID(){
			return Integer.parseInt(StudentID.getText());
		}
		public int getpassword() {
			return Integer.parseInt(Password.getText());
		}
		public void setCalcSolution(String solution){
			
			Solution.setText((solution));
			
		}
		void addCalculateListener(ActionListener listenForCalcButton){
			
			Search.addActionListener(listenForCalcButton);
	    }
        void addListener(ActionListener listenForCalcButton){
			
			CheckID.addActionListener(listenForCalcButton);
	    }
         public void Solution2(String solution2){
			
			SolutionID.setText((solution2));
			
		}
        void addListener2(ActionListener listenForCalcButton){
	
	Count.addActionListener(listenForCalcButton);
   }
        public int getSolution3(){
    		
    		return Integer.parseInt(Solutioncount.getText());
    		
    	}
        public void Solution3(int count){
			
			Solutioncount.setText(Integer.toString(count));
		
			
		}
}
