package com.pokors.greedy.getChange;

/**
 * 「力扣」第 860 题：柠檬水找零（简单）
 *
 * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
 * 注意，一开始你手头没有任何零钱。
 * 如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
 *
 * @author liuhp
 * @since 2022/5/9 11:59
 */
public class LemonadeChange {

    /**
     * 时间复杂度：O(N)，其中 N 是 bills 的长度。
     * 空间复杂度：O(1)。
     *
     * @param bills 0 <= bills.length <= 10000；bills[i] 不是 5 就是 10 或是 20
     * @return boolean
     */
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five > 2) {
                    five = five - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 这道问题之所以可以使用「贪心算法」，完全是因为可以选择的钞票面值只有 55 美元，1010 美元和 2020 美元。大家还可以完成「力扣」第 322 题（零钱兑换），思考这道问题为什么不可以使用贪心算法。
     *
     * @param args
     */
    public static void main(String[] args) {

    }

}