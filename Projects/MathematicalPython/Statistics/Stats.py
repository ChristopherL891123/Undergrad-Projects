"""@author Christopher
Statistics computational functions"""


def isQuartile(l):
    if len(l) % 4 == 0:
        return True
    return False


def Quartile(l):
    if isQuartile(l):
        # set up the quartile matrix
        n = 4
        l1 = []
        for i in range(len(l) // 4):
            l1.append(l[n - 4:n])
            n += 4
        return l1

    else:
        print("This iterable is not a quartile...")
