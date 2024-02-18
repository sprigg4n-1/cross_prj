package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.classes.PC;
import com.example.demo.classes.SocialNetwork;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class DemoController {

        @GetMapping
        public String index(Model model) {
                // map
                Map<String, String> languageLinks = new HashMap<>();
                languageLinks.put("Python", "https://www.python.org/");
                languageLinks.put("TypeScript", "https://www.typescriptlang.org/");
                languageLinks.put("Kotlin", "https://kotlinlang.org/");
                languageLinks.put("NextJS",
                                "https://nextjs-org.translate.goog/?_x_tr_sl=en&_x_tr_tl=ru&_x_tr_hl=ru&_x_tr_pto=sc&_x_tr_hist=true");

                // list
                List<SocialNetwork> sns = new ArrayList<>();
                List<PC> pcs = new ArrayList<>();
                pcs.add(new PC("AMD Ryzen 5 5600X", "NVIDIA GeForce GTX 1660 Super", "MSI B550M PRO-VDH WIFI",
                                "Corsair Vengeance LPX 16 ГБ DDR4 3200 МГц", "Kingston A2000 500 ГБ NVMe SSD",
                                "EVGA 600 W1, 80+ WHITE 600W", "NZXT H510", "Windows 11 Home", 999,
                                "https://www.mifcom.de/media/catalog/product/cache/1/image/365x/9df78eab33525d08d6e5fb8d27136e95/r/y/ryzen7000_5000d.jpg"));
                pcs.add(new PC("AMD Ryzen 7 5800X", "NVIDIA GeForce RTX 3070", "ASUS ROG Strix B550-F Gaming",
                                "G.Skill Trident Z RGB 32 ГБ (2 x 16 ГБ) DDR4 3600 МГц",
                                "Samsung 970 EVO Plus 1 ТБ NVMe SSD", "Corsair RM750x 80+ Gold 750W",
                                "Phanteks Eclipse P400A Digital", "Windows 11 Pro", 1999,
                                "https://www.mifcom.de/media/catalog/product/cache/1/image/365x/9df78eab33525d08d6e5fb8d27136e95/i/m/img_0013_2_10.jpg"));

                sns.add(new SocialNetwork("Facebook",
                                "Facebook is a social network operated by the American company Meta Platforms . It is the most used social network in the world.",
                                "Mark Zuckerberg", "https://www.facebook.com/"));
                sns.add(new SocialNetwork("LinkedIn",
                                "LinkedIn is a business and employment-focused social media platform that works through websites and mobile apps",
                                "Reid Hoffman", "https://www.linkedin.com/"));
                sns.add(new SocialNetwork("Reddit",
                                "Reddit is an American social news aggregation, content rating, and forum social network.",
                                "Steve Huffman", "https://www.reddit.com/"));
                sns.add(new SocialNetwork("Twitter",
                                "X, formerly and colloquially known as Twitter, is a social media website based in the United States",
                                "Jack Dorsey", "https://twitter.com/"));

                model.addAttribute("pageTitle", "Hello spring");
                model.addAttribute("lang", "language");
                model.addAttribute("maps", languageLinks);
                model.addAttribute("sns", sns);
                model.addAttribute("pcs", pcs);
                model.addAttribute("price", 1500);

                return "index";
        }

}
