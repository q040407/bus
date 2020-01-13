/*
 * The MIT License
 *
 * Copyright (c) 2015-2020 aoju.org All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.aoju.bus.metric.consts;

/**
 * netty操作码
 *
 * @author Kimi Liu
 * @version 5.5.2
 * @since JDK 1.8++
 */
public enum NettyMode {

    /**
     * 同步本地API到配置中心
     */
    SYNC_APP_API,
    /**
     * 客户端连接成功
     */
    CLIENT_CONNECTED,
    /**
     * 下载限流配置
     */
    DOWNLOAD_LIMIT_CONFIG,
    /**
     * 更新限流配置
     */
    UPDATE_LIMIT_CONFIG,
    /**
     * 下载权限配置
     */
    DOWNLOAD_PERMISSION_CONFIG,
    /**
     * 更新权限配置
     */
    UPDATE_PERMISSION_CONFIG,
    /**
     * 下载秘钥配置
     */
    DOWNLOAD_SECRET_CONFIG,
    /**
     * 更新秘钥配置
     */
    UPDATE_SECRET_CONFIG,
    /**
     * 心跳检测
     */
    HEART_BEAT;

    public String getCode() {
        return this.name();
    }

}