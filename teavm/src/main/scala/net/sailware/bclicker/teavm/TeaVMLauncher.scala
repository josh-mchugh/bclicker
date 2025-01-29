package net.sailware.bclicker.teavm

import com.github.xpenatan.gdx.backends.teavm.TeaApplication
import com.github.xpenatan.gdx.backends.teavm.TeaApplicationConfiguration
import net.sailware.bclicker.Main

object TeaVMLauncher:

  def main(args: Array[String]): Unit =
    val config = TeaApplicationConfiguration("canvas")
    config.width = -1
    config.height = -1
    config.showDownloadLogs = true

    config.preloadListener = { assetLoader =>
      assetLoader.loadScript("freetype.js")
    }

    new TeaApplication(new Main(), config)
