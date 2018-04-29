package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aga on 12.04.18.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Tree(3));

        Tree tree = new Tree(5, new Tree(3, new Tree(2), new Tree(5)), new Tree(7, new Tree(1), new Tree(0, new Tree(2), new Tree(8, new Tree(5)))));
        System.out.println(tree.allValues() + "Duze drzewo");
        System.out.println(tree.numberOfElements() + "tu");
        System.out.println(tree.sum());

        System.out.println(tree.children.get(1).children.get(1).sum());
        System.out.println(new Tree(0).sum());
        System.out.println(new Tree(2).sum());
        System.out.println(new Tree(2, new Tree(5, new Tree(6))));
        System.out.println(new Tree(2, new Tree(5)).allValues() + "lista");
        System.out.println(new Tree(2, new Tree(5)).sum());
        System.out.println(new Tree(2, new Tree(5), new Tree(7)).sum());
        System.out.println(new Tree(9, new Tree(5), new Tree(7)).allValues());

        List<Tree> lista = new ArrayList<>();
        lista.add(new Tree(3));
        lista.add(new Tree(6));
        lista.add(new Tree(5));

        Tree tree3 = new Tree(1, lista);
        System.out.println(tree3);



    }
}
