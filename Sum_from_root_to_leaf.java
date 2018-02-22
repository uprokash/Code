boolean rootToLeafSum(Node root,int sum,List<Integer> result)
{
	if(root==null)
		return false;
	if(root.left==null&&root.right==null)
	{
		if(root.data==sum){
			result.add(root.data);
			return true;
		}
		else
			return false;
	}
	if(rootToLeafSum(root.left,sum-root.data,result){
		result.add(root.data);
		return true;
	}
	if(rootToLeafSum(root.right,sum-root.data,result){
		result.add(root.data);
		return true;
	}
	return false;
}
	
	