import celtstats.parser as par
import pprint
import celtstats.builder as bld

# Build a list from the original list and removes stop words.
# Stop words are defined in module parser
def remove_stop_words(data):
    list = []                                                   #pre-defined

    for a in data:
        if a not in par.stop_words:
            list.append(a)

    return list

# Using a list, builds a dictionary where the key is the name of the document, and the value
# is another dictionary, where the key is a word in that document and the value is a number of how
# many times that word appears in that document.
def build_doc_word_index(data):
    d = {}
    for document, lines in data.items():
        inner_dict = {}
        for line in lines:
            words_in_line = line.split(' ')
            for word in words_in_line:
                if word in inner_dict:                      #pre-defined
                    inner_dict[word] += 1
                else:
                    inner_dict[word] = 1

            d[document] = inner_dict #prints the dictionary with the inner dictionary, that will change each time the main loop ends. So its going to print the key and value for the document.
    # print( 'd is ', d)
    return d

# Build dictionary where the key is a word in the entire corpus and the value
# is the number of times that word appears in the entire corpus.
def build_global_count_index(data):
    d = {}
    for document , text in data.items():
        for lines in text:
            words = lines.split(' ')
            for word in words:                                  #we did this as a class
                if word in d:
                    d[word] += 1
                else:
                    d[word] = 1
    return d # return the value of d


# Build a dictionary where the key is the name of the document, and the value is another dictionary,
# where the key is a word in that document and the value is a number of how many times that word appears
# in that document divided by the total number of words in that document.
def build_word_count_index(data):#Sinareth
    d = {}
    for document, lines in data.items(): #for key, value in data.items():  # print (key, value)
        d_internal = {}
        for line in lines:
            word_count = line.split(' ')    # similar to line = line.split(' ') from code above
        wds_count = len(d_internal)
        for word in word_count:
                if word in d_internal:
                    d_internal[word] += 1
                else:
                    d_internal[word] = 1
                    print(word, d_internal[word])            #https://youtu.be/lLbyEYjU55A
        d[document] = d_internal
        print(wds_count)
    return d
# # def movies_number(data):
#     for movies, notes in data.items():
#         print(movies % movies)





# Build a dictionary where the key is the name of the document, and the value is another dictionary,
# where the key is a word in that document and the value is a number of how many times that word appears
# in that document divided by the number of unique words in that document appears.
def build_weighted_word_count_index(data): #Christopher
    d = {}
    unique_word = 0
    for document, text in data.items():
        d_2 = {}
        unique_word = 0
        for lines in text:
            words = lines.split(' ')
            for word in words:
                if word in d_2:
                    d_2[word] += 1
                else:
                    d_2[word] = 1

        for keys, value in d_2.items():
             if d_2[keys] == 1:
              unique_word += 1
        for keys , value in d_2.items():
            d_2[keys] = d_2[keys] / unique_word     #dividing the current value of the key by the number of unique words and assigning that as the value of d_2
        d[document] = d_2
    return d

# Build dictionary where the key is a word and the value is a list of all documents where that word appears.
def build_doc_inverted_index(data): #looks for each word(key) and tells where each word appears                 #Sinareth
    d = {}
    for document, lines in data.items():  # iterating through the contents of data
        print(document)
        document_list = []
        for line in lines:
            doc_inverted = line.split(' ')  # splitting the words into strings
            for word in doc_inverted:  # iterating through the list doc_inverted
                d[word] = []

    for document, lines in data.items():

        document_list = []
        for line in lines:
            doc_inverted = line.split(' ')
            for word in doc_inverted:
                if document not in d[word]: # if document not in list, add that document to d[word]
                    d[word].append(document)
    return d

# Build dictionary where the key is the document name and the value is a list of all unique words in that document
def build_doc_dictionary(data): #Christopher
    d = {}
    for document, text in data.items():
        unique_word_list = []
        d_2 = {}
        for lines in text:
            words = lines.split(' ')
            for word in words:
                if word in d_2:
                    d_2[word] += 1
                else:
                    d_2[word] = 1

        for keys, value in d_2.items():
            if d_2[keys] == 1:
                unique_word_list.append(d_2[keys])
        d[document] = unique_word_list

    return d


# Build a dictionary where the key is each unique word in the corpus and the value is computed as
# Log (total number of documents in corpus / number of documents containing that word)
# use the log function in the math package

import math
def build_adjusted_index(data): #Sinareth
    d = {}

    for adj, lines in data.items():
        # math.log(1)
        d_unique = {}
        for line in lines:
            adjusted_index = line.split(' ')
            for word in adjusted_index:
                if word in d:
                    d_unique[word] += 1
                else:
                    d_unique[word] = 1
        d[adj] = d_unique
        print(math.log(1))
    return d


