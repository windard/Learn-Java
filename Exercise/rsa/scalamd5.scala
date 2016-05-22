import java.security.MessageDigest

object scalamd5{
    def main(args: Array[String]) {
    val digest = MessageDigest.getInstance("MD5")
    val text = "h12345678901asdfghjklmnbvcxzasdf"
    val md5hash1 = digest.digest(text.getBytes).map("%02x".format(_)).mkString
    println(md5hash1)
    }
}
