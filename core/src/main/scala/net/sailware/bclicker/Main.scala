package net.sailware.bclicker

import com.badlogic.gdx.Game
import com.badlogic.gdx.Screen

class Main extends Game:

  override def create(): Unit =
    setScreen(FirstScreen())

class FirstScreen extends Screen:

  override def show(): Unit = {  }
  override def render(delta: Float): Unit = {  }
  override def resize(width: Int, height: Int): Unit = {  }
  override def pause(): Unit = { }
  override def resume(): Unit = {  }
  override def hide(): Unit = {  }
  override def dispose(): Unit = {  }
