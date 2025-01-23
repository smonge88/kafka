#/bin/bash

docker-compose exec connect confluent-hub install --no-prompt confluentinc/kafka-connect-datagen:latest

docker-compose exec connect confluent-hub install --no-prompt confluentinc/kafka-connect-jdbc:latest

docker cp ./mysql/mysql-connector-java-5.1.45.jar connect:/usr/share/confluent-hub-components/confluentinc-kafka-connect-jdbc/lib/mysql-connector-java-5.1.45.jar

docker-compose restart connect

echo "Esperando 30s a que connect reinicie"

sleep 30
