public class Abogado extends Empleado{
    public int getHoras() {
        return super.getHoras() + 5;
    }

    public double getSalario() {
        return super.getSalario() + 10000;
    }

    public int getVacaciones() {
        return super.getVacaciones()/2;
    }
    public String getMesVacaciones() {
        return "Julio"; }
}
