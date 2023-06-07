package com.teralco.training.questions;

import com.teralco.training.model.FormTextDto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.teralco.training.ui.TextBoxSectionPage.OUTPUT_FIELD;

public class FormTextSuccessfullyQuestion implements Question<Boolean> {

    private FormTextDto formTextDto;

    public FormTextSuccessfullyQuestion(FormTextDto formTextDto) {
        this.formTextDto = formTextDto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return OUTPUT_FIELD.resolveFor(actor).getText().contains(formTextDto.getEmail());
    }

    public static Question<Boolean> isTheDataIntroducedShowed(FormTextDto formTextDto) {
        return new FormTextSuccessfullyQuestion(formTextDto);
    }

}


