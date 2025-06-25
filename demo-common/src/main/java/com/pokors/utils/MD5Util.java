package com.pokors.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * MD5工具类
 *
 * @author lhp
 * @since 2024/4/19 10:24
 */
public class MD5Util {

    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * md5（小写）
     *
     * @param list1
     * @param list2
     * @return
     */
    public static String md5(List<String> list1, List<byte[]> list2) {
        if ((list1 == null || list1.isEmpty()) && (list2 == null || list2.isEmpty())) {
            return null;
        }
        List<String> md5List = new ArrayList<>();
        if (list1 != null && !list1.isEmpty()) {
            for (String str : list1) {
                md5List.add(md5String(str));
            }
        }

        if (list2 != null && !list2.isEmpty()) {
            for (byte[] bytes : list2) {
                md5List.add(md5ByteArray(bytes));
            }
        }

        Collections.sort(md5List);
        String md5Str = String.join("", md5List);
        return md5String(md5Str);
    }

    /**
     * MD5多字符串
     *
     * @param list
     * @return
     */
    public static String md5MultiString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> md5List = new ArrayList<>();
        for (String str : list) {
            md5List.add(md5String(str));
        }
        Collections.sort(md5List);
        String md5Str = String.join("", md5List);
        return md5String(md5Str);
    }

    private static String md5String(String str) {
        if (str == null) {
            return null;
        }
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        return new String(encodeHex(getMd5Digest().digest(data), DIGITS_LOWER));
    }

    /**
     * MD5多字节数组
     *
     * @param list
     * @return
     */
    public static String md5MultiByteArray(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> md5List = new ArrayList<>();
        for (byte[] bytes : list) {
            md5List.add(md5ByteArray(bytes));
        }
        Collections.sort(md5List);
        String md5Str = String.join("", md5List);
        return md5String(md5Str);
    }

    private static String md5ByteArray(byte[] array) {
        if (array == null) {
            return null;
        }
        return new String(encodeHex(getMd5Digest().digest(array), DIGITS_LOWER));
    }

    private static char[] encodeHex(final byte[] data, final char[] toDigits) {
        final int l = data.length;
        final char[] out = new char[l << 1];
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
        return out;
    }

    private static MessageDigest getMd5Digest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("文本1", "文本2");
        System.out.println(md5MultiString(list));

        List<byte[]> list2 = Arrays.asList("资源2".getBytes(), "资源1".getBytes());
        System.out.println(md5MultiByteArray(list2));

        // 输出1
        // [a13a2fa224ca5b6f44d5aee33ec29d58, 37dd6f28ffb87d8907a286e0ef4dc7fe]
        // [37dd6f28ffb87d8907a286e0ef4dc7fe, a13a2fa224ca5b6f44d5aee33ec29d58]
        // 37dd6f28ffb87d8907a286e0ef4dc7fea13a2fa224ca5b6f44d5aee33ec29d58
        // 3255c001a48bfecfd004b04ad8d63be6
        //
        // 输出2
        // [aff965880c4f2640ce78f6f6051811b2, 05d55e34b950e916ae852872c1d48f35]
        // [05d55e34b950e916ae852872c1d48f35, aff965880c4f2640ce78f6f6051811b2]
        // 05d55e34b950e916ae852872c1d48f35aff965880c4f2640ce78f6f6051811b2
        // f7f14b7acbdae89649aba8de8466ba53

        System.out.println(md5(list, list2));
        // 33fb945c239e1d45932ccc8d0ce4d7a4
    }
}
