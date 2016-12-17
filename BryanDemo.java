public class BryanDemo {
	public static void main(String[] args) {
		Bryan bryZ = new Bryan();

		System.out.print("Basic information:");
		System.out.println(bryZ);

		System.out.println("Information of children: ");
		System.out.println(bryZ.getChildren() + "\n");

		System.out.println("Is " + bryZ.getName() + " loved?");
		System.out.println(bryZ.isLoved() + "\n");

		System.out.println("What is " + bryZ.getName() + "'s wizard level?");
		System.out.println(bryZ.getWizardLevel() + "\n");

		System.out.println("So, is " + bryZ.getName() + " a great wizard?");
		System.out.println(bryZ.isGreatWizard() + "\n");

		System.out.println("Let's see what happens when we believe...");
		System.out.println(bryZ.believe(new String("love")));
		System.out.println(bryZ.believe(new Integer(42)));
		System.out.println(bryZ.believe(new Double(3.14)));
		System.out.println(bryZ.believe(new Boolean(false)));

		System.out.println("\nAhh, interesting. No matter what it is...");
		System.out.println("If we believe it, it is true!");

		System.out.println("\nHappy birthday Dad, I love you!\n");

	}
}