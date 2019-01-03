package com.dayang.newmedia.common.utils;

public class PoweretcUtil {

	/**
	 * 如何判断一个非负整数是否是2的幂:
	 * 	如果是2的幂，则返回true；否则返回false
	 * @author lbx
	 * @param n
	 * @return
	 */
	public static boolean powerof2(int n){
        return ((n & (n -1)) == 0);
    }
}
