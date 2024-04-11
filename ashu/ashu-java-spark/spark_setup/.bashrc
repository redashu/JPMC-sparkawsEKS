# .bashrc

# Source global definitions
if [ -f /etc/bashrc ]; then
	. /etc/bashrc
fi
# define some env varibale
SPARK_HOME=/home/ashu/ashu-java-spark/spark_setup/spark-351
PATH=$PATH:$SPARK_HOME/bin:$SPARK_HOME/sbin
export PATH 
# Uncomment the following line if you don't like systemctl's auto-paging feature:
# export SYSTEMD_PAGER=

# User specific aliases and functions
#
source <(kubectl completion bash)
