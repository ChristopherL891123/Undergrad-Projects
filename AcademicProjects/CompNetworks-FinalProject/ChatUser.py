"""Client File"""
#https://realpython.com/python-sockets

import socket

HOST = "169.254.127.242"  # The server's hostname or IP address
PORT = 80  # The port used by the server
FORMAT = 'utf-8'


def cipher_encryptor(msg):
    # Source: https://www.codementor.io/python/tutorial/python-encryption-message-in-python-via-reverse-cipher
    message = msg
    encrypted_msg = ''
    i = len(message) - 1
    while i >= 0:
        encrypted_msg = encrypted_msg + message[i]
        i = i - 1
    return encrypted_msg


print("Press Ctrl+C to disconnect and end this application.")
print("\n")
with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    while True:
        try:  # Sources: https://stackoverflow.com/questions/13180941/how-to-kill-a-while-loop-with-a-keystroke and https://stackoverflow.com/questions/22183115/how-to-break-this-loop-in-python-by-detecting-key-press?noredirect=1&lq=1
            dataSend = input("ENTER MESSAGE: ")
            dataSend = cipher_encryptor(dataSend)
            s.sendall(dataSend.encode(FORMAT))  # sends message to server through the socket.
            data = s.recv(80) # recieves data from server in port number.
            print(data.decode(FORMAT))
            dataDecode = cipher_encryptor(data.decode(FORMAT)) # Use the encryptor to decrypt the decoded data by reversing the reversed text.
            print(dataDecode)
        except KeyboardInterrupt:
            print("\n")
            print("Disconnecting...")
            exit()


#print(f"Received {data!r}")
