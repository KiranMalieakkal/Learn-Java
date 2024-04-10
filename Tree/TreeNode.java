
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }   
}
 class Tree{
    TreeNode Root;

     public Tree(){
        Root=null;
    }

    public void insert(int data){
        Root= insertRecursive(Root,data);
    }
    public TreeNode insertRecursive(TreeNode Root, int data){
        if(Root ==null){
            TreeNode temp = new TreeNode(data);
            return temp;
        }
        if (data<Root.data){
            Root.left= insertRecursive(Root.left,data);
        }
        else if(data>Root.data){
            Root.right=insertRecursive(Root.right,data);
        }
        return Root;
    }
    public boolean search(TreeNode Root, int data){
        if(Root==null){
            return false;
        }
        if (data==Root.data) return true;
        else if (data<Root.data){
             return search(Root.left,data);
        }
        else if(data>Root.data){
           return search(Root.right,data);
        }
        return false;
    }
    public void inorder(TreeNode Root){
        if(Root!=null){
            inorder(Root.left);
            System.out.print(Root.data +" ");
            inorder(Root.right);
        }
    }
    public int size(TreeNode Root){
        if(Root==null){
            return 0;
        }
            return(size(Root.left)+size(Root.right)+1);
        }
        public int Max(TreeNode Root){
            if(Root==null)
            return 0;
            return Math.max(Root.data,Math.max(Max(Root.left),Max(Root.right)));
            }
    
    public void printk(TreeNode Root,int l, int k){

        if(Root!=null){
            if(l==k){
                System.out.println(Root.data);
            }
            printk(Root.left,l+1,k);
            printk(Root.right,l+1,k);
       }
   }
}
 class Test{
    public static void main(String[] args){
            Tree S = new Tree();
            S.insert(50);
            S.insert(30);
            S.insert(70);
            S.insert(20);
            S.insert(40);
            S.insert(60);
            S.insert(80);
            S.inorder(S.Root);
            System.out.println();
            //System.out.println(S.size(S.Root));
            //S.printk(S.Root,0,2);
            //System.out.println(S.Max(S.Root));
            System.out.println(S.search(S.Root,39));

    }
}
