package app;

import javax.swing.JOptionPane;

public class Exemplo_01 {
	public static void main(String[] args) {
		int [] teste1 = new int[10];
		int [] teste2 = new int[10];
		
		String num;
		
		for(int i = 0; i < teste1.length; i++) {
			num = JOptionPane.showInputDialog("Digite o valor " + i + ":");
			teste1[i] = Integer.parseInt(num);
		}
		
		for(int i = 0; i < teste1.length; i++) {
			if(i%2 == 0) 
				teste1[i] = teste1[i] * 5;
			else
				teste1[i] = teste1[i] + 5;
			}
		System.out.printf("%s\n" , "Resultado: ");
		}
	}


