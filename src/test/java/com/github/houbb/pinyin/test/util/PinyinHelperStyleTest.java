package com.github.houbb.pinyin.test.util;

import com.github.houbb.pinyin.constant.enums.PinyinStyleEnum;
import com.github.houbb.pinyin.util.PinyinHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author binbin.hou
 * @since 0.0.1
 */
public class PinyinHelperStyleTest {

    /**
     * 默认格式-中文测试
     * @since 0.0.3
     */
    @Test
    public void toPinyinDefaultTest() {
        String pinyin = PinyinHelper.toPinyin("我爱中文");
        Assert.assertEquals("wǒ ài zhōng wén", pinyin);
    }

    /**
     * 默认格式-中文测试
     * @since 0.0.3
     */
    @Test
    public void toPinyinDefault2Test() {
        String pinyin = PinyinHelper.toPinyin("我爱中文", PinyinStyleEnum.DEFAULT);
        Assert.assertEquals("wǒ ài zhōng wén", pinyin);
    }


    /**
     * 普通格式-中文测试
     * @since 0.0.3
     */
    @Test
    public void toPinyinNormalTest() {
        String pinyin = PinyinHelper.toPinyin("我爱中文", PinyinStyleEnum.NORMAL);
        Assert.assertEquals("wo ai zhong wen", pinyin);
    }

    /**
     * 数字标注在最后格式-中文测试
     * @since 0.0.3
     */
    @Test
    public void toPinyinNumLastTest() {
        String pinyin = PinyinHelper.toPinyin("我爱中文", PinyinStyleEnum.NUM_LAST);
        Assert.assertEquals("wo3 ai4 zhong1 wen2", pinyin);
    }

    /**
     * 首字母格式-中文测试
     * @since 0.0.3
     */
    @Test
    public void toPinyinFirstLetterTest() {
        String pinyin = PinyinHelper.toPinyin("我爱中文", PinyinStyleEnum.FIRST_LETTER);
        Assert.assertEquals("w a z w", pinyin);
    }

}