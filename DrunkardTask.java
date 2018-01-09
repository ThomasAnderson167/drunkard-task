class DrunkardTask {
	private final static String conditions[] = {"P O L I C E", "1st Pub", "2nd Pub", "3rd Pub", "4th Pub", "W I F E"};

	public static void main(String args[]) {
		launchChain((int)(1 + Math.random() * 4));
	}

	private static void launchChain(int initialCondition) {
		int numberOfSteps = 0;
		int currentCondition = initialCondition;

		showInfo();

		System.out.print("Start from: " + conditions[initialCondition]);

		//Stops when drunkard got to police or to wife
		while(currentCondition != 0 && currentCondition != 5) {
			int probability = (int)(Math.random() * 6);

			if(probability >= 0 && probability < 3)
				currentCondition--;

			else if(probability >= 3 && probability < 5)
				currentCondition++;

			System.out.print(" -> " + conditions[currentCondition]);

			numberOfSteps++;
		}

		showResult(initialCondition, currentCondition, numberOfSteps);
	}

	private static void showInfo() {
		System.out.println("\t\t\t\t\t\tMarkov Chain \n\t\t\t\t\t The Task Of The Drunkard");

		System.out.println("Available conditions:");
		for(int i = 0; i < conditions.length; i++)
			System.out.println((i + 1) + " - " + conditions[i]);

		System.out.println();
	}

	private static void showResult(int initialCondition, int finalCondition, int numberOfSteps) {
		System.out.println("\nDrunkard got out from " + conditions[initialCondition] + " to " +
						conditions[finalCondition] + " in " + numberOfSteps + " steps.");
	}
}	