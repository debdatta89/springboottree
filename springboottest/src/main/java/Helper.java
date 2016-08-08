import java.util.ArrayList;
import java.util.List;

public class Helper {

 public  List<TreeNode> generateTree(List<TreeNode> data,String parentId) {
		List<TreeNode> treeList = new ArrayList<TreeNode>();
		if(treeList!=null) {
		for(TreeNode tree : data) {
			if(tree.getParentId().equals(parentId)) {
			TreeNode nd = new TreeNode();
			nd.setText(tree.getText());
			nd.setId(tree.getId()); 
			if(tree.getHasChild()) {
				nd.setChildren(generateTree(data,tree.getId()));
				treeList.add(nd);
			} else {
				treeList.add(nd);
			}
			
			} 
		  }
		}
		return treeList;
	}
	
public List<TreeNode> getDummyData() {
	List<TreeNode> dataList = new ArrayList<TreeNode>();
	
	 TreeNode t1 = new TreeNode("1","","India",true);
		dataList.add(t1);
		t1=new TreeNode("11","1","West Bengal",true);
		dataList.add(t1);
		t1=new TreeNode("12","1","Delhi",false);
		dataList.add(t1);
		t1=new TreeNode("13","1","Mumbai",false);
		dataList.add(t1);
		t1=new TreeNode("111","11","Kolkata",true);
		dataList.add(t1);
		t1=new TreeNode("1111","111","Esplanade",false);
		dataList.add(t1);
		t1=new TreeNode("1112","111","Saltlake",false);
		dataList.add(t1);
	    t1 = new TreeNode("2","","Denmark",true);
		dataList.add(t1);
		t1=new TreeNode("21","2","Copenhagen",false);
		dataList.add(t1);
		t1 = new TreeNode("3","","Egypt",true);
		dataList.add(t1);
		t1=new TreeNode("31","3","Cairo",false);
		dataList.add(t1);
        t1=new TreeNode("32","3","Sharqia",false);
		dataList.add(t1);

      return dataList;
}	
        
}