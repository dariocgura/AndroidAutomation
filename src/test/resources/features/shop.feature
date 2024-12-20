@validacion
Feature: Validar carga de aplicación

  @testproductcar
  Scenario Outline: Testing products
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <unidades> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente