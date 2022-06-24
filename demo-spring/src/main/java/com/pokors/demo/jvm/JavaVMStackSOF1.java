package com.pokors.demo.jvm;

/**
 * Java虚拟机栈溢出
 * -Xss128k
 *
 * @author liuhp
 * @since 2022/6/22 14:29
 */
public class JavaVMStackSOF1 {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF1 oom = new JavaVMStackSOF1();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println(" stack length:" + oom.stackLength);
            throw e;
        }
    }
}