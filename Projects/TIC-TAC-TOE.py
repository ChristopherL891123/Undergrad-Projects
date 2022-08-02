import random


def GENERATE(n):
    """Generates the board used in this game. It will be an NxN matrix."""
    b = []
    c = 1
    for i in range(n):
        b.append([])
        for j in range(n):
            b[i].append(c)
            c += 1
    return b


def DISPLAY(board, n):
    """The function accepts the board's current status
    and its lengt to prints the board to the console."""
    print("+", n * "-------+", sep='')
    for i in range(n):  # repeats the whole thing n number of times
        print("|" + n * (7 * " " + "|"), sep='', end="\n\n")
        print("|", end='', sep='')
        for k in range(n):
            print(3 * " " + "{m}".format(m=board[i][k]) + 3 * " ", end='|')
        print("\n")
        print("|" + n * (7 * " " + "|"), sep='')
        print("+", n * "-------+", sep='')


def MAKE_LIST(board, n):
    # The function browses the board and builds a list of all the free squares;
    # the list consists of tuples, while each tuple is a pair of row and column numbers.
    l2 = []
    for i in range(n):
        for j in range(n):
            if board[i][j] != 'O' or board[i][j] != "X":
                l2.append(board[i][j])
    return l2


def HORIZONTAL(board, n, symbol):
    c = 0
    for i in range(n):
        for j in range(n):
            if board[i][j] == symbol:
                c += 1
                if c == 3:
                    return True
            else:
                c = 0
    return False


def DIAGONAL(board, n, symbol):
    c = 0
    for i in range(n):
        if board[i][i] == symbol:
            c += 1
            if c == 3:
                return True
        else:
            c = 0

    return False


def VERTICAL(board, n, symbol):
    c = 0
    for i in range(n):
        for j in range(n):
            if board[j][i] == symbol:
                c += 1
                if c == 3:
                    return True
            else:
                c = 0
    return False


def WINNER(board, n):
    # The function analyzes the board's status in order to check if
    # the player using 'O's or 'X's has won the game

    # check vertically,check diagonally, check horizontally if there are three 'O' or three 'X'

    # check diagonally
    for i in ('O', 'X'):
        d = DIAGONAL(board, n, i)
        if d == True and i == 'O':
            return "user"
        if d == True and i == 'X':
            return "machine"

    # check horizontal
    for i in ('O', 'X'):
        h = HORIZONTAL(board, n, i)
        if h == True and i == 'O':
            return "user"
        if h == True and i == 'X':
            return "machine"
    # check vertical

    for i in ('O', 'X'):
        v = VERTICAL(board, n, i)
        if v == True and i == 'O':
            return "user"
        if v == True and i == 'X':
            return "machine"


def CHECK_WINNER(board, n):
    if WINNER(board, n) == "user":
        return 0
    if WINNER(board, n) == "machine":
        return 1


def MOVE(board, n, index, player):
    # The function draws the computer's move and updates the board.
    l3 = MAKE_LIST(board, n)
    if index in l3:  # try-except
        # iterate through the list board and replace the index by 'X' or 'O'
        for i in range(n):
            for j in range(n):
                if board[i][j] == index and (board[i][j] != 'X' and board[i][j] != 'O') and player == 1:
                    board[i][j] = 'O'
                    return 0
                if board[i][j] == index and (board[i][j] == 'X' and board[i][j] == 'O') and player == 1:
                    print("Cheating is not allowed!")
                    return 0

                if board[i][j] == index and (board[i][j] != 'X' and board[i][j] != 'O') and player == 2:
                    board[i][j] = 'X'
                    return 0
                if board[i][j] == index and (board[i][j] == 'X' or board[i][j] == 'O') and player == 2:
                    print("That's a cheating machine!")
                    return 0
    else:
        if player == 1:
            print("Can't make that move, user")
        if player == 2:
            print("Can't make that move, machine")
        return 0

def MAIN():
    board = GENERATE(3)
    n = len(board)
    print("Machine will make the first move at index 5")
    board[n // 2][n // 2] = 'X'
    DISPLAY(board, n)
    while True:
        randnum = random.randint(1, 9)  # for the machine

        if CHECK_WINNER(board, n) == 0:
            print("User is the winner!")
            DISPLAY(board, n)
            break
        if CHECK_WINNER(board, n) == 1:
            print("Machine is the winner!")
            DISPLAY(board, n)
            break

        print("Turn belongs to user")
        MOVE(board, n, int(input("Enter index: ")), 1)

        if CHECK_WINNER(board, n) == 0:
            print("User is the winner!")
            DISPLAY(board, n)
            break
        if CHECK_WINNER(board, n) == 1:
            print("Machine is the winner!")
            DISPLAY(board, n)
            break

        print("Turn belongs to the machine")
        MOVE(board, n, randnum, 2)
        print("Machine made its move at index ", randnum)
        DISPLAY(board, n)


MAIN()