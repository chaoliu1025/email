package org.lc.email;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class EmailUtil {

	/*发件服务器*/
	private static String hostName = "smtp.163.com";
	/*发件服务器端口*/
	private static Integer smtpPort = 25;
	/*用户名*/
	private static String username = "chaoliu1025@163.com";
	/*密码*/
	private static String password = "chao1637569";
	/*发件人 email*/
	private static String fromEmail = "chaoliu1025@163.com";
	/*收件人 email*/
	private static String[] destEmails = new String[]{"liuchao@ycmedia.cn","272533762@qq.com"};
	/*邮件主题*/
	private static String subject = "TestMail";
	/*邮件内容*/
	private static String msg = "This is a test mail ... :-)";
	
	
	
	public static void send(){
		try {
			Email email = new SimpleEmail();
			email.setHostName(hostName);
			email.setSmtpPort(smtpPort);
			email.setAuthenticator(new DefaultAuthenticator(username, password));
			email.setSSLOnConnect(true);
			email.setFrom(fromEmail);
			email.setSubject(subject);
			email.setMsg(msg);
			email.addTo(destEmails);
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		send();
	}
}
