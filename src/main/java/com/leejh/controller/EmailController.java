package com.leejh.controller;

import com.leejh.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
public class EmailController {
  @Autowired
  private JavaMailSender javaMailSender;

  @Value("${spring.mail.username}")
  private String from;

  @GetMapping("/sendEmail")
  public String sendEmail(Email email, MultipartFile file){
    MimeMessage message = javaMailSender.createMimeMessage();
    try{
      MimeMessageHelper helper = new MimeMessageHelper(message,true);
      helper.setFrom(from);
      helper.setTo(email.getReceiver());
      helper.setSubject(email.getSubject());
      helper.setText(email.getContent(),true);

      String fileName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

      helper.addAttachment(fileName, file);
      javaMailSender.send(message);
    }catch (MessagingException e){
      e.printStackTrace();
      return "发送失败";
    }
    return "发送成功";


  }


}
