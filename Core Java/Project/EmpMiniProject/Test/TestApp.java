package Test;

import Controller.employeeController;
import View.employeeView;

public class TestApp {

	public static void main(String args[])
	{
		employeeController ec=new employeeController();
		employeeView view = new employeeView(ec);
		view.showOptions();
	}
}
