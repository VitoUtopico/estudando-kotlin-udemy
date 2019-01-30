package repository

import entity.FullParameters
import entity.HttpResponse
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class BaseRepository(){

    fun execute(fullParameters: FullParameters): HttpResponse{

        val conn: HttpURLConnection

        val url: URL = URL(fullParameters.url + getQuery(fullParameters.parameters))

        conn = url.openConnection() as HttpURLConnection
        conn.readTimeout = 10000
        conn.connectTimeout = 10002
        conn.requestMethod = fullParameters.method.toString()

        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        conn.setRequestProperty("charset", "utf-8")

        conn.useCaches = false

        conn.connect()

        if(conn.responseCode == 404){
            response = HttpResponse(conn.responseCode, "")
        } else {
            val inputStream: InputStream = conn.inputStream
            response = HttpResponse(conn.responseCode, getStringFromInputStream(inputStream))
        }
    }

    fun getStringFromInputStream( inputStream: InputStream): String{

        try{
            val strBuilder: StringBuilder = StringBuilder()
            val br: BufferedReader = BufferedReader(InputStreamReader(inputStream))

            for (line in br.readLines()){
                strBuilder.append(line)
            }
            return strBuilder.toString()

        } catch (e: Exception){
            return ""
        }
    }

    fun getQuery(parameters: Map<String, String>): String{

        // Concatenar string para gerar url
        // por exemplo www.api.com/post?id=10&size=12&page=3
        if (parameters.isEmpty())
            return ""
        val result: StringBuilder = StringBuilder()
        var first: Boolean = true

        for ( param in parameters){
            if (first){
                result.append("?")
            } else {
                result.append("&")
            }
            result.append(URLEncoder.encode(param,key), "UTF-8")
            result.append("=")
            result.append(URLEncoder.encode(param, value), "UTF-8")
        }
        return result.toString()
    }
}