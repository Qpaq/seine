class Vertex(id: String, worker: Worker) {

  private var contents = 0.0
  private var halted   = false
  
  def voteToHalt = halted = true

  def sendMessageTo(vertex_id: String, message: String) = worker.sendMessageTo(vertex_id, message)

  def compute(queue: VertexMessageQueue) = null
  
}
