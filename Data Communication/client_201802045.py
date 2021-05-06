import socket

ip_addr = "192.168.1.77"
port = 8000

client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
print("connect success")
send_data = input(">>>")
client_socket.sendto(send_data.encode(), (ip_addr, port))
data, addr = client_socket.recvfrom(2000)

print(addr, " : ",data.decode())
