import matplotlib.pyplot as plt
import sys
def main():
    with open("points.txt",'r') as f:

        # X_points = sys.argv[0]
        # Y_points = sys.argv[1]


        X_points = []
        Y_points = []

        n = f.readline().replace("\n",'')
        a = f.readline().replace('\n','').replace("[",'').replace("]",'').replace(' ',''). split(",")

        for x in a:
            X_points.append(float(x))

        b = f.readline().replace('\n','').replace("[",'').replace("]",'').replace(' ',''). split(",")

        for y in b:
            Y_points.append(float(y))


        plt.title("Graph for "+n+" discrete points")
        plt.margins(x=0,y=0) # removes the space between the margins and the line
        plt.xlabel("Velocity")
        plt.ylabel("y")
        plt.plot(X_points,Y_points) # plots the graph using x , y
        plt.show() # shows the graph

main()