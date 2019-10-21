package com.example.rcsolver.Logic;

public class cube {
    private piece[][] elems;
    private int dimen;

    public cube(int size){
        dimen=size;
        createCube();
    }
    public cube(){
        dimen=3;
        createCube();
    }

    public void createCube(){
        elems=new piece[this.dimen][this.dimen];
        for(int i =0, j=0;i<this.dimen;i++){
            for(j=0;j<this.dimen;j++){
                System.out.println(i+" "+j+"\n");
            }
        }
    }
}
