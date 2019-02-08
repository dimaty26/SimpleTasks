package TreePackage.java;

public class Main {

    public static void main(String[] args) {
	    MyTreeNode n1 = new MyTreeNode(1);
		MyTreeNode n2 = new MyTreeNode(1);
		MyTreeNode n3 = new MyTreeNode(1);
		MyTreeNode n4 = new MyTreeNode(1);
		MyTreeNode n5 = new MyTreeNode(1);

		n1.nodeRight = n3;
		n1.nodeLeft = n2;
		n3.nodeRight = n5;
		n2.nodeLeft = n4;

		System.out.println(n1.countNumber());
    }
}
