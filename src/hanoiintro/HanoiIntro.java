/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hanoiintro;

/**
 *
 * @author glSon8840
 */
public class HanoiIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        String toPeg, fromPeg, tempPeg;

        fromPeg = "A";
        toPeg = "C";
        tempPeg = "B";
        //begin Towers of Hanoi with 4 disks
        n = 3;
        System.out.println("Towers of Hanoi problem");
        
        //Execute hanoi method to solve the problem
        hanoi(fromPeg, toPeg, tempPeg, n);
        System.out.println("There are " + n + " discs on peg " + fromPeg + " initially");
    }

    public static void hanoi(String fr,String to,String tp,int n){
        if (n == 1) {
            System.out.println("Move disc 1 from "+fr+" to "+to);
      } else {
            hanoi(fr, tp, to, n - 1);
            System.out.println("Move disc "+n+" from "+fr+" to "+to);
            hanoi(tp, to, fr, n - 1);
    }
    }
    
}
