package com.dwbook.phonebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;

public class PhonebookConfiguration extends Configuration {

    @JsonProperty
    private DataSourceFactory database = new DataSourceFactory();

    @NotEmpty
    @JsonProperty
    private String message;

    @Max(10)
    @JsonProperty
    private int messageRepetitions;

    @JsonProperty
    private String optionalMessage = "This is an optional meessage.";

    public String getOptionalMessage() {
        return optionalMessage;
    }

    public String getMessage() {
        return message;
    }

    public int getMessageRepetitions() {
        return messageRepetitions;
    }

    public DataSourceFactory getDatabase() {
        return database;
    }
}
