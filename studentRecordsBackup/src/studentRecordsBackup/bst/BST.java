package studentRecordsBackup.bst;

public class BST {
	Node x;
	Node max;
	
	int sum=0;
	/**
	 * Put function called from BSTBuilder
	 * @param node root node
	 */
	 public void put(Node node) {
	        put(x,node);
	  }
	 /**
	  * Put function to be called recursively
	  * @param node root node
	  * @param newNode new node
	  */
	 
	 
	 public void put(Node node, Node newNode) {
		 if (x == null){
				x = newNode;
				 
			}
		 else if (newNode.val < node.val) {
				if (node.left == null) {
					
					node.left = newNode;
					
				} else {
					put(node.left, newNode);
				}
			} else {
				if (node.right == null) {
					
					node.right = newNode;
					
				} else {
					put(node.right, newNode);
				}
			}
		}
	 
	    
	    /**
	     * inOrder called from BSTBuilder
	     * @param x Tree of Node x
	     */
	    private void inOrder(Node x){
	    	if(x!=null){
	    		inOrder(x.left);
	    		System.out.println(x.val);
	    		inOrder(x.right);
	    	}
	    }
	    /**
	     * findMax from BST to mark the flag of max element
	     */
	    public void findMax(){
	    	 max=findMax(x);
	    }
	    /**
	     * findMax recursive call to mark the flag of node x
	     * @param x tree node x
	     * @return return the max element back in first function
	     */
	    private Node findMax(Node x){
	    	if(x.right == null){
	    		x.flag = true;
	    		return x;
	    	}
	    	
	    	x=findMax(x.right);
	    	x.flag=true;
	    	return x;
	    	
	    }
	    /**
		 * inOrder called from BSTBuilder
		 */
	    public void inOrder(){
    		inOrder(x);
    	}
	    /**
	     * Call to updateMax
	     * @param updateValue Update value passed in command line
	     */
	    public void updateMax(int updateValue){
	    	updateMax(updateValue,x);
	    }
	    /**
	     * Recursive call to updateMax
	     * @param updateValue Update value passed in command line
	     * @param x Tree node x
	     */
	    private void updateMax(int updateValue,Node x){
	    	if(x!=null){
	    		updateMax(updateValue,x.left);
	    		if(x.flag==true){
		    		x.val = x.val + (updateValue+updateValue);
		    	}
	    		else{
	    			x.val = x.val+updateValue;
	    			
	    		}
	    		x.notifyObservers(updateValue);
	    		updateMax(updateValue,x.right);
	    	}
	    	
	    }
	    /**
	     * Find sum of the node
	     */
	    public void findSum(){
	    	findSum(x);
	    }
	    /**
	     * @override to find sum and recursive call implementation
	     * @param x Node of object
	     */
	    private void findSum(Node x){
	    	if(x!=null){
	    		findSum(x.left);
	    		sum = x.val + sum;
	    		findSum(x.right);
	    	}
	    }
	    /**
	     * Print sum of tree
	     */
		public void printSum(){
			System.out.println(printSum(x));
			sum=0;
		}
		/**
		 * Recursive call to print sum of tree
		 * @param x Tree node x
		 * @return sum of tree
		 */
		private int printSum(Node x){
			return sum;
		}
}