package tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aga on 12.04.18.
 */
public class Tree {
    int value;
    Tree left;
    Tree right;


    public Tree(int i) {
        value = i;
    }

    public Tree(int i, Tree tree) {
        value = i;
        left = tree;
    }

    public Tree(int i, Tree left, Tree right) {
        value = i;
        this.left = left;
        this.right = right;
    }


    public int sum(){
        int suma = value;
        if( left != null){
            suma = suma + left.sum();
        }
        if(right != null )
            suma = suma + right.sum();
        return suma;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public double average() {
        if(numberOfElements() != 0)
           return ((double)sum())/numberOfElements();
        else
            return 0;
    }

    public int numberOfElements(){
        int number = 1;
        if(left!= null){
            number = number + left.numberOfElements();
        }
        if(right != null){
            number = number + right.numberOfElements();
        }
        return number;
    }


    public List<Integer> allValues(){
        List<Integer> list = new ArrayList<>();
        list.add(value);
        if(left != null){
            list.addAll(left.allValues());
        }
        if(right != null){
           list.addAll(right.allValues());
        }

        return list;
    }


    public double median() {
        double mediana = 0;
        double srednia = 0;
        List<Integer> list = allValues();
        Collections.sort(list);

        if(list.size() % 2 == 0){
            srednia = list.get(list.size()/2) + list.get((list.size()/2)-1);
            mediana = srednia/2.0;
        } else{
            mediana = list.get(list.size()/2);
        }

        return mediana;
    }

}
