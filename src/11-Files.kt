import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

/**
 how to write into file?
 how to read file text ?
 */




val fileName = "message.txt"



fun writerIntoFile(msg : String) {
    try {
        val writer = FileWriter(fileName,true)
        writer.write(msg + "\n")
        writer.close()
    } catch (e : IOException) {e.printStackTrace()}
}




fun readFile(){

    var byte : Int = 0
    try {

        val fileReader = FileReader(fileName)
        do {
            byte = fileReader.read()
            val txt = byte.toChar()
            print(txt)
        }while (byte != -1)
        fileReader.close()

    }catch (e : IOException) {
        e.printStackTrace()
    }

}


fun readFileByInputStream(){
    val stream = Files.newInputStream(Paths.get(fileName))
    stream.buffered().reader().use { reader -> { println(reader.readText()) } }
}




fun main() {
    readFileByInputStream()
}