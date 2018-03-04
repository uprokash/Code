bool myCheck(Node* root,int max,int min)
{
    if(root==NULL)
           return true;
    if(root->data<=min||root->data>=max)
        return false;
    else
        return (myCheck(root->left,root->data,min)&&myCheck(root->right,max,root->data));
}
   bool checkBST(Node* root) {
       return myCheck(root,2147483647,-2147483648);
      
   }