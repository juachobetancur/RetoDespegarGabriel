#language:en
Feature: Consultar informacion de vuelo
  Como usuario, quiero consultar la informaci�n de un vuelo, costo y fecha de partida

  @ConsultarInformaci�nDeVuelo
  Scenario: Consultar informacion de un vuelo, costo y fecha de partida
    Given que estoy en el portal de Despegar
    When consulto la informacion del vuelo a comprar
      | origen   | destino   | salida     | regreso    | pasajeros |
      | Medellin | Cartagena | 2020-11-30 | 2020-12-08 |         2 |
    And Registro la informacion de los personas a viajar
      | banco       | nombreFactura | apellidoFactura | documentoFactura | estado    | ciudad   | direccion  | nombreSegundoPasejero | apellidoSegundoPasejero | documento | mail                  | area | celular   |
      | Bancolombia | John          | Suarez          |         43556432 | Antioquia | Medellin | Cr 8 20-20 | Pedro                 | Suarez                  |  71321445 | papitafrita@gmail.com |   57 | 313000909 |
    Then valido que el sistema informe Instrucciones para realizar el pago
