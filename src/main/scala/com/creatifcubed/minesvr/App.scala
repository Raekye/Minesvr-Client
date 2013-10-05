package com.creatifcubed.minesvr;

import java.util.Date;
import com.creatifcubed.minesvr.models.{Snapshot, SemVer, SemVerSerializer};
import com.google.gson.GsonBuilder;

/**
 * @author ${user.name}
 */
object App {
  val MINESVR_NAME = "Minesvr Client";
  val MINESVR_VERSION = new SemVer("0.0.1");
  
  def main(args : Array[String]):Unit = {
    val s = new Snapshot(new Date(), "1-2-3-backup", false, false, new SemVer("1.2.3-alpha+meta"));
    val gson = new GsonBuilder().registerTypeAdapter(classOf[SemVer], new SemVerSerializer()).create();
    println(gson.toJson(s));
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
  
  def load(): Unit = {
    // open config file
    // open ignore file
    // open saved snapshots
  }
}
