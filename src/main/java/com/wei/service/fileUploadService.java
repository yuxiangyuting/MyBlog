package com.wei.service;

/**
 * @author lmz
 */
public interface fileUploadService {
    /**
     *上传文件
     * @param fileByte 文件字节数组
     * @return 文件路径
     */
    String saveBytes(byte[] fileByte);

    /**
     * 加载文件
     * @param key 文件路径
     * @return 字节数组
     */
    byte[] loadBytes(String key);
}
