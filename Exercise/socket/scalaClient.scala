import java.io._
import java.net._
import java.security._
import javax.crypto._
import javax.crypto.spec.SecretKeySpec
import java.security.spec.{X509EncodedKeySpec, PKCS8EncodedKeySpec}

import scala.io._
import scala.util.Random
import scala.Function.const
import scala.collection.immutable.Stream

object scalaClient{
    def main(args: Array[String]) {
        val s = new scalaclient()
        s.run()
    }
}

class scalaclient(){

    def run(){
        val s = new Socket("127.0.0.1",8886)
        val in = new BufferedSource(s.getInputStream()).getLines()
        val out = new PrintStream(s.getOutputStream())

        out.println("HELLO SERVER")
        out.flush()
        var line = in.next()

        println("Received:"+line)

        val input = readLine
        out.println(input)
        out.flush()

        line = in.next()

        println("Received:"+line)
        s.close()

    }
}
