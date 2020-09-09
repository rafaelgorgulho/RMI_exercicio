/* COM242 - SISTEMAS DISTRIBUIDOS 
   RMI - Exemplo de implementa��o. 
         Programa que utiliza fun��es remotas para realizar operacoes matem�ticas.
   14/04/2020
*/

import java.rmi.*;

// Defini��o da interface que descreve os objetos remotos que poderao ser acessados pelo cliente
public interface InterfaceServidorMat extends Remote
{
    public String funcaoSegundoGrau(double a, double b, double c) throws RemoteException;
    
}