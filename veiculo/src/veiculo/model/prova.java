package veiculo.model;

public class prova {

	public static void main(String[] args) {
		int[] myList = {15, 21, 17, 18 };

		int max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}

		System.out.println("Maximo elemento é " + max);

	}

}
