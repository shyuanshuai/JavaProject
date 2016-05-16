package com.yuanshuai.sort;

/**
 * 鸽巢排序
 * 
 * 经典排序算法 - 鸽巢排序Pigeonhole sort 原理类似桶排序,同样需要一个很大的鸽巢[桶排序里管这个叫桶,名字无所谓了]
 * 鸽巢其实就是数组啦,数组的索引位置就表示值,该索引位置的值表示出现次数,如果全部为1次或0次那就是桶排序
 * 
 * 例如 int[] pigeonHole = new int[100]; 
 * pigeonHole[0]的值表示0的出现次数...
 * pigeonHole[1]的值表示1的出现次数... 
 * pigeonHole[2]的值表示2的出现次数...
 * 
 * @author YuanShuai
 * 
 */
public class PogeonSort {

	public static void main(String[] args) {
		int[] unsorted = { 99, 65, 24, 47, 47, 50, 99, 88, 66, 33, 66, 67, 31,
				18, 24 };
		System.out.println("================原数组================");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "  ");
		}
		System.out.println("");
		System.out.println("================鸽巢排序================");
		unsorted = pogeonSort(unsorted, 99);
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "  ");
		}
	}

	/**
	 * 鸽巢排序
	 * 
	 * @param unsorted
	 *            待排数组
	 * @param maxNumber
	 *            待排数组中的最大数,如果可以指定的话
	 * @return
	 */
	public static int[] pogeonSort(int[] unsorted, int maxNumber) {
		int[] pogeonHole = new int[maxNumber + 1];

		for (int item : unsorted) {
			// pogeonHole[10] = 4; 的含意是 在待排数组中有4个10出现,同理其它
			pogeonHole[item]++;
		}

		int count = 0;

		for (int i = 0; i < pogeonHole.length; i++) {
			for (int j = 0; j < pogeonHole[i]; j++) {
				unsorted[count] = i;
				count++;
			}
		}

		return unsorted;
	}

}
