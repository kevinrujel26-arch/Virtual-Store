# Virtual Store
Sistema de tienda virtual desarrolado en Java Utilizando Patrones de Diseño

## Patrones implementados

### Strategy
Se utilizo el patron Strategy para aplicar diferentes tipos de descuentos:
- Sin descuento
- Descuento porcentual
- Descuento Fijo

## Clases
- DiscountStrategy
- NoDiscountStrategy
- PercentageDiscountStrategy
- FixedAmountDiscountStrategy

### Adapter 
Se utilizo el patron adapter para integrar un servicio externo de Paypal con el sistema de pagos de tienda virtual
## Clases

- PaymentProcessor
- ExternalPayPalService
- PayPalAdapter
- CreditCardPaymentProcessor
- YapePaymentProcessor

### Observer
Se utilizó el patrón Observer para notificar automáticamente diferentes acciones al confirmar una compra.

## Observers implementados

- EmailNotificationObserver
- InventoryObserver
- AdminNotificationObserver

## Ejecución del programa
Al ejecutar el programa se obtiene la siguiente salida:

Pago realizado con PayPal: PEN 2790.0
Compra confirmada por S/ 2790.0
Enviando correo al cliente...
Actualizando inventario...
Notificando al administrador...

## Autor
KEVIN RUJEL ALVAREZ