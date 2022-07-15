package P2_EmployeeMgmt;

public class Tree
{
    private Node root;

    public Node getRoot()
    {
        return root;
    }

    public void buildExampleTree()
    {
        root = new Node(new Employee(53, "Thomas"));

        Node r = new Node(new Employee(78, "Francesca"));
        root.setRight(r);

        Node l = new Node(new Employee(45, "Laura"));
        root.setLeft(l);

        Node ll = new Node(new Employee(40, "Marc"));
        l.setLeft(ll);

        Node lr = new Node(new Employee(49, "Peter"));
        l.setRight(lr);

        Node rr = new Node(new Employee(90, "Stefan"));
        r.setRight(rr);

        Node lll = new Node(new Employee(11, "Klaus"));
        ll.setLeft(lll);

        Node rrl = new Node(new Employee(87, "Franz"));
        rr.setLeft(rrl);

        Node rl = new Node(new Employee(77, "Lisa"));
        r.setLeft(rl);
    }

    public Employee searchForNumber(int number)
    {
        Node current=root;

        while (current!=null){
            if (current.getEmployee().getNumber() == number){
                return current.getEmployee();
            }else if (current.getEmployee().getNumber()> number){
                current = current.getLeft();
            }else current= current.getRight();
        }
        return null;
    }


    }

