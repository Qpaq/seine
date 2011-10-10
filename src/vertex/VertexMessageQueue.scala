class VertexMessageQueue() extends Queue {

  private var combiner = Combiner(this)

  def pushMessage(message: String) = combiner.pushMessage(message)

  def nextMessage = dequeue

}
