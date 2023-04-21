class Node {
    String data;
    Node left, middle, right;

    Node(String item) {
        data = item;
        right = middle = left = null;
    }
}

public class TrinaryTree {
    public static void main(String[] args)
    {
        TrinaryTree tree = new TrinaryTree();
        tree.root =new Node("A");
        tree.root.left =new Node("B");
        tree.root.right =new Node("C");
        tree.root.left.left =new Node("D");
        tree.root.left.right =new Node("E");
        tree.root.left.left.left =new Node("F");
        tree.root.left.left.right =new Node("G");
        tree.root.left.left.left.left =new Node("H");
        tree.root.left.left.left.right =new Node("I");
        tree.root.left.left.right.left =new Node("K");
        tree.root.left.left.right.right =new Node("L");
        tree.root.right.left =new Node("M");
        tree.root.right.right =new Node("N");
        tree.root.right.right.left =new Node("O");
        tree.root.right.right.right =new Node("P");
        tree.root.right.right.left.left =new Node("Q");
        tree.root.right.right.left.middle =new Node("R");
        tree.root.right.right.left.right =new Node("S");
        tree.root.right.right.left.middle.left =new Node("T");
        tree.root.right.right.left.middle.right =new Node("U");
        tree.root.right.right.left.middle.right.left =new Node("V");
        tree.root.right.right.left.middle.right.right =new Node("W");
        tree.root.right.right.left.middle.right.left.left =new Node("X");
        tree.root.right.right.left.middle.right.left.right =new Node("Y");
        tree.root.right.right.left.middle.right.left.left.left =new Node("Z");
        tree.root.right.right.left.middle.right.left.left.right =new Node("1");
        tree.root.right.right.left.middle.right.left.left.left.left =new Node("2");
        tree.root.right.right.left.middle.right.left.left.left.right =new Node("3");
        tree.root.right.right.left.middle.right.left.left.left.left.left =new Node("4");
        tree.root.right.right.left.middle.right.left.left.left.left.middle =new Node("5");
        tree.root.right.right.left.middle.right.left.left.left.left.right =new Node("6");
        tree.root.right.right.left.middle.right.left.left.left.left.middle.left =new Node("7");
        tree.root.right.right.left.middle.right.left.left.left.left.middle.right =new Node("8");
        tree.root.right.right.left.middle.right.left.left.left.left.right.left =new Node("9");
        tree.root.right.right.left.middle.right.left.left.left.left.right.right =new Node("10");
        tree.root.right.right.left.middle.right.left.left.left.left.right.right.left =new Node("11");
        tree.root.right.right.left.middle.right.left.left.left.left.right.right.right =new Node("12");
        tree.root.right.right.left.middle.right.left.left.left.left.right.right.right.left =new Node("13");
        tree.root.right.right.left.middle.right.left.left.left.left.right.right.right.right =new Node("14");
        tree.root.right.right.left.right.left =new Node("19");
        tree.root.right.right.left.right.right =new Node("20");
        tree.root.right.right.left.right.left.left =new Node("21");
        tree.root.right.right.left.right.left.right =new Node("22");
        tree.root.right.right.left.right.left.right.left =new Node("23");
        tree.root.right.right.left.right.left.right.right =new Node("24");
        tree.root.right.right.left.right.left.right.left.left =new Node("25");
        tree.root.right.right.left.right.left.right.left.right =new Node("26");
        tree.root.right.right.left.right.left.right.left.left.left =new Node("27");
        tree.root.right.right.left.right.left.right.left.left.middle =new Node("28");
        tree.root.right.right.left.right.left.right.left.left.right =new Node("29");
        tree.root.right.right.right.left =new Node("15");
        tree.root.right.right.right.right =new Node("16");
        tree.root.right.right.right.right.left =new Node("17");
        tree.root.right.right.right.right.right =new Node("18");


        tree.printPaths(tree.root);
    }
    Node root;

    void printPaths(Node node)
    {
        String path[] = new String[1000];
        printPathsRecur(node, path, 0);
    }
    void printPathsRecur(Node node, String path[], int pathLen)
    {
        if (node == null)
            return;
        path[pathLen] = node.data;
        pathLen++;

        if (node.left == null && node.right == null && node.middle == null)
        {
            printArray(path, pathLen);
        }
        else
        {
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
            printPathsRecur(node.middle, path, pathLen);
        }
    }
    void printArray(String ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }


}


