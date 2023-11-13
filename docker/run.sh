#!/bin/sh

if [ -z ${CONFIG_LOCATIONS} ]; then
  CONFIG_LOCATIONS="-Dspring.config.location=classpath:/application.yaml,file:/deployments/config/application.properties"
fi

exec java $CONFIG_LOCATIONS -jar apgenik-services.jar