#!/bin/bash

echo 'Check if maven is installed'
mvn_version=`mvn -version | grep 'Apache Maven' |awk '{print}'`
echo $mvn_version


if [[ $mvn_version != "" ]]
then
	echo 'Yahoo Maven is installed'
else 
	echo 'Exceute mvn '
	sudo apt-get install maven	
fi

cd src/drivers 
chmod +x chromedriver 
cd ../..
sudo apt-get update


sudo apt install ecj
sudo apt install default-jre
sudo apt install default-jdk
sudo apt install openjdk-11-jre-headless

sudo apt-get install libxss1 libappindicator1 libindicator7
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo apt install ./google-chrome*.deb










