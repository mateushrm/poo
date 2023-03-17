package avaliacao;

import java.util.Scanner;

public class quest02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas: ");
        int n = ler.nextInt();
		float vet[] = new float[n];
		double soma = 0, media = 0;
		for(int i = 0; i<n; i++) {
			System.out.printf("Informe a nota " + (i+1)+ ": ");
			vet[i] = ler.nextFloat();
			soma = soma + vet[i];
		}
			media = soma/n;
		for(int i = 0; i<n; i++) {
			if(vet[i]>media) {
				System.out.println(vet[i]);
			}
		}
		ler.close();
	}

}
