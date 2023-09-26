package org.Laptop;

import org.LaptopComponents.*;

public class Laptop {
       private float screen;
       public Processor processor;
       private String ram;
       private String hardDrive;
       private GraphicsCard graphicsCard;
       private String opticalDrive;
       private String keyboard;
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "ddr4";
		this.hardDrive = "2TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "MLT Layer";
		this.keyboard = "backlit";	}
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", \nprocessor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ",\n graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
	public Processor getProcessor() {
		return processor;
	}
	public float getScreen() {
		return screen;
	}
	public String getRam() {
		return ram;
	}
	public String getHardDrive() {
		return hardDrive;
	}
	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	public String getOpticalDrive() {
		return opticalDrive;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "Success";
	}
	
       
       
}
