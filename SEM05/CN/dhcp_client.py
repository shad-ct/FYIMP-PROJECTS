import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

server_address = ("127.0.0.1", 5002)

# DHCPDISCOVER
print("Sending DHCPDISCOVER...")
client.sendto(b"DHCPDISCOVER", server_address)

# Receive DHCPOFFER
data, address = client.recvfrom(1024)
offer = data.decode()

print("Server:", offer)

if offer.startswith("DHCPOFFER"):
    offered_ip = offer.split(":")[1]

    # DHCPREQUEST
    request = "DHCPREQUEST:" + offered_ip

    print("Sending DHCPREQUEST for", offered_ip)
    client.sendto(request.encode(), server_address)

    # Receive DHCPACK
    data, address = client.recvfrom(1024)
    reply = data.decode()

    print("Server:", reply)

    if reply.startswith("DHCPACK"):
        assigned_ip = reply.split(":")[1]
        print("IP address assigned:", assigned_ip)

client.close()
