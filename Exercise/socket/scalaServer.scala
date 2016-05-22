import java.net._
import java.io._
import scala.io._

object scalaServer{
    def main(args: Array[String]) {
        val server = new ServerSocket(8886)
            while(true){
                val s = server.accept()
                val in  = new BufferedSource(s.getInputStream()).getLines()
                val out = new PrintStream(s.getOutputStream())

                out.println(in.next())
                out.flush()
                out.println(in.next())
                out.flush()

                s.close()
            }
    }
}
