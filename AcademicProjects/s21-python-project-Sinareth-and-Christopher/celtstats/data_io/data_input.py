import os
import parser as pa

# read data from files stored in disk, creates a dictionary and
# returns the dictionary to the caller
def read_files(files_path) :
    data_dictionary = {}

    fs = os.listdir(files_path + '/input')
    fs.sort()

    for file in fs:
        print('reading data from file: ' + file)
        doc_name = file[:file.find('.')]

        data_dictionary[doc_name] = []

        with open(files_path + '/input/' + file) as f:
            for line in f:
                if line[:4] != '####' and line.strip() != '':
                    data_dictionary[doc_name].append(line.replace('\n',''))

    return data_dictionary