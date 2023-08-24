package br.com.anamnese.infrastructure.adapter;

import org.springframework.stereotype.Component;

import br.com.anamnese.domains.calender.inputs.CreateCalenderInput;
import br.com.anamnese.domains.calender.models.CalenderModel;
import br.com.anamnese.domains.calender.ports.CalenderPort;

@Component
public class CalenderPortAdapter implements CalenderPort {

	@Override
	public CalenderModel createCalender(CreateCalenderInput input) {
		// TODO Auto-generated method stub
		return null;
	}

}
