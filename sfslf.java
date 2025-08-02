class Node
        {
            int data;
            Node leftNode, rightNode;

            Node(int item)
            {
                data = item;
                leftNode = rightNode = null;
            }
        }


 class NodeFun {
   Node rootNode;
   public NodeFun()
   {
         rootNode = null;

   }

   void insert(int data)
   {
     rootNode = insertRec(rootNode, data);
   }

   Node insertRec(Node rootNode, int data)
   {
        if(rootNode == null)
        {
            rootNode = new Node(data);
            return rootNode;

        }
        if(data < rootNode.data)
        {
            rootNode.leftNode = insertRec(rootNode.leftNode, data);
        }
        else if(data > rootNode.data)
        {
            rootNode.rightNode = insertRec(rootNode.rightNode, data);
        }
        return rootNode;
   }

   void inorder()
   {
       inorderRec(rootNode);
   }

   void inorderRec(Node rootNode)
   {
     if(rootNode!=null)
     {
        inorderRec(rootNode.leftNode);
        System.out.println(rootNode.data+" ");
        inorderRec(rootNode.rightNode);
     }
    
   }
    
}

public class bst
{
    public static void main(String[] args) {
        NodeFun bst = new NodeFun();
        bst.insert(22);
        bst.insert(12);
        bst.insert(15);
        bst.inorder();

    }
}