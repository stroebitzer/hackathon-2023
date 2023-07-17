# upgrade system
apt update
apt upgrade

# install java
sudo apt-get install openjdk-17-jdk
git config --global --unset core.autocrlf

# compile minecraft
java -jar BuildTools.jar

# run minecraft
mkdir spigot
cp spigot-1.20.1.jar spigot
cd spigot
ufw allow 25565
java -Xms2G -Xmx7G -jar spigot-1.20.1.jar nogui


op