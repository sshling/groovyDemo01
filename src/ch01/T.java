package ch01;


import java.util.ArrayList;
import java.util.Collection;

public class T {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<String>();
        col.add("tom");
        col.add("jack");
        col.remove(0);
        System.out.println(col.size());
    }
}
