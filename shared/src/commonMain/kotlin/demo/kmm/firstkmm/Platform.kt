package demo.kmm.firstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform