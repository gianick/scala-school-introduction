enum PaymentStatus:
  case Pending, Completed, Failed

def handlePayment(status: PaymentStatus): String =
  status match
    case PaymentStatus.Pending   => "Waiting for payment"
    case PaymentStatus.Completed => "Payment successful"
    case PaymentStatus.Failed    => "Payment failed"

// ---

val currentStatus: PaymentStatus = PaymentStatus.Pending
val previousStatus: PaymentStatus = PaymentStatus.Failed

val message1 = handlePayment(currentStatus)
val message2 = handlePayment(previousStatus)


/*

Why use Enums over Sealed Traits?

- Conciseness: You define all cases in one block
- Built-in Utilities: You get PaymentStatus.values (to list all) and PaymentStatus.valueOf("Pending") for free
- Safety: Like sealed traits, they are exhaustive, so the compiler warns you if a match case is missing
 */