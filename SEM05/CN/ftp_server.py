from pyftpdlib.authorizers import DummyAuthorizer
from pyftpdlib.handlers import FTPHandler
from pyftpdlib.servers import FTPServer
import os

HOST = "127.0.0.1"
PORT = 2121

# Path of the files folder
FILES_FOLDER = os.path.join(os.getcwd(), "files_server")

# Create FTP user manager
authorizer = DummyAuthorizer()

# Add FTP user
authorizer.add_user(
    "user",
    "1234",
    FILES_FOLDER,
    perm="elradfmw"
)

# Create FTP handler
handler = FTPHandler
handler.authorizer = authorizer

# Create FTP server
server = FTPServer((HOST, PORT), handler)

print("================================")
print("       FTP SERVER STARTED       ")
print("================================")
print("Host     :", HOST)
print("Port     :", PORT)
print("Username : user")
print("Password : 1234")
print("Files    :", FILES_FOLDER)
print("================================")

server.serve_forever()
