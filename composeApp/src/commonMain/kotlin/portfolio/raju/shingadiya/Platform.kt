package portfolio.raju.shingadiya

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform