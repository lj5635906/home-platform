package com.home.common.web.validate.code;

import java.awt.image.BufferedImage;

/**
 * 验证码响应数据
 *
 * @author roger
 * @email 190642964@qq.com
 * @create 2018-07-12 18:52
 **/
public class ValidateCodeVo {

    public ValidateCodeVo(String random) {
        this.random = random;
    }

    public ValidateCodeVo(String random, String image) {
        this.random = random;
        this.image = image;
    }

    /**
     * 随机数
     */
    private String random;

    /**
     * 图片
     */
    private String image;

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
