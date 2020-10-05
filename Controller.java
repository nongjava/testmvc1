package testmvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
 
	private View theView;
	private Model theModel;
	
	public Controller(View theView, Model theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalculateListener(new CalculateListener());
		this.theView.addListener(new Listener());
}
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int studentid, password = 0;
			studentid = theView.getstudentID();
			password = theView.getpassword();
			theModel.check(studentid, password);
			theView.setCalcSolution(theModel.getanswer());
			
    }
  }
	class Listener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int studentid;
			studentid = theView.getstudentID();
			
			theModel.checkid(studentid);
			theView.Solution2(theModel.getcheckid());
			
    }
  }
	class Listener2 implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
              theModel.count();
			theView.Solution3(theModel.checkcount());
			
    }
  }
}