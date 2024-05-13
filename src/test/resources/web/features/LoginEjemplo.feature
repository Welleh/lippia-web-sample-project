@Login
Feature: Login

@LoginExitoso
Scenario: Login exitoso por email
Given que estoy en la pantalla de login
When ingreso el usuario "usuario1234@gmail.com"
And hago click en el boton de continuar con email
Then la aplicación envía un código de ingreso al email

@loginExitoso
Scenario: Login exitoso por Google
Given que estoy en la pantalla de login
When hago click en el boton de continuar con Google
Then accedo a la pantalla de ingreso de cuenta de Google

@loginExitoso
Scenario: Login exitoso manualmente
Given que estoy en la pantalla de login
When hago click en el boton "iniciar sesión manualmente"
And ingreso el email "usuario1234@gmail.com" y la contraseña "12345678"
Then ingreso a la aplicación como usuario registrado

  ##------------------------

@loginFallido
Scenario Outline: Login fallido por email por <causa_fallo>
Given que estoy en la pantalla de login por email
When ingreso el usuario <usuario>
And hago click en el boton continuar con email
Then se muestra el mensaje de error: <mensaje>

Examples:
  | usuario | mensaje                                 | causa_fallo        |
  | usuario1| formato de correo electrónico no válido | usuario incorrecto |
  |         | correo electrónico es requerido         | usuario incompleto |
  | xxxxxxx | formato de correo electrónico no válido | usuario incorrecto |

@loginFallido
Scenario Outline: Login fallido por Google por <causa_fallo>
Given que estoy en la pantalla de login por Google
When ingreso el usuario <usuario>
And hago click en el botón siguiente
Then se muestra el mensaje de error: <mensaje>

Examples:
  | usuario           | mensaje                                                    | causa_fallo        |
  | usuario           | No pudimos encontrar tu cuenta de Google                   | usuario incorrecto |
  |                   | Ingresa un correo electrónico o número de teléfono         | usuario incompleto |
  | 444444444444444   | Ingresa un número de teléfono o correo electrónico válidos | usuario incorrecto |

@loginFallido
Scenario Outline: Login manual fallido por <causa_fallo>
Given que estoy en la pantalla de login manual
When ingreso el usuario <usuario> y contraseña <contraseña>
And hago click en el boton iniciar sesión
Then se muestra el mensaje de error: <mensaje>

Examples:
  | usuario                 | contraseña | mensaje                                    | causa_fallo            |
  | usuario                 | 123456     | Formato de correo electrónico no válido    | usuario incorrecto     |
  | usuario1234@gmail.com   | 123456     | Correo electrónico o contraseña no válidos | contraseña incorrecta  |
  |                         | 123456     | Correo electrónico es requerido            | usuario incompleto     |
  | usuario1234@gmail.com   |            | Se requiere la contraseña                  | contraseña incompleta  |
