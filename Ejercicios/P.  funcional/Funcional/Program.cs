/*
 * Created by SharpDevelop.
 * User: Edward Emanuel
 * Date: 12/02/2020
 * Time: 03:28 p. m.
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Funcional
{
	class Program
	{
		public static void Main(string[] args)
		{
			int a = 5;
            int b = 10;
                         
            int suma = f_sumador (a,b); //llamada funcion
                         
            Console.WriteLine ("(Funcion) La suma es "+suma);
 
            m_sumador (a,b); //Llamada metodo
 
            Console.ReadLine ();
 
        }
 
        //Declaracion Funcion
        public static int f_sumador(int a, int b){
 
            int suma = a + b;
 
            return suma;
 
        }
 
        //Declaracion Metodo
        public static void m_sumador(int a, int b){
 
            Console.WriteLine ( "(Metodo) La suma es "+ (a+b) );
		}
	}
}