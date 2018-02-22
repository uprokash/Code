static int height(Node root) {
      	// Write your code here.
                if(root==null)
                    return -1;
                return Math.max(1+height(root.left),1+height(root.right));
    }
