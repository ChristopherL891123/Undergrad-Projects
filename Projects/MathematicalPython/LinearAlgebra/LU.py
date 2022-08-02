# The purpose of this file is to calculate the exact solutions of a matrix using LU decomposition.
# Special thanks to Dr. John Starner
import MatrixGeneration

def DECOMP(A, n, SHOW_LU):
    """Decomposes the A matrix into LU, using Gaussian elimination. Returns both L and U matrices"""

    # set up the L matrix
    L = []
    for i in range(n):
        L.append([])  # create ith  row in L
        for j in range(n):  # will add 0s to the ith row that was just created
            L[i].append(0)

    for i in range(n):
        L[i][i] = 1
    # set up the U matrix
    global U
    U = A.copy()

    # calculate the L and the U matrices

    for j in range(0, n - 1):  # j is meant to represent the previous row
        for i in range(j + 1, n):  # i is meant to represent the current row
            # make U[i][k] = 0
            factor = U[i][j] / U[j][j]
            L[i][j] = factor
            # adjust row i
            for k in range(0, n):  # k is meant to represent the current column
                U[i][k] = U[i][k] - (factor * U[j][k])

    # print L and U
    if SHOW_LU:
        print("U = ")
        MatrixGeneration.MatPrint(U, n)
        print("L = ")
        MatrixGeneration.MatPrint(L, n)

    return U, L


# forward elimination
def FORWARD_SUB(n, L, B, SHOW_y):
    """""Performs forward substitution using the L matrix and the b vector whose value is known due to pressure difference.
         Returns y vector"""

    # set up y
    y = []
    for i in range(n):
        y.append(0)
    for i in range(0, n):
        sum_row = 0  # meant to hold the sum of all the row i
        for j in range(0, i):  # from first element, ends with diagonal element.
            sum_row += L[i][j] * y[j]
        y[i] = (-1 * sum_row) + B[i]
    if SHOW_y:
        print("y =\n", y)
    return y


# backward elimination
def BACKWARD_SUB(y, n, U, SHOW_x):
    """Performs backward substitution using the calculated U matrix and the calculated Y vector. Returns x vector"""
    # set up x
    x = [0 for i in range(n)]

    for i in range(-1, -n - 1, -1):
        sum_row = 0  # meant to hold the sum of all the row i

        for j in range(i, 0):
            sum_row += U[i][j] * x[j]
        x[i] = ((-1 * sum_row) + y[i]) / U[i][i]
    if SHOW_x:
        print("x =\n", x)

    return x
