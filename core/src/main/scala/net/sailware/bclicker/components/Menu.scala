package net.sailware.bclicker.components

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class Menu(
  val font: BitmapFont,
  val items: Array[String],
):
  var selection: Option[Int] = None
  val layouts = items.map(item => GlyphLayout(font, item))

  def update(): Unit =
    if Gdx.input.isKeyJustPressed(Input.Keys.UP) then changeSelection(true)
    if Gdx.input.isKeyJustPressed(Input.Keys.DOWN) then changeSelection(false)
    if Gdx.input.isKeyJustPressed(Input.Keys.ENTER) then println("Enter pressed")

  def render(batch: SpriteBatch, renderSelection: Boolean, centered: Boolean, x: Float, y: Float, xSpace: Float, ySpace: Float): Unit =
    layouts.zipWithIndex.foreach((layout, index) =>
      val drawX = if centered then (x + index * xSpace) - (layout.width / 2F) else x + index * xSpace
      val drawY = if centered then (y + index * ySpace) - (layout.height / 2F) else y + index * ySpace
      font.draw(batch, layout, drawX, drawY)

      if selection.isDefined && layouts.indexOf(layout) == selection.get then
        font.draw(batch, ">", drawX - 20, drawY - 20)
    )

  def changeSelection(up: Boolean): Unit =
    var value = selection.getOrElse(0)
    if up then
      value -= 1
      if value < 0 then selection = Some(items.size - 1) else selection = Some(value)
    else
      value += 1
      if value > items.size - 1 then selection = Some(0) else selection = Some(0)
