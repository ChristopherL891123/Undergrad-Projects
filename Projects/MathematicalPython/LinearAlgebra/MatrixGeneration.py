#Special thanks to Dr. Charles Thangaraj
import random

def GENERATE(n,aroundDiag,Diag,MatElements):
    #set up the Matrix
    """Takes in 2 parameters: 1. the blank matrix to fill with generated values
    2. the number of rows and items(generates an NxN tridiagonal matrix) """
    Matrix = []
    #set up the matrix
    for i in range(n):
        Matrix.append([])
        for j in range(n):
            Matrix[i].append(MatElements)

    for j in range(0,n): # represents the previous row
        Matrix[j][j] = Diag
        for i in range(j+1,n): # represents the next row
            Matrix[j][i] = aroundDiag
            Matrix[i][j] = aroundDiag # stores -1 on the next row
            break
    return Matrix

def MatPrint(matrix, n):
    for i in range(n):
        print(matrix[i])
    return

def MultMatrix(a,b):
    """returns the prodcut of two square matrices"""
    c = []
    n = len(a)
    # set up the matrix
    for i in range(n):
        c.append([])
        for j in range(n):
            c[i].append(0)

    for i in range(n):
        for j in range(n):
            sum = 0
            for k in range(n):
                sum += a[i][k] * b[k][j]
            c[i][j] = sum

    return c


def RAND(size, Range):
    """RAND(size) Makes a random square matrix of a specified size and specified range, range should be a positive number"""

    R = []
    for i in range(size):
        R.append([])
        for j in range(size):
            R[i].append(random.randrange(-Range,Range))
        R[i][i] = 2
    return R
