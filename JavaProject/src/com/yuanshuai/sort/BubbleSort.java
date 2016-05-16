package com.yuanshuai.sort;

/**
 * 冒泡排序
 * 
 * 效率 O（n²）,适用于排序小列表
 * 
 * @author YuanShuai
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] unsorted = { 22, 47, 8, 12, 4, 6, 9, 24, 18, 16, 1, 3, 2, 5, 7 };
		System.out.println("================原数组================");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "  ");
		}
		System.out.println("");
		System.out.println("================冒泡排序================");
		unsorted = bubbleSort(unsorted);
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + "  ");
		}
	}

	/**
	 * 冒泡排序
	 * 
	 * @param unsorted
	 */
	public static int[] bubbleSort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = i; j < unsorted.length; j++) {
				if (unsorted[i] > unsorted[j]) {
					int temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}
		return unsorted;
	}
}
