fun main () {
    //Body
    println("===================================")
    println("             WELCOME!              ")
    println("===================================")
    println("    GAME SUIT TERMINAL VERSION     ")
    println("===================================")

    println("Masukan Pemain 1 : ")
    val pemainSatu = readLine()!!.toString().toLowerCase()
    //.toLowerCase agar apabila input ada yang huruf besar hasil tetap bisa dijalankan
    println("Masukan Pemain 2 : ")
    val pemainDua = readLine()!!.toString().toLowerCase()
    println("Hasil : ")

    val pemainsatuMenang = pemainSatu == "gunting" && pemainDua == "kertas" || pemainSatu == "batu" && pemainDua == "gunting" || pemainSatu == "kertas" && pemainDua == "batu"
    val pemainduaMenang = pemainSatu == "kertas" && pemainDua == "gunting" || pemainSatu == "gunting" && pemainDua == "batu" || pemainSatu == "batu" && pemainDua == "kertas"
    val draw = pemainSatu == "kertas" && pemainDua == "kertas" || pemainSatu == "gunting" && pemainDua == "gunting" || pemainSatu == "batu" && pemainDua == "batu"

    if (pemainsatuMenang) {
        println("Pemain Satu MENANG!")
    } else if (pemainduaMenang) {
        println("Pemain Dua MENANG!")
    } else if (draw) {
        println("DRAW!")
    } else {
        println("Ups ada typo, coba input lagi yaa")
    }
    println("===================================")
    println("        Challange Chapter 3        ")
    println("        Wiyoga Nur Alamsyah        ")
    println("===================================")

}