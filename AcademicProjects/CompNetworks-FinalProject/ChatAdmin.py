# https://realpython.com/python-sockets

import socket

HOST = "169.254.127.242"  # Standard loopback interface address (localhost)
PORT = 80  # Port to listen on (non-privileged ports are > 1023)
FORMAT = 'utf-8'

def cipher_encryptor(msg):
    message = msg
    encrypted_msg = ''
    i = len(message) - 1
    while i >= 0:
        encrypted_msg = encrypted_msg + message[i]
        i = i - 1
    return encrypted_msg



with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    # AF_INET , SOCK_STREAM are standard constants used for networking.
    # AF_INET is used for addressing IPV4 addresses
    # SOCK_STREAM contains a value for the socket type for the Transfer Control Protocol.

    s.bind((HOST, PORT))

    # method used to link the server's socket
    # to a "network interface" and a port number.
    # since AF_INET specifies an IPV4 address, it requires a tuple of 2 items.
    # IPV4 address must be a string
    # if localhost address is used, "only processes on the host will be able to connect to the server"
    # if HOST var is empty string, the server accepts connections "on all available IPV4 interfaces"
    # PORT is the port number that the server accepts connections from. best if number is above 1024
    #

    s.listen()
    # accepts connections

    conn, addr = s.accept()
    # waits for connection. When a device connects, make new socket object with (host,port) tuple.
    # these variables have the socket object tha will be used to cOmmunicate with the client.


    with conn:
        # infinite while loop.
        # used to
        print(f"Connected by {addr}")
        while True:
            try:  # Sources: https://stackoverflow.com/questions/13180941/how-to-kill-a-while-loop-with-a-keystroke and https://stackoverflow.com/questions/22183115/how-to-break-this-loop-in-python-by-detecting-key-press?noredirect=1&lq=1
                data = conn.recv(80)  # temporarily suspends program to work with system I/O before returning a value.
                dataDecode = data.decode(FORMAT)
                decrypted = cipher_encryptor(dataDecode)
                print(decrypted)
                # DECRYPT HERE AND PRINT

                if not data:  # if the client closed the connection, data var returns an empty bytes object, i.e close connection signal.
                    break  # close connection
                # conn.sendall(data)  # sends back the data the devices sent to the server
                dataSend = input("ENTER MESSAGE: ")
                # ENCRYPT HERE AND STORE IN VAR TO BE ENCODED
                dataSend = cipher_encryptor(dataSend)
                print(dataSend)
                conn.send(dataSend.encode(FORMAT))

            except KeyboardInterrupt:
                print("\n")
                print("Disconnecting...")
                exit()



