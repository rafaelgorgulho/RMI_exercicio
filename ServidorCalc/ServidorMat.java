/* COM242 - SISTEMAS DISTRIBUIDOS 
   RMI - Exemplo de implementação. 
         Programa que utiliza funções remotas para realizar operacoes matemáticas.
   14/04/2020
*/

import static java.lang.Math.sqrt;
import java.rmi.*;
import java.rmi.server.*;

// Classe no servidor que implementa os métodos remotos
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
		return "\nEquação possui uma raiz real: \n X: "+x1;     
                 }
                else
                    return "Não há soluções que possam ser expressas com o conjunto dos números reais ";
                            }
    }
