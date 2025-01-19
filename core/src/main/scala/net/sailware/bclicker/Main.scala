package net.sailware.bclicker

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import net.sailware.bclicker.util.FontUtil

class Main extends Game:

  var batch: Option[SpriteBatch] = None
  var font: Option[BitmapFont] = None

  override def create(): Unit =
    FontUtil.init()
    font = FontUtil.komika
    batch = Some(SpriteBatch())
    setScreen(FirstScreen())

  override def render(): Unit =
    super.render()

  override def dispose(): Unit =
    super.dispose()
    if batch.isDefined then batch.get.dispose()
    if font.isDefined then font.get.dispose()

class FirstScreen extends Screen:

  override def show(): Unit = {  }
  override def render(delta: Float): Unit = {  }
  override def resize(width: Int, height: Int): Unit = {  }
  override def pause(): Unit = { }
  override def resume(): Unit = {  }
  override def hide(): Unit = {  }
  override def dispose(): Unit = {  }
