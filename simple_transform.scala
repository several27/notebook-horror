/**
 * Imports
 */
import $ivy.`org.apache.spark::spark-sql:3.2.1`
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql._
import org.apache.spark.sql.functions.rand

/**
 * Spark Setup
 */
Logger.getLogger("org").setLevel(Level.OFF)
val spark = SparkSession.builder().master("local[*]").getOrCreate()

/**
 * Application Logic
 */
val df = spark.range(10).select(rand().as("value"))
df.show()
















