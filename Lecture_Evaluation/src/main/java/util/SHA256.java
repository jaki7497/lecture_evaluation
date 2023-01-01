package util;

import java.security.MessageDigest;

public class SHA256 {
	
	//	사용자가 입력한 값을 SHA256 해쉬 알고리즘으로 암호화 하는 기능
	public static String getSHA256 (String input) {
		StringBuffer result = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] salt = "Hello! This is Salt.".getBytes();	// salt = 보안을 위해 추가되는 값
			digest.reset();
			digest.update(salt);
			byte[] chars = digest.digest(input.getBytes("UTF-8"));
			for (int i = 0; i < chars.length; i++) {
				String hex = Integer.toHexString(0xff & chars[i]);
				if (hex.length() == 1) result.append("0");
				result.append(hex);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

}
