/* COM242 - SISTEMAS DISTRIBUIDOS 
   RMI - Exemplo de implementa��o. 
         Programa que utiliza fun��es remotas para realizar operacoes matem�ticas.
   14/04/2020
*/

import static java.lang.Math.sqrt;
import java.rmi.*;
import java.rmi.server.*;

// Classe no servidor que implementa os m�todos remotos
public class ServidorMat extends UnicastRemoteObject implements InterfaceServidorMat
{
    public ServidorMat() throws RemoteException
    {
        System.out.println("Novo Servidor instanciado...");
    }
	
    public String funcaoSegundoGrau(double a, double b, double c) throws RemoteException
    {
        double delta, x1, x2;
		
		System.out.println("Valores recebidos do cliente: a = " + a + " b = " + b + " c = "+ c);
		
                
		if (a != 0) {
            delta = (double) ((b*b)-(4*a*c));
         
               } 
            delta = (double) ((b*b)-(4*a*c));
            if (delta>0){
                
                x1 = (double) ((-b +Math.sqrt(delta))/(2*a));
                x2 = (double) ((-b -Math.sqrt(delta))/(2*a));
               return"\nx1 vale: "+ x1 + "\n x2 vale: "+ x2; //mostra o x1 e x2. 
				
            }
            else if (delta==0){
                x1 = (double) ((-b +sqrt(delta))/(2*a));
		return "\nEqua��o possui uma raiz real: \n X: "+x1;     
                 }
                else
                    return "N�o h� solu��es que possam ser expressas com o conjunto dos n�meros reais ";
                            }
    }
