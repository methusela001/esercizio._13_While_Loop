//While Loop

package org.example;
/*
Write a while loop for our trading bot!

  The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
  It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
  It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
  On days where it sells, it can only sell 1000 pounds for euros.
  Write a while loop
  Use the calculation for exchange rate below
  1 + (Math.random() * 0.2);
  To recalculate our rate every day (once per loop)
  Print the number of days it takes for our bot to sell its poun
 */

public class Main {
    public static void main(String[] args){

        int moneyInMyPocket= 10000;
        int daysCount=0;

             while (moneyInMyPocket>0) {
                 double exchangeRate= 1+(Math.random()*0.2);
                 if (exchangeRate>1.15){

                        moneyInMyPocket= moneyInMyPocket-1000;
                        System.out.println("Oggi è stata una buona giornata! La percentuale di rivendita è dell' "+ exchangeRate + ", mi rimangono ancora "+ (moneyInMyPocket));
                    }

                 else {
                        System.out.println("Il tasso era basso perciò non ho venduto");
                        System.out.println("Sono passati " + daysCount + " giorni, sono salvo!");}

                    daysCount +=1;

             }

                System.out.println(daysCount + " giorni son passati e ora sto meglio!");
       }

}
