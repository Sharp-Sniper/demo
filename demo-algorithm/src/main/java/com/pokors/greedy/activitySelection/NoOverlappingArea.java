package com.pokors.greedy.activitySelection;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 「力扣」第 860 题：无重叠区间（中等）
 *
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 *
 * @author liuhp
 * @since 2022/5/9 13:22
 */
public class NoOverlappingArea {
    static {
        int[][] arry = new int[][] {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        Arrays.sort(arry, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
    }
}