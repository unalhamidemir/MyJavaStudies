using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TypesAndVariables
{
    class Program
    {
        static void Main(string[] args)
        {
            //Value Types
            //Console.WriteLine("Hello World");
            char character = 'A';
            string city = "Ankara";

            double number6 = 10.5;

            decimal number7 = 10.6m;

            bool condition = false;

            byte number4 = 0;
            byte number5 = 255;

            short number = -32768;
            short number3 = 32767;

            int number1 = 2147483647;
            long number2 = 2147483647;

            var number8 = 10;
            number8 = 'A';
            
            Console.WriteLine("Hangi gün :" +Days.Friday);
            Console.WriteLine("Sehir  : " +city);
            Console.WriteLine("Number : {0}", number);
            Console.WriteLine("Number 1 :{0}",number1);
            Console.WriteLine("Number 2 :{0}", number2);
            Console.WriteLine("Number 3 :{0}", number3);
            Console.WriteLine("Number 4 :{0}", number4);
            Console.WriteLine("Number 5 :{0}", number5);
            Console.WriteLine("Number 8 :{0} ", number8);
            Console.WriteLine("Character is : {0} ", (int)character);
            Console.ReadLine();
        }
    }
    enum Days
    {
        Monday,Saturday,Tuesday,Sunday,Wednesday,Thursday,Friday
    }
}
