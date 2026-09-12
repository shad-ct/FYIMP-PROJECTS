import os
from ftplib import FTP

HOST = "127.0.0.1"
PORT = 2121

# Folder where downloaded files will be saved
CLIENT_FOLDER = os.path.join(os.getcwd(), "client_files" \
"")

# Create FTP client
ftp = FTP()

# Connect to FTP server
ftp.connect(HOST, PORT)

# Login
ftp.login("user", "1234")

print("      CONNECTED TO FTP SERVER   ")

while True:

    print("\n1. List files")
    print("2. Download file")
    # print("3. Upload file")
    print("4. Exit")

    choice = input("Enter your choice: ")

    # List files
    if choice == "1":

        print("\nFiles available on server:")
        ftp.retrlines("LIST")

    # Download file
    elif choice == "2":

        filename = input("Enter filename to download: ")

        # Path where downloaded file will be saved
        client_path = os.path.join(CLIENT_FOLDER, filename)

        try:
            with open(client_path, "wb") as file:
                ftp.retrbinary(
                    "RETR " + filename,
                    file.write
                )

            print("File downloaded successfully!")
            print("Saved in:", client_path)

        except Exception as e:
            print("Download failed:", e)

    # Upload file
    elif choice == "3":

        filename = input("Enter local filename to upload: ")

        try:
            with open(filename, "rb") as file:
                ftp.storbinary(
                    "STOR " + filename,
                    file
                )

            print("File uploaded successfully!")

        except FileNotFoundError:
            print("File not found on client.")

        except Exception as e:
            print("Upload failed:", e)

    # Exit
    elif choice == "4":

        ftp.quit()
        print("Disconnected from FTP server.")
        break

    else:
        print("Invalid choice!")
