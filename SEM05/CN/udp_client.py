import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

server_address = ("127.0.0.1", 5001)

print("Connected to UDP server")

while True:
    message = input("Enter message: ")

    client.sendto(message.encode(), server_address)

    if message.lower() == "bye":
        break

    data, address = client.recvfrom(1024)

    print("Server:", data.decode())

client.close()
