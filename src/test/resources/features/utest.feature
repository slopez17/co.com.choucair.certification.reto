# Autor: Sandra Marcela López Torres

@stories
Feature: utest
  As a user, I want to sign up for an account at utest, giving my log information
  @scenario1
  Scenario Outline: Perfom a new register

    Given than Martha wants to sign up for an account at utest

    When she fills out the requiered information on utest platform
      | strFirstName   | strLastName   | strEmail    | strMonthOfBirth   | strDayOfBirth   | strYearOfBirth   | strPassword    |
      | <strFirstName> | <strLastName> | <strEmail>  | <strMonthOfBirth> | <strDayOfBirth> | <strYearOfBirth> | <strPassword>  |

    Then she reads
      | strConfirmMessage   |
      | <strConfirmMessage> |

    Examples:
      | strFirstName  | strLastName    | strEmail               | strMonthOfBirth   | strDayOfBirth   | strYearOfBirth   | strPassword    | strConfirmMessage                    |
      | Martha        | Ramirez        | mramirez64@example.com | March             | 28              | 1964             | Hola123456M    | First, please check your email inbox |