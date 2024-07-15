package org.infyni.abstraction;
class CalculatePrice{
    public void calculateTotalPrice(int qnty){
        if(!isQuantityZero(qnty)){
            System.out.println(qnty*100);
        }
    }

    private boolean isQuantityZero(int qnty){
        if (qnty >=1){
            return false;
        }
        return true;
    }
}
public class _01 {
    public static void main(String[] args) {
        CalculatePrice calculatePrice = new CalculatePrice();
        int qnty = 0;
        calculatePrice.calculateTotalPrice(qnty);
    }
}
