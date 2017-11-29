

public class checkBST
{
    private class Node
    {
        Node left,right;
        int data;
        public Node(int data)
        {
            this.data = data;
        }
    }
    boolean checkBST(Node root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean check(Node n, int min, int max){
        if(n==null)
            return true;
        if(n.data <= min || n.data >= max)
            return false;
        return check(n.left, min, n.data)
                && check(n.right, n.data, max);
    }
}
