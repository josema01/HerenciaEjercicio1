public class Secretario extends Empleado{
    public int getHoras() {
        return super.getHoras();
    }

    public double getSalario() {
        return super.getSalario() + 5000;
    }

    public int getVacaciones() {
        return super.getVacaciones();
    }
    public String getMesVacaciones() {
        return super.getMesVacaciones(); }

    public void mostrar(){
        System.out.println("Estoy haciendo fotocopias");
    }
}
