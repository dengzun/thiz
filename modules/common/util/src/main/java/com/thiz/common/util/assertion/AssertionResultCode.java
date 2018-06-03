package com.thiz.common.util.assertion;

/**
 * 异常断言结果码
 *
 * @author dengzun.dz
 * @version $Id: AssertionResultCode.java, v 0.1 2018年06月03日 下午4:24 dengzun.dz Exp $
 */
public interface AssertionResultCode {

    /**
     * 获取结果码Code。
     *
     * @return 结果码
     */
    String getResultCode();

    /**
     * 获取结果码描述信息。
     *
     * @return 描述信息
     */
    String getResultMsg();
}
