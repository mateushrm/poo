/*Elabore um programa que leia 10 salários. Após toda a entrada ter sido realizada,
reajuste todos os salários em 10%. Em seguida, exiba todos os salários já
reajustados. Utilize vetor para armazenar os salários.*/

package avaliacao;

import java.util.Scanner;

public class quest01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float vet[] = new float[10];
		for(int i = 0; i<10; i++) {
			System.out.printf("Informe o valor do salário " + (i+1)+ ": ");
			vet[i] = ler.nextFloat();
		}
		for(int i = 0; i<10; i++) {
			vet[i] = vet[i] * 1.10f;
		}
		for(int i = 0; i<10; i++) {
			System.out.println("Salário " + (i+1) + ": " + vet[i]);
		}
		ler.close();
	}
	
}
