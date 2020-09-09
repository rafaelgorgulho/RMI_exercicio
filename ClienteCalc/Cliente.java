/* COM242 - SISTEMAS DISTRIBUIDOS 
   RMI - Exemplo de implementa��o. 
         Programa que utiliza fun��es remotas para realizar operacoes matem�ticas.
   14/04/2020
*/

import java.rmi.*;
import java.util.Scanner;

public class Cliente
{
	public Cliente()
	{
		System.out.println("Executando Cliente... \n");
		try
		{   // Acessa o servidor de nomes para localiza��o das fun��es remotas
			msi = (InterfaceServidorMat) Naming.lookup("rmi://192.168.56.1/ServidorMat_1");
		}
		catch (Exception e)
		{
			System.out.println("Falhou a execucao do Cliente.\n"+e);				
			System.out.println("Certifique se a aplicacao no servidor esta em execucao.\n");				
			System.exit(0);
		}
	}
	
	public static void main (String[] argv)
	{
		Cliente cli = new Cliente();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Entre com valores de a b c separados por espaco:");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		System.out.println("");
		
		try
		{   // Cada chamada de uma fun��o remota � uma inst�ncia da classe Cliente
			System.out.println("Resultado Baskara(a b c): " + cli.resultado(a,b,c));
		}
		catch (Exception e)
		{
			System.out.println("Excep��o durante chamadas remotas:" +e);
		}
	}

	private InterfaceServidorMat msi; // A interface para o objecto remoto
	
	
	// Chamada as fun��es remotas para realiza��o das opera��es matem�ticas
	public String resultado(double a, double b, double c) throws RemoteException{
		 return msi.funcaoSegundoGrau(a,b,c);	
	}
}