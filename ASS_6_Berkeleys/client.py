import pickle
import time 
import socket 


def main():

	server_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM) 
	server_socket.connect(('localhost',1234))
	
	print("connected to server") 
	
	
	
	#get the curret time 
	client_time=int(time.time()*1000) 
	print("client_time",client_time) 
	
	
	#send the time to server 
	server_socket.sendall(pickle.dumps(client_time)) 
	print("time sent"); 
	
	
	#receive time diff
	time_diff=pickle.loads(server_socket.recv(1024))
	#print("Common time received",time_diff) 
	
	#adjus time 
	
	ad_time=time_diff-client_time
	print("add correction",ad_time) 
	
	print("New Client time",client_time+ad_time)
	
	
	server_socket.close()
	
	
if __name__ == '__main__' :
	
	main() 
	
