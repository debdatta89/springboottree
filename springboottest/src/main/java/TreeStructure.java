import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@Controller
@EnableAutoConfiguration
public class TreeStructure{

    @RequestMapping("/tree")
    String home() {
        return "showtree";
    }

	@RequestMapping(value="/getData",method=RequestMethod.GET)
	@ResponseBody
    List<TreeNode> getData() {
		List<TreeNode> flatDataList = null;
		List<TreeNode> treeData = null;
		try {
		Helper dataHelper = new Helper();
	    flatDataList = dataHelper.getDummyData();
        treeData=dataHelper.generateTree(flatDataList,"");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return treeData;
	}
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TreeStructure.class, args);
    }


   

}