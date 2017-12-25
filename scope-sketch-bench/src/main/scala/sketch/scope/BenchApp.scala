package sketch.scope

import java.io.{File, FileOutputStream}

import com.github.nscala_time.time.Imports._
import org.openjdk.jmh.infra.BenchmarkParams
import org.openjdk.jmh.results.{Result => BenchResult, RunResult}
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options._

import scala.collection.JavaConverters._

/**
  * Licensed by Probe Technology, Inc.
  */
object BenchApp {

  def main(args: Array[String]): Unit = {

    // confs
    val opts = BenchAppConfs.envOptions
      .param("iterateBenchSize", (0 to 0 by 10).map(_.toString).toArray: _*)
      .build()

    // run
    val results = new Runner(opts).run().asScala

    // results
    val path = "benchmarks"
    BenchOutOps.write(path, results)
  }

}

object BenchAppConfs {

  val warmup = 3
  val measurement = 5
  val thread = 1
  val fork = 1

  def envOptions: ChainedOptionsBuilder = {
    new OptionsBuilder()
      .warmupIterations(BenchAppConfs.warmup)
      .measurementIterations(BenchAppConfs.measurement)
      .threads(BenchAppConfs.thread)
      .forks(BenchAppConfs.fork)
  }

}