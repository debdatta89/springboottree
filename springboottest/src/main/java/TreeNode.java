import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	TreeNode() {}
	TreeNode (String id,String parentId,String text,boolean hasChild) {
		this.id=id;
		this.parentId = parentId;
		this.text=text;
		this.hasChild=hasChild;
	} 
	private String id;
	private String parentId;
        private String text;
	private Boolean hasChild;
	private List<TreeNode> children=new ArrayList<TreeNode>();

	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Boolean getHasChild() {
		return hasChild;
	}
	public void setHasChild(Boolean hasChild) {
		this.hasChild = hasChild;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "{\"id\": \"" + id + "\", \"text\":\""
				+ text + "\", \"children\":" + children
				+ "}";
	}
        
}     
        