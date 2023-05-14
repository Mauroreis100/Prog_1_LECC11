import java.util.Vector;

class LinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node inicio;
    int tamanho;

    // 1. Criacao de uma Lista Vazia
    public LinkedList() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // Contagem de elementos
    public int count() {
        return this.tamanho;
    }

    // Verifica se está vazio
    public boolean isEmpty() {
        return this.count() == 0;
    }

    // 2. Listagem de todos elementos da lista
    public void listAll() {
        if (this.count() == 0) {
            System.out.println("Lista Vazia");
        } else {
            // System.out.println(this.inicio.data);
            Node currentNode = this.inicio;
            System.out.print("[ ");
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.print("]");
        }
        System.out.println("");
    }

    // 3. Adicao de um elemento a lista
    public void add(int valor) {
        // Criamos o elemento na memoria sem fazer parte da
        // Lista Ligada
        Node newNode = new Node(valor, null);

        // Se a lista estiver vazia, o novo elemento
        // passa a ser o primeiro da lista
        if (this.count() == 0) {
            // inicio [newNode] -> null
            this.inicio = newNode;
        } else {
            // Percorremos toda lista ate encontrar um elemento
            // que nao tenha seguinte (next == null)
            Node currentNode = this.inicio;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            // O elemento actual (currentNode) é o último da lista
            // Agora, anexamos o novo elemento ao atributo next
            // [currentNode] -> [newNode] -> null
            currentNode.next = newNode;
        }

        this.tamanho++;
    }

    // 4. Adicao de um elemento no inicio da lista
    public void addFirst(int valor) {
        Node newNode = new Node(valor, null);
        // [newNode] -> inicio [node] -> ... resto da lista
        newNode.next = this.inicio;

        // inicio [newNode] -> [node] -> ... resto da lista
        this.inicio = newNode;
        this.tamanho++;
    }

    // 5. Adicao de um elemento no inicio da lista
    public void addLast(int valor) {
        this.add(valor);
    }

    // 6. Adicao de um elemento em posicao na lista
    public boolean addAt(int indice, int valor) {
        if (indice < 0 || indice > tamanho) {
            return false;
        }

        Node newNode = new Node(valor, null);

        // Neste método, queremos adicionar um nó entre dois nós na lista
        // Para tal, temos que percorrer a lista até ao nó imediatamente antes da
        // posição desejada
        Node currentNode = this.inicio;
        int contador = 0;
        while (currentNode.next != null && contador < indice - 1) {
            currentNode = currentNode.next;
            contador++;
        }
        // Neste momento: ... -> [currentNode] -> [node seguinte] -> ...

        // Fazemos com que o novo nó aponte para o nó a seguir ao currentNode
        // ... -> [newNode] -> [node seguinte] -> ...
        newNode.next = currentNode.next;

        // E com que o currentNode aponte para o newNode
        // Efectivamente introduzindo o newNode no meio, entre currentNode e node
        // seguinte
        // ... -> [currentNode] -> [newNode] -> [node seguinte] -> ...
        currentNode.next = newNode;

        this.tamanho++;
        return true;
    }

    // 7. Remover um elemento no fim da lista
    public boolean removeLast() {
        if (this.isEmpty() == true) {
            return false;
        } else {
            if (this.count() == 1) {
                this.inicio = null;
                this.tamanho--;
            } else {
                // Percorremos toda lista ate encontrar um elemento
                // que nao tenha seguinte (next == null)
                Node currentNode = this.inicio;
                int contador = 1;
                while (contador < this.count() - 1) {
                    currentNode = currentNode.next;
                    contador++;
                }
                currentNode.next = null;
                this.tamanho--;
            }
            return true;
        }
    }

    // 8. Remover elemento no inicio
    public boolean removeFirst() {
        if (this.isEmpty() == true) {
            return false;
        } else {
            this.inicio = this.inicio.next;
            this.tamanho--;
            return true;
        }

    }

    // TPC1
    // Retornar o valor do primeiro elemento
    public int getFirst() {
        if (this.isEmpty() == true) {
            return -1;
        } else {
            return this.inicio.data;
        }
    }

    // Retornar o valor do ultimo elemento
    public int getLast() {
        if (this.isEmpty() == true) {
            return -1;
        } else {
            if (this.count() == 1) {
                return this.inicio.data;
            } else {
                // Percorremos toda lista ate encontrar um elemento
                // que nao tenha seguinte (next == null)
                Node currentNode = this.inicio;
                int contador = 1;
                while (contador < this.count()) {
                    currentNode = currentNode.next;
                    contador++;
                }
                return currentNode.data;
            }
        }
    }

    // Retornar o valor de um elemento em posicao
    public int getAt(int indice) {
        if (indice < 0 || indice > tamanho) {
            return -1;
        } else if (indice == 1) {
            return this.inicio.data;
        } else {
            Node currentNode = this.inicio;
            int contador = 1;
            do {
                currentNode = currentNode.next;
                contador++;
            } while (contador != indice);
            return currentNode.data;
        }
    }

    // Existência do valor
    public boolean exists(int valor) {
        boolean found = false;
        if (this.isEmpty() == true) {
            return false;
        } else {
            Node currentNode = this.inicio;
            int contador = 0;

            while (currentNode != null && found == false) {
                if (currentNode.data == valor) {
                    found = true;
                } else {
                    currentNode = currentNode.next;
                    contador++;
                }
            }
        }
        return found;
    }

    public int indexOf(int valor) {
        Node currentNode = this.inicio;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == valor) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public void sort() {
        Node printNode = this.inicio;
        Vector printVector = new Vector<>();
        int contador = 0;
        while (printNode != null) {
            printVector.addElement(printNode.data);
            printNode = printNode.next;
            contador++;
        }
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < printVector.size() - 1; i++) {
                if ((Integer) printVector.elementAt(i) > (Integer) printVector.elementAt(i + 1)) {
                    int guarda = (Integer) printVector.elementAt(i);
                    printVector.set(i, printVector.elementAt(i + 1));
                    printVector.set(i + 1, guarda);
                    troca = true;
                }
            }
        } while (troca);
        System.out.println(printVector.toString());
    }
    // do {
    // // A verificação da ordem dos nós sempre começa no início
    // printNode = this.inicio;
    // // Variável de verificação de ordem
    // troca = false;
    // // Controlador de paragem
    // int contador = 0;
    // // Ciclo para percorrer a lista até o penúltimo elemento
    // while (contador < (this.tamanho - 1)) {
    // // Troca de valores caso, nº anterior seja maior que posterior
    // if (printNode.data > printNode.next.data) {
    // // Variável que guarda o valor anterior
    // int guarda = printNode.data;
    // // Dado do nó anterior fica igual ao posterior
    // printNode.data = printNode.next.data;
    // // Dado do nó do posterior recupera, dado do nó anterior
    // printNode.next.data = guarda;
    // // Caso uma troca tenha ocorrido devolve váriavel de verificação como 'true'
    // troca = true;
    // }
    // printNode = printNode.next;
    // contador++;
    // }
    // } while (troca);// Ciclo só para se nenhuma troca tenha sido feita
    // // Significa a lista está organizada

    /*
     * 
     * function quickSort(items) {
     * if (items.length > 1) {
     * let pivot = items[0];
     * let left = [];
     * let right = [];
     * for (let i = 1; i < items.length; i++) {
     * if (items[i] < pivot) {
     * left.push(items[i]);
     * } else {
     * right.push(items[i]);
     * }
     * }
     * return quickSort(left).concat(pivot, quickSort(right));
     * } else {
     * return items;
     * }
     * }
     * 
     * def quick_sort(items):
     * if len(items) > 1:
     * pivot = items[0]
     * left = [i for i in items[1:] if i < pivot]
     * right = [i for i in items[1:] if i >= pivot]
     * return quick_sort(left) + [pivot] + quick_sort(right)
     * else:
     * return items
     * 
     * 
     * public int indexOf(int valor){
     * boolean found=false;
     * int contador = 0;
     * if (this.isEmpty() == true) {
     * return -1;
     * }else if(exists(valor)){
     * return -1;
     * }else{
     * Node currentNode = this.inicio;
     * while (currentNode != null && contador < indice - 1) {
     * if(currentNode.data==valor){
     * found=true;
     * }else{
     * currentNode = currentNode.next;
     * contador++;
     * }
     * }
     * }
     * return contador;
     * }
     */
    /*
     * Mantem-se a Lista Ligada mas em substituicao dos metodos ja existentes
     * (removeFirst, removeLast), fazer o seguinte te
     * // Verifica a existencia de um elemento/valor na lista ligada
     * 
     * - public boolean exists(int valor)
     * 
     * // Existindo, retorna o indice de um elemento na lista ligada
     * 
     * - public int indexOf(int valor)
     * 
     * // Este método deve fazer uso de um algoritmo de ordenação
     * // e, sem alterar a lista, imprime os elementos da lista em ordem crescente
     * // Qual algoritmo de ordenacao deve ser usado fica a criterio dos estudantes
     * 
     * - public void sort()
     */
    public static void main(String args[]) {
        // 1. Criacao
        LinkedList LL = new LinkedList();

        // Listagem inicial da lista
        LL.listAll();

        // Verificando se a lista está vazia
        System.out.println("isEmpty: " + LL.isEmpty());

        // Contagem de elementos presentes na lista
        System.out.println("count: " + LL.count());

        // 3. Adicao de um elemento a lista
        System.out.println("add(1)");
        System.out.println("add(2)");
        LL.add(2);
        LL.add(1);

        LL.listAll();

        // Adicao de um elemento no inicio lista
        // System.out.println("addFirst(3): ");
        // LL.addFirst(3);
        LL.listAll();

        // Adicao de um elemento no fim da lista
        // System.out.println("addLast(4)");
        // LL.addLast(4);
        LL.listAll();

        // Adicao de elementos em posicao
        // System.out.println("addAt(-1,5): " + LL.addAt(-1, 5));
        // System.out.println("addAt(1,5): " + LL.addAt(1, 5));
        LL.listAll();

        // 7. Remover um elemento no fim da lista
        // System.out.println("removeLast: " + LL.removeLast());
        LL.listAll();

        // 8. Remover um elemento no inicio da lista
        // System.out.println("removeFirst: " + LL.removeFirst());
        LL.listAll();
        System.out.println("count: " + LL.count());

        // Testes dos novos métodos aqui...
        // EXISTE
        // LL.addLast(9);
        System.out.println("exists:9 " + LL.exists(9));
        LL.listAll();
        // GetFirst
        System.out.println("getFirst: " + LL.getFirst());

        // GetLast
        System.out.println("getLast: " + LL.getLast());

        // Get At
        System.out.println("getAt: " + LL.getAt(1));
        LL.add(10);
        LL.add(9);
        LL.add(7);
        LL.add(6);
        LL.add(40);
        LL.add(7);
        LL.add(41);
        LL.add(100);
        LL.add(23);
        System.out.println("INDEXOF" + LL.indexOf(2));
        LL.add(-5);
        LL.add(-7);
        LL.listAll();
        System.out.println("SORT");
        LL.sort();

        System.out.println("LISTALL");
        LL.listAll();
    }
}