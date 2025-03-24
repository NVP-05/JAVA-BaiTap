package entity;

public class LimitSort{
    private int low;
    private int high;

    public LimitSort(int low, int high){
        this.low = low;
        this.high = high;
    }

    public int getLow(){
        return low;
    }

    public int getHigh(){
        return high;
    }
}
