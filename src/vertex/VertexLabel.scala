import java.security.MessageDigest

class VertexLabel(label:String, numPartitions: Int) {

  val digestor = MessageDigest.getInstance("MD5")
  
  val getLabel = label

  val partitionId = digestor(label.getBytes) % numPartitions
  
}
