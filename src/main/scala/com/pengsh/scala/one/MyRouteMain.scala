package com.pengsh.scala.one


import org.apache.spark.{SparkConf, SparkContext}

/**
 * A Main to run Camel with MyRouteBuilder
 */
object MyRouteMain  {

  def main(args: Array[String]) {
    val sparkConf=new SparkConf().setAppName("cehsi").setMaster("local[1]")
    val sparkContext=new SparkContext(sparkConf)
    sparkContext.textFile("").flatMap(line => line.split(""))
  }
}

