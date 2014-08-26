package nao.cycledev.ocpjavase7.c4.genericsandcollection;


import java.util.ArrayList;
import java.util.List;

public class GenericsAndCollection {

    public void GenericTypeTest(){

        GenericType<Integer> type1 = new GenericType<>(1000);
        System.out.println(type1);
        GenericType<String> type2 = new GenericType<>("Hello!!!");
        System.out.println(type2);
    }

    public void GenericMethod(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        UtilitiesTest.printList(list);
        UtilitiesTest.fill(list, 44);
        UtilitiesTest.printList(list);
    }

    public void ArrayListPrint(){
        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.printArrayList();
    }

    public void MapSpellWordsTest(){
        MapTest mapTest = new MapTest();
        mapTest.spellCheckers("My calendor is full of tri and finee too. Please correct all tri!");
    }

}
