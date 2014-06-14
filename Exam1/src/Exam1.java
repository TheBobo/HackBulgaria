import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam1 {

	public static List<Integer> copy(List<Integer> List)
	{
		List<Integer> copyList = new ArrayList<Integer>();
		for (Integer item : List) {
			copyList.add(item);
		}
		return copyList;
	}
	

	
	public static List<Integer> sort(List<Integer> unsortList)
	{
		List<Integer> sortedList = new ArrayList<Integer>();
		sortedList = copy(unsortList);
		Collections.sort(sortedList);
		return sortedList;
	}
	
	public static List<Integer> reverse(List<Integer> list)
	{
		List<Integer> reverseList = new ArrayList<Integer>();
		Integer tempElement;
		for (Integer i=list.size()-1; i>=0; i--) {
			tempElement=list.get(i);
			reverseList.add(tempElement);
		}
		return reverseList;
	}
	
	//not woking correct if not monotonous list 
	public static Boolean monotonous(List<Integer> list)
	{
		Boolean type = false;
		Boolean temp = false;
		if(list.size()>1){
			return true;
		}
		
		if(list.get(0)-list.get(1) > 0 ){
			type = true;
			temp = true;
		}
		
		for (Integer i=1; i<list.size(); i++) {
			if(list.get(i-1)-list.get(i) > 0 ){
				type=true;
			}
			else
			{
				type=false;
			}
			if(temp!=type){
				return false;
			}
		}
		return true;
	}
	
	public static Boolean monotonousV1(List<Integer> list)
	{
		
		if(list.equals(reverse(sort(list))) == true || list.equals(sort(list)) == true){
			return true;
		}
		
		return false;
	}
	
}
