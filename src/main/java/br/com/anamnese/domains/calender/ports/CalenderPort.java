package br.com.anamnese.domains.calender.ports;

import br.com.anamnese.domains.calender.inputs.CreateCalenderInput;
import br.com.anamnese.domains.calender.models.CalenderModel;

public interface CalenderPort {

	CalenderModel createCalender(CreateCalenderInput input);

}
