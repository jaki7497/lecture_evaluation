package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

//	���� ������ �����ִ� Ŭ������ ���
public class Gmail extends Authenticator {
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("rlawnsdnekt@gmail.com", "wwcdxxeswjkofgax");
	}

}
