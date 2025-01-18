package net.sailware.bclicker.util

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.loaders.BitmapFontLoader
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator

object FontUtil:

  var komika: Option[BitmapFont] = None
  var komika20: Option[BitmapFont] = None
  var komika15: Option[BitmapFont] = None
  var komika10: Option[BitmapFont] = None
  var komika8: Option[BitmapFont] = None

  def init(): Unit =
    val generator = FreeTypeFontGenerator(Gdx.files.internal("fonts/KOMTITK_.ttf"))
    komika = Some(generator.generateFont(createParameter(30)))
    komika20 = Some(generator.generateFont(createParameter(20)))
    komika15 = Some(generator.generateFont(createParameter(15)))
    komika10 = Some(generator.generateFont(createParameter(10)))
    komika8 = Some(generator.generateFont(createParameter(8)))

  private def createParameter(size: Int): FreeTypeFontGenerator.FreeTypeFontParameter =
    val parameter = FreeTypeFontGenerator.FreeTypeFontParameter()
    parameter.size
    parameter
