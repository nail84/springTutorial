package udemy.springTutorial.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18nService {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageId) {
        return getMessage(messageId, Locale.getDefault());
    }

    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }
}
