import socket

# Create a TCP IPv4 socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to the server
client_socket.connect(("127.0.0.1", 5000))

print("Connected to server.")

while True:
    # Send message to server
    message = input("Client: ")
    client_socket.send(message.encode())

    if message.lower() == "exit":
        break

    # Receive reply from server
    reply = client_socket.recv(1024).decode()

    if reply.lower() == "exit":
        print("Server closed the connection.")
        break

    print(f"Server: {reply}")

# Close socket
client_socket.close()

print("Client closed.")
