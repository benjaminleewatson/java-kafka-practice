# java-kafka-practice project including two basic java services with a kafka publisher/subscriber relationship
#
# Usage: Requires a local running kafka broker on 9092 and uses the topic "practiceTopic"
#
# To produce a message from the running publisher
# curl --data "message=If my grandmother had wheels she'd be a bike" localhost:8080/produce
#
# To fetch all received messages from the running subscriber
# curl localhost:8081/consume
