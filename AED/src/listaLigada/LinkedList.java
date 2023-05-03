package contReposicao;

import java.util.ArrayList;

class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    Node inicio;
    int tamanho;

    // 1. Criacao de uma Lista Vazia
    public boolean isEmpty() {
    	if( inicio == null) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public LinkedList() {
    	this.inicio=null;
    	this.tamanho = 0;
    }
    
    public int count() {
    	
    	return this.tamanho;
    }

    // 2. Listagem de todos elementos da lista
    public void listAll() {
    	
    	if(this.count() == 0) {
    		System.out.println("A lista está vazia");
    	} else {
    		Node currentNode = this.inicio;
    		
    		while(currentNode.next != null) {
    			System.out.print(currentNode.data+" ");
    			currentNode = currentNode.next;
    			//System.out.println();
    		}
    		System.out.println(currentNode.data);
    		
    	}
    }

    // 3. Adicao de um elemento a lista
    public void add(int valor){ 
    	Node newNode = new Node (valor, null);
    	if(count() == 0) {
    		this.inicio = newNode;
    	} else {
    		Node currentNode = this.inicio;
    		
    		while(currentNode.next != null) {
    			currentNode = currentNode.next;
    			
    		}
    			
    		currentNode.next=newNode;
    	}
    	this.tamanho++;
    }
    

    // 4. Adicao de um elemento no inicio da lista
    public void addFirst(int valor) { 
    	Node newNode = new Node(valor, null);
    	newNode.next = this.inicio;
    	this.inicio = newNode;
    	this.tamanho++;
    	//start ups
    	
    	}

    // 5. Adicao de um elemento no inicio da lista
    public void addLast(int valor) {
    	Node newNode = new Node(valor, null);
    	
    	//newNode.next = null;
    	
    	//this.tamanho++;
        this.add(valor);
    }
    
    //6 adicao de um elemento em posicao na lista
    
    public boolean addAt(int indice, int valor) {
    	//boolean pois há possibilidade
    	if(indice > tamanho || indice < 0) {
    		
    		
    		return false;
    	}
    	
    	Node Newnode = new Node(valor, null);
    	Newnode.data = valor;
    	Node currentNode = this.inicio;
    	int contador= 0;
    	
    	while(currentNode.next != null && contador < indice-1) {
    		//estavamos a percorrer a lista
    		currentNode = currentNode.next;
    		
    		contador++;
    	}
    	//adição 
    	Newnode.next = currentNode.next;
    	currentNode.next = Newnode;
    	
    	tamanho++;
    	return true;
    }
    
    
    public void removeLast() {
    	System.out.println(this.inicio.data);
    	//Node previus;
    	
    	if(count()==0) {
    		
    		System.out.println("Falha, lista vazia");
    		
    		
    	} else {
    		
    		Node currentNode = this.inicio;
    		
    		int cont = 0;
    		while(cont < this.tamanho-2) {
    			currentNode = currentNode.next;
    			cont++;
    		}
    		currentNode.next = null;
    		this.tamanho--;
    	}
    		
    }
    
    
    public boolean removeLast2() {
    	if(this.isEmpty() == true) {
    		return false;
    		
    		
    		
    		
    	} else if(this.count() == 1) {
    		
    		inicio = null;
    		tamanho --;
    		return true;
    		
    	} else {
    		
    		Node currentNode = this.inicio;
    		int contador = 1;
    		
    		while(currentNode.next != null && contador < this.count() - 1) {
    			
    			currentNode = currentNode.next;
    			contador++;
    		}
    		currentNode.next = null;
    		this.tamanho--;
    		
    		return true;
    	
    	}
    	
    	
    	
    	
    }
    
    
    public boolean removeFirst() {
		
		if(isEmpty()) {
			
			return false;
		} else {
			inicio = inicio.next;
			tamanho--;
			return true;
			
		}	
	}
    
    
    
    public boolean  removeAt(int i)
    {
    	
    	if(i == 1) {
    		removeLast2();
    	} else {
    		return false;
    	}
		return false;
    	
    }
    
    
    
    public void exists()
    	{
    	
    }
    
    
    public int search()
    {
    	
    	
    	return 0;
    	
    }
    
 
    
    public static void main(String args[]) {
        // 1. Criacao
        LinkedList ll = new LinkedList();
        
       
        // 2. Listagem de elementos da lista
        System.out.println("Count: "+ll.count());
        ll.listAll();
        
        //adicao
        ll.add(1);
		ll.add(2);
		System.out.println("Count: "+ll.count());
		ll.listAll();

        // 3. Adicao de um elemento a lista
        System.out.println("add(3): ");
        ll.addFirst(3);
        ll.listAll();
        System.out.println("AddLasT(4)");
        ll.addLast(4);
        
        
        
        System.out.println("AddAT(1,41)"+ll.addAt(1,41));
       
        ll.listAll();
        ll.removeLast();
        System.out.println("removeLast2 ");
        
        ll.listAll();
        
        ll.removeFirst();
        
        ll.listAll();
        
        // 4. Adicao de um elemento no inicio lista
        // System.out.println("add(1): " + LL.add(1));

        // 5. Adicao de um elemento no fim da lista
        // System.out.println("add(1): " + LL.add(1));
    }
}