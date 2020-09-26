import scala.math.floor
case class Clock(var hours: Int, var minutes: Int) {
  val modToHoursFromMinutes =
    (if (minutes < 0)
       floor(minutes / 60.0)
     else
       minutes / 60).toInt

  hours = (((hours + modToHoursFromMinutes) % 24) + 24) % 24
  minutes = ((minutes % 60) + 60) % 60

  def +(that: Clock) = Clock(hours + that.hours, minutes + that.minutes)
  def -(that: Clock) = Clock(hours - that.hours, minutes - that.minutes)
}

object Clock {
  def apply(minutes: Int): Clock = new Clock(0, minutes)
}
