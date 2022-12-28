import os

def write_file(filePath, stream, fileName='document') :
    outputFile = filePath + '/texts/output/' + fileName + '.txt'
    print('writing output to file: ' + outputFile)
    outHandler = open(outputFile, "w+")

    outHandler.write(stream)
