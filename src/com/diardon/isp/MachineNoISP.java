package com.diardon.isp;

// Interface que viola el principio ISP, ya que puede obligar a implementar métodos que no se necesitan
public interface MachineNoISP
{
	void print();

	void scan();

	void fax();
}
