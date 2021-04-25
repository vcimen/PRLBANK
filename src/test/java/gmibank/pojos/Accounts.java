package gmibank.pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountsObject {

    private String description;
    private double balance;


}
