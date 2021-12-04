package com.docsconsole.tutorials.resource;

import com.docsconsole.tutorials.service.AttachedMailService;
import com.docsconsole.tutorials.service.SimpleMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/mail-app/api")
public class MailController {

    @Autowired
    SimpleMailService simpleMailService;
    @Autowired
    AttachedMailService attachedMailService;

    @GetMapping("/sendMail")
    public void sendMail(){
        simpleMailService.sendSimpleMessage("tomygmail@gmail.com","test Spring boot Mail", "hi, How are you");
    }

    @GetMapping("/sendMailWithAttachment")
    public void sendMailWithAttachment() throws MessagingException {
        attachedMailService.sendMessageWithAttachment("tomygmail@gmail.com","test Spring boot Mail", "hi, How are you","D:\\docsconsole-git-master\\springboot-master\\Spring-Boot-Email-Example-App\\src\\main\\resources\\teatAttachment.text");
    }

}
