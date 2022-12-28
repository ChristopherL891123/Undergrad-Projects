import celtstats as cs
import celtstats.stats as stats
import celtstats.data_io as io
import celtstats.parser as par
import celtstats.builder as bld
import pprint


# given a document name, returns the number of times word appears in that
# document.
def freq_words_doc(data, document, word):  #Christopher
    d = (bld.build_doc_word_index(data))
    d2 = d[document]#acessing value of d which is a nested dictionary and assigning it to d2
    return d2[word]#I'm returning the value of how many times that word appears in the document

# given a document name, returns the ranking of that word, based on the
# number of times it appears on that document (you have to sort by count and
# return the highest number)
def rank_words_doc(data, document, word): #Sinareth
    ranking = 0
    d = bld.build_word_count_index(data, document, word)
    for ranking in d:
        if ranking[0]:
            print(data,document,word)

    return ranking


#  given a document name, return a list of words in that document that begins with that letter.
def word_begin_letter_doc(data, document, letter): #Christopher
    words_list = []
    d = bld.build_doc_inverted_index(data)
    for word in d:
        if word[0] == letter:
            if document in d[word]:# cheking if the value matches the parameter, and if it does, the word is added to words_list#
                  words_list.append(word)#document is here to check if the document is inside the document
    return words_list


# given a document name, return the list of words in that document that ends
# with that letter.
# def word_end_letter_doc(data, document, letter):#Sinareth
#     words_list = []
#     words = bld.build_doc_inverted_index(data, document, letter)
#     for words_list in words:
#         if words_list[]:
#             print(data, document, letter)
#
#     return words_list


# given a document name, return a list with all words in that document of a
# given size in characters.
def word_size_doc(data, document, size):#Christopher
    words_list = []
    d = bld.build_doc_inverted_index(data)
    for word in d:
        if len(word) == size:
            if document in d[word]:
                words_list.append(word)
    return words_list


# given a word, return how many documents contain that word
def freq_docs_count(data, word):#Sinareth
    total = 0
    freq_doc = bld.build_doc_dictionary(data, document, letter)
    for total in freq_doc:
        if total[0]:
            print(data, document, letter)
    return total

# given a word, return a list of the documents where that word appears
def freq_docs(data, word):#Christopher
    document_list = []
    d = bld.build_doc_inverted_index(data)                                      #key is a word, value is the list of documents where the word appears
    return d[word]                                                              #printing the list of documents where the word appears




# given a count, return a list of documents that have that number of words,
# because the result can be long, return only k documents (where k is an integer)
# def freq_docs_words(data, count, k):#Sinareth
#     document_list = []
#     list_in_doc = bld.build_doc_dictionary(data, document, letter)
#     for document_list in list_in_doc:
#         if document_list[]:
#             print(data, document, letter)
#     return document_list

# given a document name, return the result of the number of times that word appear
# in that document divided by the number of unique words in that document.
def freq_words_size_doc(data, document, word):  #Christopher
    d = bld.build_weighted_word_count_index(data)                       # key is the document name, value is a nested dictionary where the key is the word and the value is the number of times the word appears divided by the unique words in that document where the nested key , the word, appears
    d2= d[document]                                              #adds the key of document to the variable d_2.
    return d2[word]                                                     #since d2 has the key of the document, the value of nested dictionary

# given a document and a word, return the following computation: factor + (
# factor * number of times that word appears in the document /
# number of times of the most common word in that document).
# def augmented_count_word(data, document, word, factor=0.5):     #Sinareth
#     computation = 0.0
#     aug_count = bld.build_adjusted_index(data, document, letter)
#         for computation in aug_count:
#             if computation[0.0]:
#                 print(data, document, letter)
#
#     return computation
#
