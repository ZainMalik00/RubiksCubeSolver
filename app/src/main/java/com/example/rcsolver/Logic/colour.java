package com.example.rcsolver.Logic;

public class colour {
    private int val;

    public colour(String a){
        try{
            a=a.toLowerCase();
            switch(a){
                case "white":
                    val=0;
                    break;
               case "green":
                    val=1;
                    break;
                case "red":
                    val=2;
                    break;
              case "blue":
                    val=3;
                    break;
                case "orange":
                    val=4;
                    break;
               case "yellow":
                    val=5;
                    break;
                }
        }catch(Exception E){
            System.out.println("Invalid entry");
        }
    }

    public int getVal(){
        return this.val;
    }
}
