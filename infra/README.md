ssh -i /Users/hubert/git/stroebitzer_hackathon-2023/.secrets/minecraft-server root@167.235.31.188

apt update
apt upgrade -y


https://www.digitalocean.com/community/tutorials/how-to-create-a-minecraft-server-on-ubuntu-22-04

wget https://piston-data.mojang.com/v1/objects/84194a2f286ef7c14ed7ce0090dba59902951553/server.jar

java -Xms1024M -Xmx6144M -jar minecraft_server_1.20.1.jar nogui

# IP
167.235.31.188
minecraft.stroebitzer.com   

# screen
screen -ls
screen -S minecraft
screen -r minecraft

STRG + A + D