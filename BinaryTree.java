// BinaryTree.java
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Método recursivo para contar os nós
    public int contarNos(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + contarNos(node.left) + contarNos(node.right);
    }

    // Método para montar a árvore do enunciado
    public void construirArvore() {
        root = new Node("A");
        root.left = new Node("B");
        root.right = new Node("C");

        root.left.left = new Node("D");
        root.left.right = new Node("E");

        root.right.right = new Node("F");
    }
}
