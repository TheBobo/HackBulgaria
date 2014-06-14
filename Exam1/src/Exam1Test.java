import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;


public class Exam1Test {

	public Boolean IsEqual(List<Integer>actual, List<Integer>expected )
	{
		if(actual.size() != expected.size())
		{
			return false;
		}
		
		for (Integer i=0; i>actual.size(); i++) {
			if(actual.get(i) != expected.get(i))
			{
			return false;
			}
		}
		return true;
	}
	public Boolean Reverse(List<Integer>actual, List<Integer>expected )
	{
		if(actual.size() != expected.size())
		{
			return false;
		}
		
		for (Integer i=0, j=expected.size()-1; i>actual.size(); i++,j--) {
			if(actual.get(i) != expected.get(j))
			{
			return false;
			}
		}
		return true;
	}
	@Test
	public void SortList() {
		List<Integer> unsortList = new ArrayList<Integer>(Arrays.asList(5,4,7,3,1,2,6));
		List<Integer> actual = Exam1.sort(unsortList);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		
		boolean result = IsEqual(actual,expected);
		assertEquals(true, result);
	}
	
	@Test
	public void Reverse() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(7,6,5,4,3,2,1));
		List<Integer> actual = Exam1.reverse(list);
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		
		boolean result = Reverse(actual, expected);
		assertEquals(true, result);
	}

	@Test
	public void MonotonousASC() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		boolean actual = Exam1.monotonous(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousRepeatASC() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,6,6));
		boolean actual = Exam1.monotonous(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousDesc() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,5,4,3,2,1));
		boolean actual = Exam1.monotonous(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousRepeatDesc() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,5,5,4,3,2,2,1));
		boolean actual = Exam1.monotonous(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousRepeatOne() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1));
		boolean actual = Exam1.monotonous(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousNone() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4,3,2,1,2,4,6,7,8));
		boolean actual = Exam1.monotonous(list);
		boolean expected = false;
	
		assertEquals(actual,expected);
	}
	
	
	@Test
	public void MonotonousV1ASC() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		boolean actual = Exam1.monotonousV1(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousRepeatV1ASC() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,6,6));
		boolean actual = Exam1.monotonousV1(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousV1Desc() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,5,4,3,2,1));
		boolean actual = Exam1.monotonousV1(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousRepeatV1Desc() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,5,5,4,3,2,2,1));
		boolean actual = Exam1.monotonousV1(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousRepeatOneV1() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1));
		boolean actual = Exam1.monotonousV1(list);
		boolean expected = true;
	
		assertEquals(actual,expected);
	}
	
	@Test
	public void MonotonousNoneV1() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4,3,2,1,2,4,6,7,8));
		boolean actual = Exam1.monotonousV1(list);
		boolean expected = false;
	
			assertEquals(actual,expected);
	}
	
}
