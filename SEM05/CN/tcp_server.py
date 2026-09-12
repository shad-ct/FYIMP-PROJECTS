
import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server.bind(("127.0.0.1", 5000))
server.listen(1)

print("TCP Server is waiting...")

conn, address = server.accept()
print("Connected to:", address)

while True:
    data = conn.recv(1024).decode()

    if not data or data.lower() == "bye":
        break

    print("Client:", data)

    reply = "Message received by server"
    conn.send(reply.encode())

conn.close()
server.close()
