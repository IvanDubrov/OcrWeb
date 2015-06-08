package validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("NameValidator")
public class NameValidator implements Validator {

    private static final String Name_p = ".+\\D";


    private Pattern pattern;
    private Matcher m;


    @Override
    public void validate(FacesContext context, UIComponent component,
                         Object value) throws ValidatorException {
        pattern = Pattern.compile(Name_p);
        m = pattern.matcher(value.toString());

        if (!m.matches()) {
            FacesMessage msg =
                    new FacesMessage("no email.",
                            "Цифры запрещены!");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }

    }

}