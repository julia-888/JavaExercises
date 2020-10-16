public enum Planet {
    MERCURY(0.33 * Math.pow(10, 24), 2400), VENUS(4.9 * Math.pow(10, 24), 6100), EARTH(6 * Math.pow(10, 24), 6400),
    MARS(0.6 * Math.pow(10, 24), 3400), JOVIAN(1900 * Math.pow(10, 24), 72000), SATURN(570 * Math.pow(10, 24), 60000),
    URANIUM(87 * Math.pow(10, 24), 26000), NEPTUNIUM(103 * Math.pow(10, 24), 25000);

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    private double mass;
    private double radius;

    public double getGravitation() {
        double result = 6.67 * Math.pow(10, -11) * this.mass / (this.radius * this.radius);
        return result;
    }
}
