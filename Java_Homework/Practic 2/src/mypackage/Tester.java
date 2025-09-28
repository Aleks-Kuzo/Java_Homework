package mypackage;

public class Tester {
    private Circle[] arr;
    private int size;


    public Tester(int i){
        arr = new Circle[i];
        size = 0;
    }

    public boolean addCircle(Circle circle){
        if (size < arr.length){
            arr[size] = circle;
            size++;
            return true;
        }
        return false;
    }

    public Circle[] getArr() {
        return arr;
    }

    public void setArr(Circle[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
