package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 0;

		for (int i = 0; i < sayilar.length; i++)
			if (sayilar[i] == aranacak) {
				System.out.println("Aradığınız sayı listede vardır");
				return;
			}
		System.out.println("Aradığınız sayı listede yoktur");

	}

}
