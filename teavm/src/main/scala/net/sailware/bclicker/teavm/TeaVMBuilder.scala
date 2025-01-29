package net.sailware.bclicker.teavm

import com.github.xpenatan.gdx.backends.teavm.config.AssetFileHandle
import com.github.xpenatan.gdx.backends.teavm.config.TeaBuilder
import com.github.xpenatan.gdx.backends.teavm.config.TeaBuildConfiguration
import com.github.xpenatan.gdx.backends.teavm.config.plugins.TeaReflectionSupplier
import com.github.xpenatan.gdx.backends.teavm.gen.SkipClass
import java.io.File
import org.teavm.vm.TeaVMOptimizationLevel

@SkipClass
object TeaVMBuilder:

  def main(args: Array[String]): Unit =
    val buildConfig = TeaBuildConfiguration()
    buildConfig.assetsPath.add(AssetFileHandle("../assets"))
    buildConfig.webappPath = File("build/dist").getCanonicalPath()

    //TeaReflectionSupplier.addReflectionClass("")

    val tool = TeaBuilder.config(buildConfig)
    tool.setMainClass("net.sailware.bclicker.teavm.TeaVMLauncher")
    tool.setOptimizationLevel(TeaVMOptimizationLevel.FULL)
    tool.setObfuscated(false)
    TeaBuilder.build(tool)
