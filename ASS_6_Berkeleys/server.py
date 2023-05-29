import pickle
import time 
import socket 


def main():

	server_socket=socket.socket(socket.AF_INET,socket.SOCK_STREAM) 
	server_socket.bind(('localhost',1234))
	server_socket.listen(1) 
	
	
	#Print 
	print("Server connected and listen 6969")
	
	
	
	#get the server time 
	
	server_time=int(time.time()*1000) 
	print("Server time",server_time) 
	
	
	
	#Accet client connection
	
	client_socket,client_address=server_socket.accept()
	print("Client connectd") 
	
	#receiev the clinet time 
	client_time=pickle.loads(client_socket.recv(1024)) 
	print("Client time",client_time) 
	
	
	
	
	
	
	
	
	#calcluate time dfii
	
	time_diff=(client_time-server_time)/2;
	
	
	#send the time differber to 
	
	client_socket.sendall(pickle.dumps(server_time+time_diff)) 
	print("avg time diff ",time_diff) 
	
	print("Server time current",server_time+time_diff)
	
	
	#clean yp resourses 
	server_socket.close() 
	client_socket.close()
	
	
if __name__ == '__main__':


	main()
