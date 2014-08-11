package nao.cycledev.ocpjavase7.c4.genericsandcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static boolean isStringPalindrome(String str){
        List<Character> chars = new LinkedList<>();
        for (Character item : str.toCharArray()){
            chars.add(item);
        }

        ListIterator<Character> str1 = chars.listIterator();
        ListIterator<Character> str2 = chars.listIterator(chars.size());
        while(str1.hasNext() && str2.hasPrevious()){
            if(str1.next() != str2.previous()){
                return false;
            }
        }
        return true;
    }
}
