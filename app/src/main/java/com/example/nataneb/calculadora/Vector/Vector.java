package com.example.nataneb.calculadora.Vector;

/**
 * Created by nataneb on 10/03/18.
 */

public class Vector {
    float degree;
    float module;
    public Vector(float graus,float module){
        this.degree = degree;
        this.module = module;
    }
    public Tuple<Double,Double>getXY(){
        double x = Math.cos(Math.toRadians(degree)) * module;
        double y = Math.sin(Math.toRadians(degree)) * module;
        return new Tuple<Double, Double>(x,y);
    }
}
