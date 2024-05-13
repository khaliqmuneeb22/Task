/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefomer;
public class ChefOmer extends Thread{
    public void run(){
        System.out.println("Omer started & waiting for the chicken & vegetable to throw");
        
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Omer finished cooking chicken & vegetable");
    }
    public static void main(String[] args) throws InterruptedException{
        System.out.println("javed started & requesting umer's help");
        Thread omer = new ChefOmer ();
        omer.setDaemon(true);
        omer.start();
        System.out.println(omer.getName());
        System.out.println(omer.getState());
        
        System.out.println("javed tells Omer to start");
       
        System.out.println("javed continue cooking biryani");
        Thread.sleep(500);
        System.out.println("javed patiently wait for Omer to finish and join");
        omer.join();
        System.out.println("javed and omer both are done");
    }
}