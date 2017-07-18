package dataProcessing.image.IO

/**
  * Created by rmutya200 on 7/14/2017.
  */


import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

import scala.util.Try

object ReadImage {


  def readImageFromFilePath(pathToImage: String)={
    val photo = Option(ImageIO.read(new File(pathToImage)))
    photo
  }

  def getRasterAndColorFromFilePath(pathToImage: String)={
    val image = readImageFromFilePath(pathToImage)
    Try((image.get.getRaster,image.get.getColorModel))
  }


}