from turtle import *

newXPosition = 720/-2
newYPosition = 675/-2
print('Window height:' + str(newXPosition))
print('Window width:' + str(newYPosition))

def writeText(theText, x, y) :
    speed("fast")
    penup()
    goto(newXPosition + x, newYPosition + y)
    pendown()
    pencolor('blue')
    write(theText, True, align="left", font=("Arial", 20, "normal"))


def draw_bar(x, y, height, width, color):

    speed("fast")
    pencolor(color)
    pensize(0)
    penup()
    setposition(newXPosition + x, newYPosition + y)
    pendown()
    fillcolor(color)
    begin_fill()

    forward(width)
    left(90)
    forward(height)
    left(90)
    forward(width)
    left(90)
    forward(height)
    left(90)
    end_fill()

    update() # Render image


def plot_top_k_freq_words_doc(document, k):
    print('function plot_topK_freq_words_doc')


def plot_bottom_k_freq_wors_doc(document, k):
    print('function plot_bottom_k_freq_wors_doc')


def plot_freq_word_size_doc(doc_list, word):
    print('function plot_freq_word_size_doc')


def plot_augmented_count_word(doc_list, word):
    print('function plot_augmented_count_word')
