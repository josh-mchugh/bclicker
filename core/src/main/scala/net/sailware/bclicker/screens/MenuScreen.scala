package net.sailware.bclicker.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.OrthographicCamera
import net.sailware.bclicker.Main

class MenuScreen(
    val game: Main
) extends Screen:

  val camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight())

  override def show(): Unit =
    camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight())

  override def render(delta: Float): Unit =
    if game.batch.isDefined then
      game.batch.get.setProjectionMatrix(camera.combined)
      game.batch.get.begin()
      game.batch.get.end()
    else println("Game SpriteBatch is not configured")

  override def resize(width: Int, height: Int): Unit =
    camera.setToOrtho(false, width, height)

  override def pause(): Unit = {}
  override def resume(): Unit = {}
  override def hide(): Unit = {}
  override def dispose(): Unit = {}
