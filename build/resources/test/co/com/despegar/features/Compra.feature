#language:en
Feature: Consultar informacion de vuelo
  Como usuario, quiero consultar la información de un vuelo, costo y fecha de partida

  @ConsultarInformaciónDeVuelo
  Scenario: Consultar informacion de un vuelo, costo y fecha de partida
    Given que estoy en el portal de Despegar
    When consulto la informacion del vuelo a comprar
      | origen   | destino   | salida     | regreso    | pasajeros |
      | Medellin | Cartagena | 2020-11-30 | 2020-12-08 |         2 |
    And Registro la informacion de los personas a viajar
      | banco       | nombreFactura | apellidoFactura | documentoFactura | estado    | ciudad   | direccion  | nombreSegundoPasejero | apellidoSegundoPasejero | documento  | mail                  | area | celular   |
      | Bancolombia | Juan          | Perez           |       1123458434 | Antioquia | Medellin | Cr 8 20-20 | Juan                  | Rodriguez               | 1133465654 | papitafrita@gmail.com |   57 | 313000909 |
    Then valido que el sistema informe Instrucciones para realizar el pago
