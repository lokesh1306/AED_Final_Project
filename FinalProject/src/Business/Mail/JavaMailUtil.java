/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Mail;

/**
 *
 * @author admin
 */
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

public class JavaMailUtil {
    public static void sendMail(String recepientMail, String recepientName , String verificationCode) throws Exception {
        System.out.println("Preparing to send an email");
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "sivanagendramarada@gmail.com";
        String password = "updudbwcotsjvotd";

        Session session = Session.getInstance(properties, new Authenticator() {
            

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        Message message = prepareMessage(session, myAccountEmail, recepientMail, recepientName,verificationCode);

        Transport.send(message);
        System.out.println("Hurray "+"Mail sent successfully");
    }

    public static Message prepareMessage(javax.mail.Session session, String myAccountEmail, String recepientMail, String recepientName,String verificationCode) {
        try {
            javax.mail.Message message = new javax.mail.internet.MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientMail));
            message.setSubject("Account activation mail from Food Donation");
            message.setText("Hi " + recepientName + ". Welcome to the family of Food Donation.\n Please verify your account with this code:"+verificationCode);
            return message;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
public static String getRandomCode(){
    Random rnd = new Random();
    int num = rnd.nextInt(999999);
    return String.format("%06d",num);
}
    
}

