import javax.swing.*;
class ResultOfKnowledge 
{ 
 final static int RATE=100;
 public static void main(String[] args) 
 {
     System.out.println("Введіть кількість учнів які вчаться на оцінки 12,11,10,9,8,7,6,5,4,3,2,1,0");
     int[] mark = new int [13]; 
     mark[0]=0;
     for (int i=1; i<13; i++)
    {
         mark[i] = Integer.parseInt(JOptionPane.showInputDialog("Введіть кількість учнів,які вчаться на "+i));
    }
     System.out.println("Успішність учнів у %:");
     /* кількість учнів які вчаться 
     на оцінки 12,11,10,9,8,7,6,5,4,3,2,1*/
     int sumExpert = 0;// рахуємо суму масиву високого рівня
     for ( int  i=10; i<=12;i++)
     {
         sumExpert +=mark[i]; 
     }     
     int sumAdvanced=0; // рахуємо суму масиву достатнього рівня
     for ( int  i=7; i<=9;i++)
     {
         sumAdvanced += mark[i]; 
     }  
     int sumBasic=0; // рахуємо суму масиву середнього рівня
     for ( int  i=4; i<=6;i++)
     {
         sumBasic += mark[i]; 
     }
     int sumEntry = 0;// рахуємо суму масиву початкового рівня
     for ( int  i=1; i<=3;i++)
     {
         sumEntry += mark[i]; 
     }
     int generalSuma=sumExpert+sumAdvanced+sumBasic+sumEntry; 
     // рахуємо загальну кількість відсотків на всіх рівнях
     
     if (generalSuma!=0)
     {
         int rExpert=sumExpert*RATE/generalSuma;
         int rAdvanced=sumAdvanced*RATE/generalSuma;
         int rBasic=sumBasic*RATE/generalSuma;
         int rEntry=sumEntry*RATE/generalSuma;
         int sumaRate=rExpert+rAdvanced+rBasic+rEntry;
         if (sumaRate==RATE)
         {
             showResult(rExpert,rAdvanced,rBasic,rEntry);
             System.out.println("Готово");
         }
         else 
         {
             System.out.println("не 100");
             int rDifference=RATE-sumaRate;
             rAdvanced+=rDifference;
             showResult(rExpert,rAdvanced,rBasic,rEntry);
             System.out.print("Різниця: ");
             System.out.print(rDifference);
             System.out.println("% додана до достатнього рівня");
         }
     }
     else 
     {
         System.out.println("На нуль ділити не можна!");
     }
     
 }
 public static void showResult( int rExpert, int rAdvanced,int rBasic,int rEntry)
 {
     System.out.print("Високий рівень ");
     System.out.print(rExpert);
     System.out.println("%");
     System.out.print("Достатній рівень ");
     System.out.print(rAdvanced);
     System.out.println("%");
     System.out.print("Середній рівень ");
     System.out.print(rBasic);
     System.out.println("%");
     System.out.print("Низький рівень ");
     System.out.print(rEntry);
     System.out.println("%"); 
 }
} 