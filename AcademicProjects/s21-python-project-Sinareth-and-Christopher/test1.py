from turtle import *
import celtstats as cs
import celtstats.stats as stats
import celtstats.parser as par
import celtstats.builder as bld

import pprint

# Team member A should use this script for testing each function
# you are implementing, once completed move the invocation to main.py
# and continue with the next function here, once completed, move it
# to main.py and so on. This reduces the number of code conflicts

print('***************************************************')
print('build dictionaries')
print('***************************************************')

# invoking the function read_files() defined in the module celtstats.data_io
# reads data from files in the directory texts/input and populates a
# dictionary defined in cs.parser.corpus_data
par.corpus_data = cs.data_io.read_files('./texts')
pprint.pprint(par.corpus_data)

# populates several containers by invoking functions defined in module parser
# prints the contents of each one of them
par.doc_word_index = bld.build_doc_word_index(par.corpus_data)
pprint.pprint(par.doc_word_index)