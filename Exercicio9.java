import java.util.Objects;

public class Exercicio9 {

    private Node tree;

    public Exercicio9( Node node) {
        Objects.requireNonNull(node, "Erro: Árvore nula.");
        this.tree = node;
    }


    public Integer calculate(Node tree) {
        int controle = 0;

        if (tree != null) {
            controle = tree.getValue() + calculate(tree.getRight()) + calculate(tree.getLeft());
        }
        return controle;
    }

}

class Node {

    private Integer value;
    private Node right;
    private Node left;

    public Integer getValue() {
        return value;
    } 

    public void setValue(Integer value){
        this.value = value;
    }


    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

}