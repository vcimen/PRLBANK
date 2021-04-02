@sample
#US'lerimizin isimleri veya aciklamalari feature a yazilir
Feature:US001 Register with valid credentials
  #Test Caselerimizin objectivelerini Scenariolara yaziyoruz
  Scenario: There should be a valid SSN respecting the "-" where necessary, it should be 9 digits long
    #Aslinda bu Gherkin language de kullandigimiz keywordlerin hic bir farki yok ama genelde ilk islemde When veya Given kullanilir
    Given Go to "gmibank_url"
    And you should navigate to registration page
    Then Click on SSN textbox
    And Provide the SNN of the applicant
    And Then I should not see the error message translation-not-found[Your SSN is required]