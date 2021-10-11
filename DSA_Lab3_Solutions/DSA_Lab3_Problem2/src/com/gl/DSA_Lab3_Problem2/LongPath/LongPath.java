package com.gl.DSA_Lab3_Problem2.LongPath;
import java.util.ArrayList;
import com.gl.DSA_Lab3_Problem2.Driver.Driver.Node;
public class LongPath {
	public ArrayList<Integer> longestPath(Node root) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> left_list = new ArrayList<>();
		ArrayList<Integer> right_list = new ArrayList<>();
		if (root == null)
			return al;
		else {
			left_list = longestPath(root.leftnode);
			right_list = longestPath(root.leftnode);
			if (left_list.size() > right_list.size())
				left_list.add(root.data);
			else
				right_list.add(root.data);
		}
		return left_list.size() > right_list.size() ? left_list : right_list;

	}
}
