import java.util.ArrayList;
import java.util.Scanner;

public class ScalingRecipes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		scan.nextLine();
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Double> weights = new ArrayList<>();
		ArrayList<Double> percents = new ArrayList<>();
		

		for (int a = 0; a < cases; a++) {
			double numIngred = scan.nextDouble();
			double originalPortions = scan.nextDouble();
			double desiredPortions = scan.nextDouble();
			scan.nextLine();
			double scaleFactor = desiredPortions / originalPortions;
			double mainWeight = 0;
			// finding main ingred and adding eveything to lists
			for (int i = 0; i < numIngred; i++) {
				String str = scan.nextLine();
				String[] line = str.split(" ");
				if (Double.parseDouble(line[2]) == 100) {
					mainWeight = Double.parseDouble(line[1]);
				}
				names.add(line[0]);
				weights.add(Double.parseDouble(line[1]));
				percents.add(Double.parseDouble(line[2]));

			}

			double mainIngredScaled = mainWeight * scaleFactor;
			ArrayList<Double> scaledIngreds = new ArrayList<>();
			for (int i = 0; i < names.size(); i++) {
				if (percents.get(i) == 100) {
					scaledIngreds.add(mainIngredScaled);

				} else {
					double scaled = (percents.get(i) / 100) * mainIngredScaled;
					scaledIngreds.add(scaled);
				}

			}
			System.out.println("Recipe # " + (a+1) );
			for (int i = 0; i < names.size(); i++) {
				if (percents.get(i) == 100) {
					System.out.printf("%s %.1f", names.get(i), mainIngredScaled);
					System.out.println();
				} else {
					System.out.printf("%s %.1f", names.get(i), scaledIngreds.get(i));
					System.out.println();

				}
			}
			scaledIngreds.clear();
			names.clear();
			weights.clear();
			percents.clear();
			
			System.out.println("----------------------------------------");
		}

	}

}
