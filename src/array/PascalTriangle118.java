package array;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

/*
 Given an integer numRows, return the first numRows of Pascal's triangle.
 Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class PascalTriangle118 {

	
	public static void main(String[] args) {
		
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>>triangle = new ArrayList<List<Integer>>();
		
		if(numRows==0)
			return triangle;
		List<Integer>one = new ArrayList<Integer>();
		one.add(1);
		triangle.add(one);
		if(numRows == 1)
			return triangle;
		
		for(int i=1;i<numRows;i++) {
			List<Integer>row = new ArrayList<>();
			row.add(1);
			for(int j=1;j<i;j++) {
				 List<Integer> prev = triangle.get(i-1);
	                row.add(prev.get(j-1)+prev.get(j));
			}
			row.add(1);
			 triangle.add(row);
		}
		
		
		
		
		return triangle;
	}
}
