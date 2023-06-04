class Tree{
    class Node{
        int date;
        Node left;
        Node right;
        public Tree(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    int tamanho;
    Node root;
    public Tree(){
        this.root=null;
        this.tamanho=0;
    }
}