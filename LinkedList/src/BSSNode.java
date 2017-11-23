public class BSSNode
{
    BSSNode left,right;
    int data;

    public BSSNode(int data)
    {
        this.data = data;
    }

    public void insert(int value)
    {
        if(value <= data)
        {
            if(left == null)
            {
                left = new BSSNode(value);
            }
            else
            {
                left.insert(value);
            }
        }
        else
        {
            if(right == null)
            {
                right = new BSSNode(value);
            }
            else
            {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value)
    {
        if(value == data)
            return true;

        else if(value<=data)
        {
            if(left == null)
                return false;
            else
            {
                return left.contains(value);
            }
        }
        else
        {
            if(right == null)
                return false;
            else
            {
                return right.contains(value);
            }
        }
    }

    public void printInOrder()
    {
        if(left!= null)
        {
            left.printInOrder();
        }
        System.out.println(data);
        if(right!=null)
        {
            right.printInOrder();
        }
    }

}
