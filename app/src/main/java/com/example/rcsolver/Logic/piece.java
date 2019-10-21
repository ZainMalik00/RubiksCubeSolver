package com.example.rcsolver.Logic;

public class piece {
    //sides go in order from left side, right side, top side
    private colour[] sides;

    public piece(colour left, colour right, colour top){
        try{
            sides= new colour[3];
            sides[0]=left;
            sides[1]=right;
            sides[2]=top;
        }catch(Exception E){
            System.out.println("Invalid Entry");
        }
    }
    public piece(colour left, colour right){
        try{
            sides= new colour[2];
            sides[0]=left;
            sides[1]=right;
        }catch(Exception E){
        System.out.println("Invalid Entry");
    }
    }
    public piece(colour middle) {
        try{
            sides= new colour[1];
            sides[0] = middle;
        }catch(Exception E){
            System.out.println("Invalid Entry");
        }
    }

    public colour[] getSides(){
        return this.sides;
    }
}
