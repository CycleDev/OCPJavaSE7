package nao.cycledev.ocpjavase7.c4.genericsandcollection;

public class GenericType<T> {

    private T type;

    public GenericType(T arg){
        type = arg;
    }

    public String toString(){
        return "[" + type + "]";
    }
}
