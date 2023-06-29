class BinarySearchTree {
    /*
     * Um nó em uma Árvore é formado pelo seu valor,
     * e referência para os seus descendentes
     * esquerdo e direito
     * [data]
     * / \
     * left right
     */
    class Node {
        Node left;
        Node right;
        int data;

        /*
         * No momento de criação, todos os nós
         * são folhas, isto é:
         * - Tem um parente
         * - Possum um valor
         * - As referências para os descendentes são nulas
         * ou seja, não tem descendentes
         */
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /*
     * Similarmente as Listas, uma Árvore também possui
     * uma referência para o elemento inicial assim como
     * atributos utilitários para a classe
     */
    int size;
    Node root;

    /*
     * No momento de criação, a nossa Árvore Binária de Pesquisa
     * contém zero elementos e a referência para a raíz é nula
     */
    public BinarySearchTree() {
        this.size = 0;
        this.root = null;
    }

    /*
     * Usaremos o método add para acomodar o caso de inserção do primeiro elemento
     * assim como dos seguintes. Como vimos nas restantes Estruturas de Dados, o
     * primeiro elemento é sempre o nosso marcador. Isto é, se a referência para a
     * raíz
     * estiver nula (árvore vazia), então o nó a inserir deve ser associado à raíz.
     * Caso contrário, implementamos a lógica de inserção
     */
    public void add(int data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            addNode(this.root, data);
        }
    }

    /*
     * Como podemos comprovar fazendo a inserção manualmente,
     * qualquer nó é inserido como um descendente de um nó parente.
     * Algoritmo:
     * 1. Se o valor do nó for menor que o valor do parente então
     * o nó deve ser inserido na sub-árvore esquerda do parente.
     * a. Se a referência para a sub-árvore esquerda do nó parente
     * for nula, então o nó é inserido passando a ser a sub-árvore esquerda
     * b. Se a referência para a sub-árvore esquerda do nó parente
     * não for nula, então tentamos fazer a inserção considerando este nó como o
     * parente.
     * 2. Se o valor do nó for maior que o valor do parente então
     * o nó deve ser inserido na sub-árvore direita do parente.
     * a. Se a referência para a sub-árvore direita do nó parente
     * for nula, então o nó é inserido passa a ser a sub-árvore direita
     * b. Se a referência para a sub-árvore direita do nó parente
     * não for nula, então tentamos fazer a inserção considerando este nó como o
     * parente.
     * 3. Se o valor por inserir não for menor nem maior que o do nó parente,
     * logicamente,
     * só pode ser igual. Neste caso, não inserimos porque:
     * a. O valor por inserir já existe na Estrutura de Dados (evitamos valores
     * duplicados)
     * b. Por ser uma Árvore Binária, cada nó so pode ter dois descendentes no
     * máximo.
     * O algoritmo usado determina casos de inserção à esquerda assim como à
     * direita.
     * Eliminando-se uma terceira alternativa
     */
    public void addNode(Node parent, int data) {
        if (data < parent.data) {
            if (parent.left == null) {
                parent.left = new Node(data);
            } else {
                addNode(parent.left, data);
            }
        } else if (data > parent.data) {
            if (parent.right == null) {
                parent.right = new Node(data);
            } else {
                addNode(parent.right, data);
            }
        } else {
            System.out.println("Item existente");
        }
    }

    // Listar Esquerda, Raiz/Parente, Direita
    public void listInOrder(Node parent) {
        if (parent != null) {
            listInOrder(parent.left);
            System.out.print(parent.data + " ");
            listInOrder(parent.right);
        }
    }

    /*
     * Alternativamente à implementação para listInOrder,
     * podemos criar o código representando cada passo assumindo
     * uma resolução manual do percurso (com papel e caneta)
     * - Sempre mostramos o valor do nó se este for parente/raíz
     * - Se o nó não for parente/raíz (descendente esquerdo ou direito):
     * 1. Mostramos o seu valor se for uma folha (descendentes esquerdo
     * e direito deste nó são nulos)
     * 2. Se não for uma folha, aplicamos o mesmo percurso (algoritmo/método)
     * considerando este nó como ponto de partida (parente)
     */
    // Listar Raiz/Parente, Esquerda, Direita
    public void listPreOrder(Node parent) {
        // Raiz
        System.out.print(parent.data + " ");

        // Esquerda
        if ((parent.left).left == null && (parent.left).right == null) {
            System.out.print(parent.left.data + " ");
        } else {
            listPreOrder(parent.left);
        }

        // Direita
        if ((parent.right).left == null && (parent.right).right == null) {
            System.out.print(parent.right.data + " ");
        } else {
            listPreOrder(parent.right);
        }
    }

    // Listar Esquerda, Direita, Raiz/Parente
    public void listPostOrder(Node parent) {
        if (parent != null) {
            listPostOrder(parent.left);
            listPostOrder(parent.right);
            System.out.print(parent.data + " ");
        }
    }

    // Método principal para pesquisar por um elemento
    public void search(int value) {
        if (this.root == null) {
            System.out.println("Arvore vazia");
        } else {
            searchNode(this.root, value);
        }
    }

    /*
     * Pesquisa por um elemento recursivamente
     * 
     * Pesquisamos por um elemento determinando se este,
     * possivelmente, está na sub-árvore esquerda ou direita
     * de um nó parente (inicialmente a raíz).
     * 
     */
    public void searchNode(Node parent, int value) {
        // Para fazermos a verificação o nó parente deve ser não nulo
        if (parent != null) {
            // Se o valor pesquisado for menor do que o valor do parente
            if (value < parent.data) {
                // Pesquisamos pelo valor na sub-árvore esquerda do nó parente
                searchNode(parent.left, value);
            }
            // Se o valor pesquisado for maior do que o valor do parente
            else if (value > parent.data) {
                // Pesquisamos pelo valor na sub-árvore direita do nó parente
                searchNode(parent.right, value);
            }
            /*
             * Se o valor pesquisado não é menor e não é maior então,
             * logicamente, só pode ser igual.
             */
            else {
                System.out.println("Elemento " + value + " encontrado");
            }
        }
        /*
         * Se o nó parente for nulo, significa que esgotamos os nós da Árvore
         * onde possivelmente poderiamos encontrar o valor pesquisado
         */
        else {
            System.out.println("Elemento " + value + " nao encontrado");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();

        BST.add(50);
        BST.add(9);
        BST.add(55);
        BST.add(-1);
        BST.add(30);

        System.out.print("Listagem em Pre-Ordem: ");
        BST.listInOrder(BST.root);
        System.out.println();
        System.out.print("Listagem em Ordem    : ");
        BST.listPreOrder(BST.root);
        System.out.println();
        System.out.print("Listagem em Pos-Ordem: ");
        BST.listPostOrder(BST.root);
        System.out.println("");

        BST.search(30);
        BST.search(1);
    }
}