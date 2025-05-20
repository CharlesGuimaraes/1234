// Main.java
public class Main {
    public static void main(String[] args) {
        BinaryTree arvore = new BinaryTree();
        arvore.construirArvore();

        int totalNos = arvore.contarNos(arvore.root);
        System.out.println("Total de nós na árvore: " + totalNos);
    }
}
