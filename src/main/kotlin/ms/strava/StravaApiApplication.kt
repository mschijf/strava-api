package ms.strava

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StravaApiApplication

fun main(args: Array<String>) {
    runApplication<StravaApiApplication>(*args)
}
