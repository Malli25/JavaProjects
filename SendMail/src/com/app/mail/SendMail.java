package com.app.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class SendMail {

	public static void send(String to, String subject,String msg, 
			final String user, final String pass){
		
	Properties props = new Properties();
	
	props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");		
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
		
    Session mailsession = Session.getInstance(props, new javax.mail.Authenticator(){
    	
    	protected PasswordAuthentication getPasswordAuthentication(){
    		
    		return new PasswordAuthentication(user,pass);
    	}
    	
    });
   
    MimeMessage message = new MimeMessage(mailsession);
    
    try {
		message.setFrom(new InternetAddress(user));
		message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
		message.setSubject(subject);
		message.setText(msg);
		
		Transport.send(message);
	} catch (AddressException e) {
		e.printStackTrace();
	} catch (MessagingException e) {
		e.printStackTrace();
	}
    
      
	}
	
	
}
