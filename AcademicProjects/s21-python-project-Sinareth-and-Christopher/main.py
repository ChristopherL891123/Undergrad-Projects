from turtle import *
import celtstats as cs
import celtstats.stats as stats
import celtstats.parser as par
import celtstats.builder as bld

import pprint

def main() :
    x = 100
    print('test a new line')
    y = 200
    print('***************************************************')
    print('build dictionaries')
    print('***************************************************')

    # invoking the function read_files() defined in the module celtstats.data_io
    # reads data from files in the directory texts/input and populates a
    # dictionary defined in cs.parser.corpus_data
    # this function has to be invoked only once here, after that all the words (tokens)
    # from the text files will be stored in the variable par.corpus_data, then use
    # that variable or another dictionary (the one that best fits each function)
    # for the next function.
    par.corpus_data = cs.data_io.read_files('./texts') #cs.data_io.read_files('./texts') reads teh files
    pprint.pprint(par.corpus_data)#this is being used to store the results of the cs.data_io.read_files('./texts') inside the dictionary par.corpus_data

    # populates several containers by invoking functions defined in module parser
    # prints the contents of each one of them
    
    # par.doc_word_index = bld.build_doc_word_index(par.corpus_data)
    # pprint.pprint(par.doc_word_index)

    # par.global_count_index = bld.build_global_count_index(par.corpus_data)
    # pprint.pprint(par.global_count_index)
    #
    # par.word_count_index = bld.build_word_count_index(par.corpus_data)
    # pprint.pprint(par.word_count_index)
    #
    par.weighted_word_count_index = bld.build_weighted_word_count_index(par.corpus_data)
    pprint.pprint(par.weighted_word_count_index)

    # par.doc_inverted_index = bld.build_doc_inverted_index(par.corpus_data)
    # pprint.pprint(par.doc_inverted_index)
    #
    # par.doc_dictionary = bld.build_doc_dictionary(par.corpus_data)
    # pprint.pprint(par.doc_dictionary)
    #
    # par.adjusted_index = bld.build_adjusted_index(par.corpus_data)
    # pprint.pprint(par.adjusted_index)
    #
    # print('***************************************************')
    # print('computing stats')
    # print('***************************************************')
    #
    # # print(stats.freq_docs(par.corpus_data, 'city'))
    # print(stats.freq_words_size_doc(par.corpus_data , 'movie_0001' , 'the'))
    # print(stats.freq_words_doc(par.corpus_data, 'movie_0001', 'bartender'))
    # print(stats.word_begin_letter_doc(par.corpus_data, 'movie_0001', 'a'))
    # print()
    # # # invoking the function drawBar defined in the module celtstats.viz
    # # print('***************************************************')
    # # print('visualization')
    # # print('***************************************************')
    # # cs.viz.draw_bar(15, 50, 70, 10, 'blue')
    # # cs.viz.writeText('houston', 15, 30)
    # #
    # # # makes the the plot stop, comment this line when working on your code
    # # exitonclick()

main()
