package com.creatifcubed.minesvr.models;

/**
 * Based off http://semver.org/ and https://github.com/Raekye/SimpleAPI-Java
 */
class SemVer(verStr: String) {
  private val separateMetadata = verStr.split("\\+");
  private val separatePrerelease = separateMetadata(0).split("-");
  private val verArr = separatePrerelease(0).split("\\.");
  val major = verArr(0).toInt;
  val minor = verArr(1).toInt;
  val patch = verArr(2).toInt;
  val prerelease = if (separatePrerelease.length > 0) separatePrerelease(1) else null;
  val metadata = if (separateMetadata.length > 0) separateMetadata(1) else null;
  override def toString(): String = {
    return "" + major + "." + minor + "." + patch + "-" + prerelease + "+" + metadata;
  }
}