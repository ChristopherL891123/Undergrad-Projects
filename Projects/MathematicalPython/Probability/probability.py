import random as r

def randNum(r1,r2,step=1):
    '''Generate random number from range r1 to r2'''
    return r.randrange(r1,r2)

def TOSS(n):
    '''Simulates a coin toss. n is number of coin flips.'''
    h = 0
    t = 0
    for i in range(n):
        rand = randNum(0,2) ## NOTE: picks a number from r1 to r2-1
        if rand == 1:
            h += 1
        elif rand == 0:
            t += 1

    return dict( ( ("Heads",h) , ("Tails",t) ) )

def fact(n):
    if n == 1:
        return 1
    return n * fact(n-1)

def permutation(n,r):
    return fact(n)/fact(n-r)

def combination(n,r):
    return fact(n)/(fact(r) * fact(n-r))
