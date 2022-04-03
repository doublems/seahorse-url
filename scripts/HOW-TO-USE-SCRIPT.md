# How to use script
You just use shell script file : 
``
sh ./3rd-party-run.sh
``

## You have to prepare following
1. Install docker

## The docker-compose

### RDBMS :: Postgres
1. It uses the docker-compose file version 3.8 

2. Next up, we define db as a service, each service will equate to a new docker run command

3. We are asking docker-compose for the service to be an image of Postgres version 14.2 alpine which will always restart if the container stops automatically. 

4. Consequently we define two environment variables to send in the Postgres user and password. Keep in mind, as the database is not sent by default for the official image it will use the username as the database name.

5. Subsequently we map the host/machine port 5432 with the container port 5432 as Postgres runs in that port in the container.

6. After that we ask docker-compose to manage the volume in a name called db which is further added to be a local driver. So when the container is restarted the data will be available from docker managed volume. To see the contents of the volume we can run docker volume ls and inspect the volume attached to our Postgres container.

- https://hub.docker.com/_/postgres
- https://geshan.com.np/blog/2021/12/docker-postgres/

## Error case

### Not installed Docker
__Problem__
```shell
Traceback (most recent call last):
  File "urllib3/connectionpool.py", line 670, in urlopen
  File "urllib3/connectionpool.py", line 392, in _make_request
  File "http/client.py", line 1255, in request
  File "http/client.py", line 1301, in _send_request
  File "http/client.py", line 1250, in endheaders
  File "http/client.py", line 1010, in _send_output
  File "http/client.py", line 950, in send
  File "docker/transport/unixconn.py", line 43, in connect
ConnectionRefusedError: [Errno 61] Connection refused

During handling of the above exception, another exception occurred:


```

__Answer__

> You should install and turn on docker