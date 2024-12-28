package poo;

public class Numero {

    private double x;

    private double getX() {
        return x;
    }

   private void setX(double x) {
        this.x = x;
    }

public double soma (double x, double y) {

    setX(x + y);
    return getX();
    
}
   
public double subtração (double x, double y) {

    setX(x - y);
    return getX();
    
}
public double multiplicação (double x, double y) {

    setX(x * y);
    return getX();
    
}
public double divisão (double x, double y) {

    setX(x / y);
    return getX();
    
}


}

    


