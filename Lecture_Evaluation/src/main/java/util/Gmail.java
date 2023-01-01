package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

//	인증 수행을 도와주는 클래스를 상속
public class Gmail extends Authenticator {
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("rlawnsdnekt@gmail.com", "wwcdxxeswjkofgax");
	}

}
