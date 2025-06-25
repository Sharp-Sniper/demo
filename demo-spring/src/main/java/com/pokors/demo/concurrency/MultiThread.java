package com.pokors.demo.concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 使用JMX来查看一个普通的Java程序包含哪些线程
 *  输出：
 *  [6]  Monitor Ctrl-Break // IntelliJ IDEA执行代码的时候，实际是通过反射方式去调用，而与此同时会创建一个Monitor Ctrl-Break 用于监控目的。
 *  [5]  Attach Listener // 负责接收到外部的命令，而对该命令进行执行的并且把结果返回给发送者。通常我们会用一些命令去要求 jvm 给我们一些反馈信息。
 * 如：java -version、jmap、jstack 等等。如果该线程在 jvm 启动的时候没有初始化，那么，则会在用户第一次执行 jvm 命令时，得到启动。
 *  [4]  Signal Dispatcher // 分发处理发送给JVM信号的线程
 *  [3]  Finalizer // 调用对象finalize方法的线程
 *  [2]  Reference Handler // 清除Reference的线程
 *  [1]  main // main线程，用户程序入口
 *
 * @author lhp
 * @since 2023/5/4 14:57
 */
public class MultiThread {
    public static void main(String[] args) {
        // 获取Java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程ID和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "]  " + threadInfo.getThreadName());
        }
    }
}
