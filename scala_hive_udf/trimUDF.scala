// trimUDF.scala
package example

import org.apache.hadoop.hive.ql.exec.UDF

class Scala_Hive_Udf extends UDF {

  def evaluate(str: String): String = {
    str.trim
  }

}

