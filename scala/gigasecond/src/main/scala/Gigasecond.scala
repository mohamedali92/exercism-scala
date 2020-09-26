import java.time.LocalDate
import java.time.LocalDateTime

object Gigasecond {

  private val gigaSecond = 1000000000
  def add(startDate: LocalDate): LocalDateTime =
    add(startDate.atStartOfDay())

  def add(startDateTime: LocalDateTime): LocalDateTime =
    startDateTime.plusSeconds(gigaSecond)
}
