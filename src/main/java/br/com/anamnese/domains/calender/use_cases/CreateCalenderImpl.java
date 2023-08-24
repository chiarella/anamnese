package br.com.anamnese.domains.calender.use_cases;

import br.com.anamnese.domains.calender.inputs.CreateCalenderInput;
import br.com.anamnese.domains.calender.models.CalenderModel;
import br.com.anamnese.domains.calender.ports.CalenderPort;

public class CreateCalenderImpl implements CreateCalender {
	
	private CalenderPort calenderPort;
	
	public CreateCalenderImpl(CalenderPort calenderPort) {
		this.calenderPort = calenderPort;
	}


	@Override
	public CalenderModel execute(CreateCalenderInput input) {
		return calenderPort.createCalender(input);
	}

}
