package br.com.anamnese.domains.calender.use_cases;

import br.com.anamnese.domains.calender.inputs.CreateCalenderInput;
import br.com.anamnese.domains.calender.models.CalenderModel;

public interface CreateCalender {
	
	CalenderModel execute(CreateCalenderInput input);

}
