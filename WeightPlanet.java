import javax.swing.JOptionPane;

public class WeightPlanet {

	public static void main(String[] args) {


		int pluto = 15;
		double moon = 6.0;
		double mars = 2;

		int weight = Integer.parseInt( (String)
				JOptionPane.showInputDialog(null,
		        "Please input your weight here:",
		        null, JOptionPane.INFORMATION_MESSAGE,
		        null,
		        null,
		        "[Don't be afraid]"));
//calc planets
		double wpluto = weight / pluto;
		double wmoon = weight / moon;
		double wmars = weight / mars;

//print kgs
	  JOptionPane.showMessageDialog(null, "Your weight in pluto is " + wpluto+"kg");
	  JOptionPane.showMessageDialog(null, "Your weight in moon is " + wmoon+"kg");
	  JOptionPane.showMessageDialog(null, "Your weight in mars is " + wmars+"kg");

//Last black humor message

	  JOptionPane.showMessageDialog(null, "Chill, you aren't fat YOU ARE IN WRONG PLANET!");




	}

}
