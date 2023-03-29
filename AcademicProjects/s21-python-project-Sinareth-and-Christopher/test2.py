from turtle import *
import celtstats as cs
import celtstats.stats as stats
import celtstats.parser as par
import celtstats.builder as bld
import os
import  celtstats.data_io as do
import texts.input as txt
from texts.input import *
import pprint


print('***************************************************')
print('build dictionaries')
print('***************************************************')

#
# Team member B should use this script for testing each function #### Christopher is using this script.
# you are implementing, once completed move the invocation to main.py
# and continue with the next function here, once completed, move it
# to main.py and so on. This reduces the number of code conflicts
#
#
# invoking the function read_files() defined in the module celtstats.data_io
# reads data from files in the directory texts/input and populates a
# dictionary defined in cs.parser.corpus_data
par.corpus_data = cs.data_io.read_files('./texts')# reads all the words on the files and stores them in corpus data
pprint.pprint(par.corpus_data)

#
# # populates several containers by invoking functions defined in module parser
# # prints the contents of each one of them
# # par.doc_word_index = bld.build_doc_word_index(par.corpus_data)
# # par.global_count_index = bld.build_global_count_index(par.corpus_data)
# # pprint.pprint(par.global_count_index)
# # par.weighted_word_count_index = bld.build_weighted_word_count_index(par.corpus_data)
# # pprint.pprint(par.weighted_word_count_index)
# print(bld.build_doc_inverted_index(par.corpus_data))
# #STATS PART
# print('********************************STATS*******************************************')
# # print('\n' ,stats.freq_words_doc(par.corpus_data , 'movie_0001' , 'Nation'))
# # # print('\n', stats.rank_words_doc(par.corpus_data , 'movie_0001' , 'Nation'))
# # # print('\n' , stats.freq_docs(par.corpus_data , 'the'))
# # # print('\n' , stats.word_begin_letter_doc(par.corpus_data, "movie_0001", "b"))
# # print('\n' , stats.word_size_doc(par.corpus_data , 'movie_0001' , 5))
# # # print('\n' , stats.augmented_count_word(par.corpus_data , 'movie_0001' , 'the' , 0.5))
# # # print('\n' , stats.freq_words_size_doc(par.corpus_data , 'movie_0001' , 'the'))
# pprint.pprint("the result of the operation is: ", bld.build_adjusted_index(par.corpus_data))

