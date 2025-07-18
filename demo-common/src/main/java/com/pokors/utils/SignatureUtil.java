/**
 * Project: alibaba-open_api-framework
 *
 * File Created at 2009-12-11
 * $Id: SignatureUtil.java 410052 2015-05-06 08:18:05Z hongbang.hb $
 *
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.pokors.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * SignatureUtil
 *
 * @author yuming.wangym
 */
public final class SignatureUtil {
	public static final String HMAC_SHA1 = "HmacSHA1";
	public static final String CHARSET_NAME_UTF8 = "UTF-8";
	public static final Charset CHARSET_UTF8 = Charset.forName(CHARSET_NAME_UTF8);
	public static final char[] digital = "0123456789ABCDEF".toCharArray();

	private static SecretKeySpec buildKey(byte[] key) {
		return new SecretKeySpec(key, HMAC_SHA1);
	}

	public static String encodeHexStr(final byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		StringBuilder str = new StringBuilder(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			str.append(digital[(bytes[i] & 0xf0) >> 4]);
			str.append(digital[bytes[i] & 0x0f]);
		}
		return str.toString();
	}

	public static byte[] hmacSha1(String path, Map<String, Object> parameters, String signingKey) {
		Mac mac;
		try {
			mac = Mac.getInstance(HMAC_SHA1);
			mac.init(buildKey(toBytes(signingKey)));
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e.getMessage(), e);
		} catch (InvalidKeyException e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
		mac.update(path.getBytes(CHARSET_UTF8));
		List<String> parameterToSort = new ArrayList<String>();
		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			parameterToSort.add(entry.getKey() + entry.getValue());
		}
		Collections.sort(parameterToSort);
		for (String paramToSign : parameterToSort) {
			mac.update(paramToSign.getBytes(CHARSET_UTF8));
		}
		return mac.doFinal();
	}

	public static byte[] hmacSha1(Map<String, Object> parameters, String signingKey) {
		Mac mac;
		try {
			mac = Mac.getInstance(HMAC_SHA1);
			mac.init(buildKey(toBytes(signingKey)));
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e.getMessage(), e);
		} catch (InvalidKeyException e) {
			throw new IllegalStateException(e.getMessage(), e);
		}
		List<String> parameterToSort = new ArrayList<String>();
		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			parameterToSort.add(entry.getKey() + entry.getValue());
		}
		Collections.sort(parameterToSort);
		for (String paramToSign : parameterToSort) {
			mac.update(paramToSign.getBytes(CHARSET_UTF8));
		}
		return mac.doFinal();
	}

	private static byte[] toBytes(final String str) {
		if (str == null) {
			return null;
		}
		try {
			return str.getBytes(CHARSET_NAME_UTF8);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static String hmacSha1ToHexStr(byte[] data, byte[] key, int offset, int len) {
		byte[] rawHmac = hmacSha1(data, key, offset, len);
		return encodeHexStr(rawHmac);
	}

	public static byte[] hmacSha1(byte[] data, byte[] key, int offset, int len) {
		SecretKeySpec signingKey = new SecretKeySpec(key, HMAC_SHA1);
		Mac mac = null;
		try {
			mac = Mac.getInstance(HMAC_SHA1);
			mac.init(signingKey);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e.getMessage(), e);
		} catch (InvalidKeyException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		mac.update(data, offset, len);
		return mac.doFinal();
	}

	public static String hmacSha1ToBase64(byte[] data, String securityKey) {
		if(null == data || null == securityKey){
			return null;
		}
		byte[] securityKeyBytes = securityKey.getBytes(CHARSET_UTF8);

		byte[] hmacSha1 = hmacSha1(data, securityKeyBytes, 0, data.length);

		// 明确Base64不换行
		return newStringUtf8(Base64.encodeBase64(hmacSha1, false),CHARSET_UTF8);
	}

	public static String newStringUtf8(byte[] bytes,Charset charset){
		return bytes == null ? null : new String(bytes, charset);
	}
}
