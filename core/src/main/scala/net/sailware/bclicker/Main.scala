package net.sailware.bclicker

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.g2d.BitmapFont
import net.sailware.bclicker.util.FontUtil

class Main extends Game:

  var font: Option[BitmapFont] = None

  override def create(): Unit =
    FontUtil.init()
    font = FontUtil.komika
    setScreen(FirstScreen())

class FirstScreen extends Screen:

  override def show(): Unit = {  }
  override def render(delta: Float): Unit = {  }
  override def resize(width: Int, height: Int): Unit = {  }
  override def pause(): Unit = { }
  override def resume(): Unit = {  }
  override def hide(): Unit = {  }
  override def dispose(): Unit = {  }
