package com.diardon.isp;

// Interface que viola el principio ISP, ya que puede obligar a implementar m�todos que no se necesitan
public interface MachineNoISP
{
	void print();

	void scan();

	void fax();
}
