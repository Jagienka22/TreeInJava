package tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aga on 12.04.18.
 */
public class Tree {
    int value;
    List<Tree> children = new ArrayList<>();


    public Tree(int i) {
        value = i;
    }

    public Tree(int i, Tree tree) {
        value = i;
        children.add(tree);
    }


    public Tree(int i, Tree left, Tree right) {
        value = i;
        children.add(left);
        children.add(right);
    }

    public Tree(int i, List<Tree> lista) {
        value = i;
        children = lista;
    }


    public int sum() {
        int suma = value;
        for(int j = 0; j < children.size(); j++ ){
            suma += children.get(j).sum();
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }

    public double average() {
        if (numberOfElements() != 0)
            return ((double) sum()) / numberOfElements();
        else
            return 0;
    }

    public int numberOfElements() {
        int number = 1;
        for(int j = 0; j < children.size(); j++ ){
            number += children.get(j).numberOfElements();
        }
        return number;
    }


    public List<Integer> allValues() {
        List<Integer> list = new ArrayList<>();
        list.add(value);
        for(int j = 0; j < children.size(); j++ ){
            list.addAll(children.get(j).allValues());
        }
        return list;
    }


    public double median() {
        double mediana = 0;
        double srednia = 0;
        List<Integer> list = allValues();
        Collections.sort(list);

        if (list.size() % 2 == 0) {
            srednia = list.get(list.size() / 2) + list.get((list.size() / 2) - 1);
            mediana = srednia / 2.0;
        } else {
            mediana = list.get(list.size() / 2);
        }

        return mediana;
    }

}
