package net.sailware.bclicker.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.OrthographicCamera
import net.sailware.bclicker.Main
import net.sailware.bclicker.components.Menu
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.graphics.Color

class MenuScreen(
    val game: Main
) extends Screen:

  val camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight())
  val menu = new Menu(game.font.get, Array("Play", "Exit"))

  override def show(): Unit =
    camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight())

  override def render(delta: Float): Unit =
    ScreenUtils.clear(Color.BLACK)
    menu.update()

    if game.batch.isDefined then
      game.batch.get.setProjectionMatrix(camera.combined)
      game.batch.get.begin()
      menu.render(game.batch.get, true, true, camera.viewportWidth /2F, camera.viewportHeight - 100, 0F, -30F)
      game.batch.get.end()
    else println("Game SpriteBatch is not configured")

  override def resize(width: Int, height: Int): Unit =
    camera.setToOrtho(false, width, height)

  override def pause(): Unit = {}
  override def resume(): Unit = {}
  override def hide(): Unit = {}
  override def dispose(): Unit = {}
