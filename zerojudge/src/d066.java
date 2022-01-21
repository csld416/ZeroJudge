
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chris
 */
public class d066 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] w = s.split("\\s+");
            int a = Integer.parseInt(w[0]) * 60;
            int b = (Integer.parseInt(w[1]) + 60) % 60;
            int c = a+b;
            if(c >= 450 && c < 1020){
                System.out.println("At School");
            }else{
                System.out.println("Off School");
            }
        }
    }
    
}
