package org.troel.bridge.converter.converters;

import java.util.Locale;

import org.troel.bridge.converter.employees.Employee;

public class CSVConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		Locale.setDefault(Locale.US);
		return String.format("%s,%d,%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
