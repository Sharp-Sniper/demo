package com.pokors.demo.jvm;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Java堆溢出
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author liuhp
 * @since 2022/6/20 11:47
 */
public class HeapOOM {
    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}