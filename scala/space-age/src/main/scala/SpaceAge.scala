object SpaceAge {

    def convertToEarthSeconds(ageInSeconds: Double, orbitalPeriod: Double) = ageInSeconds / orbitalPeriod
    def onEarth(ageInSeconds: Double): Double = ageInSeconds / 31557600.0

    def onMercury(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 0.2408467))
    def onVenus(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 0.61519726))
    def onMars(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 1.8808158))
    def onJupiter(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 11.862615))
    def onSaturn(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 29.447498))
    def onUranus(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 84.016846))
    def onNeptune(ageInSeconds: Double): Double = onEarth(convertToEarthSeconds(ageInSeconds, 164.79132))

}
