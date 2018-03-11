package com.example.nataneb.calculadora.Vector;

/**
 * Created by nataneb on 11/03/18.
 */

//////For save X and Y
public class Tuple<X,Y> {
    X x;
    Y y;
    public Tuple(X x,Y y){
        this.x = x;
        this.y = y;
    }
    public X getX(){
        return x;
    }

    public Y getY(){
        return y;
    }
    public void setY(Y y){
        this.y = y;
    }
    public void setX(X x){
        this.x = x;
    }
}
