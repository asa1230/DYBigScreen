package com.dayang.newmedia.common.utils;

import com.dayang.verify.DYProductVerifyClient;
import com.dayang.verify.ProductLicense;

public class CheckDog {
	
	/*
	 * 验证加密狗:
	 * 1、加密狗验证通过，返回true
	 * 2、未启用加密狗，返回true
	 * 3、加密狗验证失败，返回false
	 */
	public boolean checkDog() {
		boolean haveDog = false;
		
		if(Constants.NEED_DOG){
			ProductLicense license = DYProductVerifyClient.verifyProductKey(null,0x06020401);
	        //检测产品加密点是否有效
	        if (license.getStatus() == 0){
	            System.out.println("Verify Success with Name["+license. getProductName()+"]");
	        	haveDog = true;
	        }else
	            System.out.println("Verify Failure!");
		}else{
			haveDog = true;
		}
		return haveDog;
	}
	

	public static void main(String[] args) {
		ProductLicense license = DYProductVerifyClient.verifyProductKey(null,268501249);
        //检测产品加密点是否有效
        if (license.getStatus() == 0){
            System.out.println("Verify Success with Name["+license. getProductName()+"]");
        }else
            System.out.println("Verify Failure!");
	}

}
