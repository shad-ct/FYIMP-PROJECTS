
import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

client.connect(("127.0.0.1", 5000))

print("Connected to TCP server")

while True:
    message = input("Enter message: ")

    client.send(message.encode())

    if message.lower() == "bye":
        break

    data = client.recv(1024).decode()
    print("Server:", data)

client.close()
