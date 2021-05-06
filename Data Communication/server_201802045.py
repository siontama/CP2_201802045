import socket

server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server_socket.bind(('', 8000))
print("8000 port connect waiting")

data, addr = server_socket.recvfrom(2000)

print(addr, " : " ,data.decode())

send_data = input(">>>")

server_socket.sendto(send_data.encode(), addr)
