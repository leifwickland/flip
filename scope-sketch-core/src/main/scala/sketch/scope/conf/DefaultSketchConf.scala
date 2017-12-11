package sketch.scope.conf

/**
  * Licensed by Probe Technology, Inc.
  */
object DefaultSketchConf extends SketchConf {

  val cmap: CmapConf = CmapConf.uniform(1000, 10, Double.MinValue, Double.MaxValue)

  val counter: CounterConf = CounterConf.apply(200, 2)

}
