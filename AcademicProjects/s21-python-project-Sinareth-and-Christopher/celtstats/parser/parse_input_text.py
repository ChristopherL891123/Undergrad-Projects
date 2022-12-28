import re
import string

# dictionaries
corpus_data = {}

# these dictionaries will be populated by invoking functions in builder
# but the functions will be invoked in the test1.py script
doc_word_index = {}
global_count_index = {}
word_count_index = {}
weighted_word_count_index = {}
doc_inverted_index = {}
doc_dictionary = {}
adjusted_index = {}


# list with stop words, these are common words that can be used to eliminate them
# from a corpus of texts
stop_words = ['i', 'a', 'am', 'about', 'an', 'are', 'as', 'at',#we remove these wrods because we are analysing text and they do not have much significance as they
      'be', 'by', 'com', 'for', 'from', 'he', 'how', 'in',     # repeat very requently.
      'is', 'it', 'of', 'on', 'or', 'she', 'that', 'the',
      'they', 'this', 'to', 'was', 'what', 'when', 'where',
      'who', 'will', 'with', 'the', 'www', 'you', 'we' ]

#
def text_2_tokens(stream) :
    tokens = []
    for line in stream :
        tokens += [line]
        print(line)

    return tokens

# example of using regular expressions, adapted from
# https://stackoverflow.com/questions/3939361/remve-specific-characters-from-a-string-in-python
# https://stackoverflow.com/questions/5843518/remove-all-special-characters-punctuation-and-spaces-from-string
# this function receives a string as input, removes punctuation marks
# and returns a cleaned string
def use_regular_expression(stream, option='alphanum') :
    newStrem = stream
    if option== 'alphanum' :
        newStream = re.sub(r'[^a-zA-Z0-9 ]',r'',stream)
    elif option == 'alpha' :
        newStream = re.sub(r'[^a-zA-Z ]',r'',stream)
    elif option == 'num' :
        newStream = re.sub(r'[^0-9 ]',r'',stream)
    elif option == 'symb' :
        newStream = re.sub(r'[a-zA-Z0-9]',r'',stream)
    return newStream
