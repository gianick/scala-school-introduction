sealed trait PaymentStatus

case object Pending extends PaymentStatus
case object Completed extends PaymentStatus
case object Failed extends PaymentStatus

def handlePayment(status: PaymentStatus): String =
  status match {
    case Pending   => "Waiting for payment"
    case Completed => "Payment successful"
    case Failed    => "Payment failed"
  }


// ---

val currentStatus: PaymentStatus = Pending
val previousStatus: PaymentStatus = Failed

val message1 = handlePayment(currentStatus)
val message2 = handlePayment(previousStatus)
