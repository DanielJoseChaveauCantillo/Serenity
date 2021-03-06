Feature: Google Translate

  @Prueba
    Scenario: Translate from English to Spanish
      Given that Daniel wants to translate words
      When he translate the words Teacher from English to Spanish
      Then he should see the word Profesor in the screen