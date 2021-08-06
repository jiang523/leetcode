package com.showsand.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * @author jiangwc33446*/
public class P5替换空格 {
}
class Solution5 {
    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<s.length();i++){
            if (" ".equals(String.valueOf(s.charAt(i)))){
                sb.append("%20");
            }else {
                sb.append(String.valueOf(s.charAt(i)));
            }
        }

        return sb.toString();
    }
//    public String replaceSpaceTwoPoint(String s) {
//        if (s==null || s.isEmpty()){
//            return null;
//        }
//        int oldLen = s.length();
//        for (int i=0;i<s.length();i++){
//            if (String.valueOf(s.charAt(i)).equals(" ")){
//                s+=" ";
//            }
//        }
//        int newLen = s.length();
//        for (int i=oldLen-1,j=newLen-1;i<j;i--){
//            if (!" ".equals(String.valueOf(s.charAt(i)))){
//                s.charAt(j--) = s.charAt(i);
//            }
//        }
//    }
}
