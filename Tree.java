package n;
class Node{
    int data;
    Node left,right;
    public Node(int data) {
        this.data = data;
        left=right=null;
} 
}
public class Tree {
    Node root;
    void preorder(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }
     void inorder(Node node){
        if(node!=null){
           
            inorder(node.left);
             System.out.print(node.data+" ");
            inorder(node.right);
        }
    } void postorder(Node node){
        if(node!=null){
           
            postorder(node.left);
            
            postorder(node.right);
             System.out.print(node.data+" ");
        }
    }
    int count(Node node){
     if(node==null){
        return 0;
     }
        
        return 1+count(node.left)+count(node.right);
    }
    int height(Node node){
        if(node==null){
            return 0;}
            else
            return 1+Math.max(height(node.left),height(node.right));
            
        }
        void  leafNode(Node node){
            if(node!=null){
             leafNode(node.left);
             leafNode(node.right);
             if(node.left==null&&node.right==null){
                System.out.println(node.data+" ");
             }}}
             int sum(Node node){
                if(node==null){
                    return 0;
                }
                return node.data+sum(node.left)+sum(node.right);
            }
     public static void main(String args[]){
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left=new Node(2);
         tree.root.right=new Node(3);
         tree.root.left.left=new Node(12);
         tree.root.left.right=new Node(16);
         tree.root.left.left.right=new Node(22);
         tree.root.left.right.left=new Node(13);

         
         System.out.print("the preorder traversal ");
         tree.preorder(tree.root);
         System.out.println();
          System.out.print("the inorder traversal ");
          tree.inorder(tree.root);
          System.out.println();
           System.out.print("the postorder traversal ");
           tree.postorder(tree.root);
           System.out.println();
           System.out.println("the height of the tree is "+tree.height(tree.root));
           System.out.println("the count of the tree is "+tree.count(tree.root));
        tree.leafNode(tree.root);
        System.out.println("the sum of the tree is "+tree.sum(tree.root));
     }

    
}
