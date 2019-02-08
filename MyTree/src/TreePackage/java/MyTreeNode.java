package TreePackage.java;

public class MyTreeNode {
    int value;
    MyTreeNode nodeLeft;
    MyTreeNode nodeRight;

    public MyTreeNode(int value) {
        this.value = value;
    }

    public MyTreeNode(int value, MyTreeNode nodeLeft, MyTreeNode nodeRight) {
        this.value = value;
        this.nodeRight = nodeRight;
        this.nodeLeft = nodeLeft;
}

    public MyTreeNode(int value, MyTreeNode nodeLeft) {
        this.value = value;
        this.nodeLeft = nodeLeft;
    }

    public int countNumber() {
        int count = 0;

        if (nodeLeft != null) {
            count += nodeLeft.countNumber();
        }
        if (nodeRight != null) {
            count += nodeRight.countNumber();
        }
        return count + 1;
    }
}
