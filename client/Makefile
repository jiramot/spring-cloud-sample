.PHONY: build start stop

build:
	docker build -t spring-client .

start:
	docker run -d -p 8082:8081 -e 'EUREKA_URI=http://192.168.1.179:8761/eureka' --name client spring-client

stop:
	docker rm -f client


default: build