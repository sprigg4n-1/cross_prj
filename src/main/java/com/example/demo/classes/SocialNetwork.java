package com.example.demo.classes;

public class SocialNetwork {
  private String name;

  private String desc;

  private String author;

  private String link;

  public SocialNetwork(String name, String desc, String author, String link) {
    this.name = name;
    this.desc = desc;
    this.author = author;
    this.link = link;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

}
