package chapter4

import java.io.File


/**
 * Created by snake
 * on 16/2/29.
 */

fun main(args: Array<String>) {
    val f = File("/Users/snake/Documents/Github")
    val files = f.listFiles();
    for (file in files) {
        if (file.name.equals(".git", true))
            file.delete()
        println("file name : ${file.name}")

    }
}

/**
 * I don't know about inline very much, so just make this empty.
 * More or less, if you want to get into this, pls check the function lock().
 */
