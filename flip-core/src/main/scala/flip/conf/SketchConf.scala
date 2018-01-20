package flip.conf

trait SketchConf extends DataBinningDistConf {
  val mixingRatio: Double
  val dataKernelWindow: Double
  val boundaryCorrection: Double
  val decayFactor: Double
  val cmap: CmapConf
  val counter: CounterConf
}

object SketchConf {

  def default: SketchConf = DefaultSketchConf

}
