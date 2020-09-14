package JavaStartZadania;

public class GenericPair_49 <T,V>{
    private T t;
    private V v;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public GenericPair_49(T t, V v) {
        this.t = t;
        this.v = v;
    }

    private T[] arrayT;

    public T[] getArray() {
        return arrayT;
    }

    public void setArray(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public T getT(int index) {
        return arrayT[index];
    }
private V[] arrayV;

    public V[] getArrayV(){
        return arrayV;
    }

    public void setArrayV(V[] arrayV){
        this.arrayV = arrayV;
    }
    public V getV(int index){
        return arrayV[index];
    }
    public void printObjectsT() {
        for (T o : arrayT) {
            System.out.println(o);
        }
    }
    public void printObjectsV() {
        for (V o : arrayV) {
            System.out.println(o);
        }
    }
}
