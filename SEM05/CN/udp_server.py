import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

server.bind(("127.0.0.1", 5001))

print("UDP Server is waiting...")

while True:
    data, address = server.recvfrom(1024)

    message = data.decode()
    print("Client:", message)

    if message.lower() == "bye":
        break

    reply = "Message received by server"
    server.sendto(reply.encode(), address)

server.close()
