import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.Duration.ofSeconds

def date(str: String): LocalDate =
  LocalDate.from(DateTimeFormatter.ISO_DATE.parse(str))

def dateTime(str: String): LocalDateTime =
  LocalDateTime.from(DateTimeFormatter.ISO_DATE_TIME.parse(str))


val input = date("2011-04-25")
//val inputdt = dateTime("2015-01-24T22:00:00")
//
//inputdt.plusSeconds(1000000000)
//input.plus(ofSeconds(1000000000).)

input.atStartOfDay().plusSeconds(1000000000)