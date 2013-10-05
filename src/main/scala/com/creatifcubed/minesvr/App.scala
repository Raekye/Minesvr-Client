package com.creatifcubed.minesvr;

/**
 * @author ${user.name}
 */
object App {
  val MINESVR_NAME = "Minesvr Client";
  val MINESVR_VERSION = "0.0.1";
  
  def main(args : Array[String]):Unit = {
    if (args.length < 1) {
      help();
    }
  }
  
  def help(): Unit = {
    version();
    println("Usage:");
    println("--version, -v");
    println("--help, -h");
    println("backup");
    println("config <key <value>>");
    println("push");
    println("pull");
    println("auto");
  }
  
  def version(): Unit = {
    println(MINESVR_NAME + " " + MINESVR_VERSION);
  }
  
  def backup(): Unit = {
    
  }
  
  def push(): Unit = {
    
  }
  
  def pull(): Unit = {
    
  }
  
  def auto(): Unit = {
    println("Use <ctrl> + c to quit");
  }
}
