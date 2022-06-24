package com.pokors.demo.jvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 创建线程导致内存溢出异常
 *
 * @author liuhp
 * @since 2022/6/22 16:10
 */
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() { dontStop(); }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}