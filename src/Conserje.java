public class Conserje extends Empleado{

    public int getHoras() {
        return super.getHoras();
    }

    public double getSalario() {
        return super.getSalario();
    }

    public int getVacaciones() {
        return super.getVacaciones() + 5;
    }
    public String getMesVacaciones() {
        return "Septiembre"; }

    public void mostrar(){
        System.out.println("Estoy haciendo fotocopias");
    }
}
