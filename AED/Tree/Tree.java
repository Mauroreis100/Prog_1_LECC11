class Tree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    int tamanho;
    Node root;

    // 1. Definição da árvore
    public Tree() {
        this.root = null;
        this.tamanho = 0;
    }
    // 2.Contagem de elementos

    public int count() {
        return this.tamanho;
    }

    // 2. Inserção de um elemento - RED
    public void add(int data) {
        Node novaTree = new Node(data);
        //Se é o primeiro valor então a raíz fica com a nova árvore
        if (this.count() == 0) {
            this.root = novaTree;
            this.tamanho++;
        } else {
            
            Node currentTree = this.root;
            while (currentTree!=null) {
                if (currentTree.data > novaTree.data && currentTree.left!=null) {
                    currentTree = currentTree.left;
                } else if(currentTree.data > novaTree.data && currentTree.right!=null){
    //                 currentTree = currentTree.right;
    //             }
    //         }
    //         if (currentTree.data > data) {
    //             currentTree.left = novaTree;
    //             this.tamanho++;
    //         } else {
    //             currentTree.right = novaTree;
    //             this.tamanho++;
    //         }
    //     }
    // }

    //Listagem RED
    public void listAll() {
        Node currentTree = this.root;
        if (this.count() == 0) {
            System.out.println("Lista vazia");
        } else {
// System.out.println("Root"+currentTree.data+"\n Direita: "+currentTree.right.data+"\n Direita: "+currentTree.left.data);
            // System.out.println("Root: "+currentTree.data);
            // System.out.println("Direita: "+currentTree.left.data);
            // System.out.println("Direita: "+currentTree.right.data);
        }
    }
    public static void main(String[] args) {
        Tree tree=new Tree();
        System.out.println("Add(5)");
        tree.add(5);
        System.out.println("Add(3)");
        tree.add(3);
        System.out.println("Add(7)");
        tree.add(7);

        System.out.println("Count:"+tree.count());

        tree.listAll();
    }

}
/* class BinarySearch{

        Node left;
        Node right;
        int data;
    
    public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    Node root;
    int size;

    class BinarySearch(){
        this.size=0;
        this.root=null;
    }
 * 
 */