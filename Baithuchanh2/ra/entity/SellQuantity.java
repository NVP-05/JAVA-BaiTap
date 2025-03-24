package entity;

public class SellQuantity{
    private int minQuantity;
    private int maxQuantity;

    public int getMinQuantity(){
        return minQuantity;
    }

    public int getMaxQuantity(){
        return maxQuantity;
    }

    public SellQuantity(int minQuantity, int maxQuantity){
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;


    }
}
