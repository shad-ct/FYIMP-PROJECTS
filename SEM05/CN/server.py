import socket

# Create a TCP IPv4 socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Bind the socket to localhost and port 5000
server_socket.bind(("127.0.0.1", 5000))

# Start listening for incoming connections
server_socket.listen()

print("Server is waiting for a client...")

# Accept a client connection
client_socket, client_address = server_socket.accept()

print(f"Connected to {client_address}")

while True:
    # Receive message from client
    message = client_socket.recv(1024).decode()

    if message.lower() == "exit":
        print("Client disconnected.")
        break

    print(f"Client: {message}")

    # Reply to client
    reply = input("Server: ")
    client_socket.send(reply.encode())

    if reply.lower() == "exit":
        break

# Close sockets
client_socket.close()
server_socket.close()

print("Server closed.")
