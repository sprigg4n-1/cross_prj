package com.example.demo.classes;

public class PC {
  private String CPU;

  private String GPU;

  private String Motherboard;

  private String RAM;

  private String HardDrive;

  private String Power;

  private String Case;

  private String OS;

  private int price;

  private String link;

  public PC(
      String CPU,
      String GPU,
      String Motherboard,
      String RAM,
      String HardDrive,
      String Power,
      String Case,
      String OS,
      int price,
      String link) {
    this.CPU = CPU;
    this.GPU = GPU;
    this.Motherboard = Motherboard;
    this.RAM = RAM;
    this.HardDrive = HardDrive;
    this.Power = Power;
    this.Case = Case;
    this.OS = OS;
    this.CPU = CPU;
    this.price = price;
    this.link = link;
  }

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String cPU) {
    CPU = cPU;
  }

  public String getGPU() {
    return GPU;
  }

  public void setGPU(String gPU) {
    GPU = gPU;
  }

  public String getMotherboard() {
    return Motherboard;
  }

  public void setMotherboard(String motherboard) {
    Motherboard = motherboard;
  }

  public String getRAM() {
    return RAM;
  }

  public void setRAM(String rAM) {
    RAM = rAM;
  }

  public String getHardDrive() {
    return HardDrive;
  }

  public void setHardDrive(String hardDrive) {
    HardDrive = hardDrive;
  }

  public String getPower() {
    return Power;
  }

  public void setPower(String power) {
    Power = power;
  }

  public String getCase() {
    return Case;
  }

  public void setCase(String case1) {
    Case = case1;
  }

  public String getOS() {
    return OS;
  }

  public void setOS(String oS) {
    OS = oS;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

}
