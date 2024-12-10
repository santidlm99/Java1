package Composicion;

public class Ordenador {

	private Monitor monitor;
	private CPU cpu;
	
	public Ordenador(Monitor monitor, CPU cpu) {
		super();
		this.monitor = monitor;
		this.cpu = cpu;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	
	public double preciototal() {
        return cpu.getPrecio()+monitor.getPrecio();


        }
}

